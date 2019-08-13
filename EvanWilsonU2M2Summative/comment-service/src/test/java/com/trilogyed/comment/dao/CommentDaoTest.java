package com.trilogyed.comment.dao;

import com.trilogyed.comment.model.Comment;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentDaoTest {

    @Autowired
    private CommentDao dao;

    @Before
    public void setUp() throws Exception {
        dao.getAllComments().stream().forEach(comment -> dao.deleteComment(comment.getCommentId()));
    }

    @Test
    public void createGetComment() {
        Comment comment = new Comment();
        comment.setPostId(5);
        comment.setCommenterName("Evan");
        comment.setCreateDate(LocalDate.now());
        comment.setComment("This is a comment baby!!!");

        // add
        comment = dao.createComment(comment);

        // get
        Comment comment2 = dao
                .getComment(comment.getCommentId());
        assertEquals(comment.getCreateDate(), comment2.getCreateDate());
    }

    //    @Test(expected = LazyInitializationException.class) // Id not found
    public void deleteCommentById() {
        Comment comment = new Comment();
        comment.setPostId(5);
        comment.setCommenterName("Evan");
        comment.setCreateDate(LocalDate.now());
        comment.setComment("This is a comment baby!!!");
        comment = dao.createComment(comment);

        Comment comment2 = dao
                .getComment(comment.getCommentId());
        assertEquals(comment.getCreateDate(), comment2.getCreateDate());

        // delete
        dao.deleteComment(comment.getCommentId());
        assertNull(dao.getComment(comment.getCommentId()));
    }


    @Test
    public void updateComment() {
        Comment comment = new Comment();
        comment.setPostId(5);
        comment.setCommenterName("Evan");
        comment.setCreateDate(LocalDate.now());
        comment.setComment("This is a comment baby!!!");
        comment = dao.createComment(comment);

        comment.setCommenterName("Wilson");
        comment.setPostId(9);
        dao.updateComment(comment);

        assertNotEquals("Evan", dao.getComment(comment.getCommentId()).getCommenterName());

    }


    @Test
    public void getAllGetByPostId() {
        Comment comment = new Comment();
        comment.setPostId(7);
        comment.setCommenterName("Evan");
        comment.setCreateDate(LocalDate.now());
        comment.setComment("This is a comment baby!!!");
        comment = dao.createComment(comment);

        Comment comment2 = new Comment();
        comment2.setPostId(5);
        comment2.setCommenterName("Evan");
        comment2.setCreateDate(LocalDate.now());
        comment2.setComment("This is a comment baby!!!");
        comment2 = dao.createComment(comment2);

        // get all
        assertEquals(2, dao.getAllComments().size());

        // get by post id
        List<Comment> list = new ArrayList<>();
        list.add(comment);
        assertEquals(list, dao.getCommentsByPostId(7));
    }
}