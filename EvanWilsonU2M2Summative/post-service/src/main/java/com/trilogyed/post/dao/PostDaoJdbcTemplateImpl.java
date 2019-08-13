package com.trilogyed.post.dao;

import com.trilogyed.post.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

@Repository
public class PostDaoJdbcTemplateImpl implements PostDao{

    // init jdbc
    private JdbcTemplate jdbc;

    // prepared statements
    private static final String INSERT_POST = "insert into post (post_date, poster_name, post) values (?,?,?)";
    private static final String SELECT_POST = "select * from post where post_id=?";
    private static final String SELECT_ALL = "select * from post";
    private static final String SELECT_POSTS_BY_POSTER_NAME = "select * from post where poster_name=?";
    private static final String UPDATE_POST = "update post set post_date=?, poster_name=?, post=? where post_id=?";
    private static final String DELETE_POST = "delete from post where post_id=?";

    // constructor injection
    @Autowired
    public PostDaoJdbcTemplateImpl(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    // implementation
    @Override
    public List<Post> getByPosterName(String name) {
        try{
            return jdbc.query(SELECT_POSTS_BY_POSTER_NAME, this::mapRowToPost, name);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    @Transactional
    public Post createPost(Post post) {
        post.setPostDate(LocalDate.now());
        jdbc.update(
                INSERT_POST,
                post.getPostDate(),
                post.getPosterName(),
                post.getPost());
        post.setPostID(jdbc.queryForObject("select LAST_INSERT_ID()", Integer.class));
        return post;
    }

    @Override
    public Post getPost(int id) {
        if(id < 1)
            throw new IllegalArgumentException("Post IDs begin at \"1\"");
        return jdbc.queryForObject(SELECT_POST, this::mapRowToPost, id);
    }

    @Override
    public List<Post> getAllPosts() {
        return jdbc.query(SELECT_ALL, this::mapRowToPost);
    }

    @Override
    @Transactional
    public void updatePost(Post post) {
        post.setPostDate(LocalDate.now());
        jdbc.update(
                UPDATE_POST,
                post.getPostDate(),
                post.getPosterName(),
                post.getPost(),
                post.getPostID());
    }

    @Override
    public void deletePost(int id) {
        jdbc.update(DELETE_POST, id);
    }

    // mapper
    private Post mapRowToPost(ResultSet rs, int rowNum) throws SQLException{
        Post post = new Post();
        post.setPostID(rs.getInt("post_id"));
        post.setPostDate(rs.getDate("post_date").toLocalDate());
        post.setPosterName(rs.getString("poster_name"));
        post.setPost(rs.getString("post"));
        return post;
    }
}
