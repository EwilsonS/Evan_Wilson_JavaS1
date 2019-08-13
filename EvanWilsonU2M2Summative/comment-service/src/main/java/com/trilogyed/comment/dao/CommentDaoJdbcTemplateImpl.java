package com.trilogyed.comment.dao;

import com.trilogyed.comment.model.Comment;
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
public class CommentDaoJdbcTemplateImpl implements CommentDao {

    // init jdbc
    private JdbcTemplate jdbc;

    // prepared statements
    private static final String INSERT_COMMENT = "insert into comment (post_id, create_date, commenter_name, comment) value(?,?,?,?)";
    private static final String SELECT_COMMENT = "select * from comment where comment_id=?";
    private static final String SELECT_ALL_COMMENTS = "select * from comment";
    private static final String SELECT_COMMENTS_BY_POST_ID = "select * from comment where post_id=?";
    private static final String UPDATE_COMMENT = "update comment set post_id=?, create_date=?, commenter_name=?, comment=? where comment_id=?";
    private static final String DELETE_COMMENT = "delete from comment where comment_id=?";

    // constructor injection
    @Autowired
    public CommentDaoJdbcTemplateImpl(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    // implement


    @Override
    public List<Comment> getCommentsByPostId(Integer post_id) {
        try {
            return jdbc.query(SELECT_COMMENTS_BY_POST_ID, this::mapRowToComment, post_id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    @Transactional
    public Comment createComment(Comment comment) {
        jdbc.update(
                INSERT_COMMENT,
                comment.getPostId(),
                comment.getCreateDate(),
                comment.getCommenterName(),
                comment.getComment());
        comment.setCommentId(jdbc.queryForObject("select LAST_INSERT_ID()", Integer.class));
        return comment;
    }

    @Override
    public Comment getComment(Integer id) {
        if(id<1)
            throw new IllegalArgumentException("Comment IDs begin at \"1\"");
        return jdbc.queryForObject(SELECT_COMMENT, this::mapRowToComment, id);
    }

    @Override
    public List<Comment> getAllComments() {
        return jdbc.query(SELECT_ALL_COMMENTS, this::mapRowToComment);
    }

    @Override
    @Transactional
    public void updateComment(Comment comment) {
        jdbc.update(
                UPDATE_COMMENT,
                comment.getPostId(),
                comment.getCreateDate(),
                comment.getCommenterName(),
                comment.getComment(),
                comment.getCommentId());
    }


    @Override
    public void deleteComment(Integer id) {
        jdbc.update(DELETE_COMMENT, id);
    }

    // mapper
    private Comment mapRowToComment(ResultSet rs, int rowNum) throws SQLException {
        Comment comment = new Comment();
        comment.setCommentId(rs.getInt("comment_id"));
        comment.setPostId(rs.getInt("post_id"));
        comment.setCreateDate(rs.getDate("create_date").toLocalDate());
        comment.setCommenterName(rs.getString("commenter_name"));
        comment.setComment(rs.getString("comment"));
        return comment;
    }
}
