package com.trilogyed.comment.dao;

import com.trilogyed.comment.model.Comment;

import java.util.List;

public interface CommentDao {
    List<Comment> getCommentsByPostId(Integer post_id);

    Comment createComment(Comment comment);

    Comment getComment(Integer id);

    List<Comment> getAllComments();

    void updateComment(Comment comment);

    void deleteComment(Integer id);

}
