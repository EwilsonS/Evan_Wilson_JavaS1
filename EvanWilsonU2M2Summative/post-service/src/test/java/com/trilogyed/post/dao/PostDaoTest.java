package com.trilogyed.post.dao;

import com.trilogyed.post.model.Post;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostDaoTest {

    @Autowired
    private PostDao dao;

    @Before
    public void setUp() throws Exception {
        dao.getAllPosts().stream().forEach(post -> dao.deletePost(post.getPostID()));
    }

    @Test
    public void createGetDeletePost() {
        Post post = new Post();
        post.setPostDate(LocalDate.now());
        post.setPosterName("Evan Wilson");
        post.setPost("This is a post to the Stwitter platform");

        // post
        post = dao.createPost(post);

        //get
        Post post2 = dao.getPost(post.getPostID());
        assertEquals(post.getPostID(), post2.getPostID());

        // delete
        dao.deletePost(post.getPostID());
        assertEquals(0, dao.getAllPosts().size());
    }

    @Test
    public void updatePost() {
        Post post = new Post();
        post.setPostDate(LocalDate.now());
        post.setPosterName("Evan Wilson");
        post.setPost("This is a post to the Stwitter platform");
        post = dao.createPost(post);

        post.setPostID(post.getPostID());
        post.setPosterName("Scott Wilson");
        dao.createPost(post);

        assertEquals("Scott Wilson", dao.getPost(post.getPostID()).getPosterName());
    }


    @Test
    public void getAllPosts() {
        Post post = new Post();
        post.setPostDate(LocalDate.now());
        post.setPosterName("Evan Wilson");
        post.setPost("This is a post to the Stwitter platform");
        dao.createPost(post);

        Post post1 = new Post();
        post1.setPostDate(LocalDate.now());
        post1.setPosterName("Evan Wilson");
        post1.setPost("This is a post to the Stwitter platform");
        dao.createPost(post1);

        assertEquals(2, dao.getAllPosts().size());
    }

    @Test
    public void getAllPostsByPoster() {
        Post post = new Post();
        post.setPostDate(LocalDate.now());
        post.setPosterName("Evan Wilson");
        post.setPost("This is a post to the Stwitter platform");
        dao.createPost(post);

        Post post1 = new Post();
        post1.setPostDate(LocalDate.now());
        post1.setPosterName("Scott");
        post1.setPost("This is a post to the Stwitter platform");
        dao.createPost(post1);

        Post post2 = new Post();
        post2.setPostDate(LocalDate.now());
        post2.setPosterName("Scott");
        post2.setPost("This is a post2 to the Stwitter platform");
        dao.createPost(post2);

        Post post3 = new Post();
        post3.setPostDate(LocalDate.now());
        post3.setPosterName("Scott");
        post3.setPost("This is a post to the Stwitter platform");
        dao.createPost(post3);

        assertEquals(3, dao.getByPosterName("Scott").size());
    }
}