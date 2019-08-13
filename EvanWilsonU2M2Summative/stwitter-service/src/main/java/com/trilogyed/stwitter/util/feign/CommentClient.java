package com.trilogyed.stwitter.util.feign;

import com.trilogyed.stwitter.model.Comment;
import com.trilogyed.stwitter.viewmodel.CommentViewModelRes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "comment-service")
public interface CommentClient {

    // get comments by post id
    @GetMapping(value = "/comments/postId/{post_id}")
    public List<Comment> getCommentsByPostId(@PathVariable("post_id") Integer post_id);

    // delete comment for cascading
    @DeleteMapping(value = "/comments/{comment_id}")
    public void deleteComment(@PathVariable("comment_id") Integer comment_id);




}
