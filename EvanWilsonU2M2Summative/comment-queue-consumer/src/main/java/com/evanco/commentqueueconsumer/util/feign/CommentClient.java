package com.evanco.commentqueueconsumer.util.feign;

import com.evanco.commentqueueconsumer.util.messages.Comment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "comment-service")
public interface CommentClient {

    @PostMapping(value = "/comments")
    public Comment createComment(@RequestBody Comment comment);

    @PutMapping(value = "/comments/{id}")
    public void updateComment(@RequestBody Comment newComment, @PathVariable("id") Integer id);
}
