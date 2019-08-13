package com.trilogyed.stwitter.util.feign;

import com.trilogyed.stwitter.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("post-service")
public interface PostClient {

    // create post
    @PostMapping(value = "/posts")
    public Post createPost(@RequestBody Post post);

    // get all posts
    @GetMapping(value = "/posts")
    public List<Post> getAllPosts();

    // get posts by poster name
    @GetMapping(value = "/posts/user/{poster_name}")
    public List<Post> getPostsByPosterName(@PathVariable("poster_name") String post_name);

    // get post
    @GetMapping(value = "/posts/{id}")
    public Post getPost(@PathVariable("id") Integer id);

    // delete post
    @DeleteMapping(value = "/posts/{id}")
    public void deletePost(@PathVariable("id") Integer id);
}
