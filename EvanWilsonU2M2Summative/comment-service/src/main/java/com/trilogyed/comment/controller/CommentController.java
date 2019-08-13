package com.trilogyed.comment.controller;

import com.trilogyed.comment.dao.CommentDao;
import com.trilogyed.comment.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    // Dependency injection - The container provides an instance of the object
    @Autowired
    private CommentDao dao;

    // Create
    @PostMapping(value = "/comments")
    public Comment createComment(@RequestBody Comment post) {
        return dao.createComment(post);
    }

    // Get
    @GetMapping(value = "/comments/{id}")
    public Comment getComment(@PathVariable("id") Integer id) {
        return dao.getComment(id);
    }

    // Update
    @PutMapping(value = "/comments/{id}")
    public void updateComment(@RequestBody Comment newComment, @PathVariable("id") Integer id) {
        Comment comment = dao.getComment(id);
        comment.setCommentId(id);
        if(newComment.getCommenterName() != null){
            comment.setCommenterName(newComment.getCommenterName());
        }
        if(newComment.getComment() != null){
            comment.setComment(newComment.getComment());
        }
        if(newComment.getPostId() != null){
            comment.setPostId(newComment.getPostId());
        }
        dao.updateComment(comment);
    }

    // Delete
    @DeleteMapping(value = "/comments/{id}")
    public void deleteComment(@PathVariable("id") Integer id) {
        dao.deleteComment(id);
    }

    // Get all
    @GetMapping(value = "/comments")
    public List<Comment> getAllComments(){
        return dao.getAllComments();
    }

    // Get all
    @GetMapping(value = "/comments/postId/{post_id}")
    public List<Comment> getCommentsByPostId(@PathVariable("post_id") Integer post_id){
        return dao.getCommentsByPostId(post_id);
    }
}
