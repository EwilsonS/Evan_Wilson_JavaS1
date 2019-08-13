package com.trilogyed.stwitter.controller;

import com.trilogyed.stwitter.service.ServiceLayer;
import com.trilogyed.stwitter.viewmodel.CommentViewModelReq;
import com.trilogyed.stwitter.viewmodel.CommentViewModelRes;
import com.trilogyed.stwitter.viewmodel.PostViewModelReq;
import com.trilogyed.stwitter.viewmodel.PostViewModelRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
@CacheConfig(cacheNames = {"posts"})
public class StwitterController {

    @Autowired
    private ServiceLayer service;

    public StwitterController(ServiceLayer service) {
        this.service = service;
    }

    // create post
    @CachePut(key = "#result.getPostId()")
    @PostMapping(value = "/posts")
    @ResponseStatus(HttpStatus.CREATED)
    public PostViewModelRes createPost(@RequestBody PostViewModelReq req){
        System.out.println("CREATING POST");
        return service.createPost(req);
    }

    // get post
    @Cacheable
    @GetMapping(value = "/posts/{post_id}")
    @ResponseStatus(HttpStatus.OK)
    public PostViewModelRes getPost(@PathVariable("post_id") Integer post_id){
        System.out.println("GETTING POST FOR POST ID: " + post_id + " (this line should display only once upon multiple requests)");
        return service.getPost(post_id);
    }

    // get all posts
    @GetMapping("/posts")
    @ResponseStatus(HttpStatus.OK)
    public List<PostViewModelRes> getAllPosts(){
        return service.getAllPosts();
    }

    // get posts by poster name
    @GetMapping("/posts/user/{poster_name}")
    @ResponseStatus(HttpStatus.OK)
    public List<PostViewModelRes> getPostsByPosterName(@PathVariable("poster_name") String poster_name ){
        return service.getPostsByPoster(poster_name);
    }

    // delete posts/comments/cache
    @CacheEvict
    @DeleteMapping(value = "posts/{post_id}")
    public String deltePost(@PathVariable("post_id") Integer post_id){
        System.out.println("DELETING POST ID:" + post_id);
        return service.deletePosts(post_id);
    }

    // create comment
    @PostMapping("/comments")
    @ResponseStatus(HttpStatus.CREATED)
    public String createComment(@RequestBody CommentViewModelReq cvm){
       return service.createComment(cvm);
    }

    //update comment
    @PutMapping("/comments/{comment_id}")
    @ResponseStatus(HttpStatus.OK)
    public String updateComment(@RequestBody CommentViewModelReq cvm, @PathVariable("comment_id") Integer comment_id){
        return service.updateComment(cvm, comment_id);
    }

    // get comments by post id
    @GetMapping(value = "/comments/postId/{post_id}")
    @ResponseStatus(HttpStatus.OK)
    public List<CommentViewModelRes> getByPostId(@PathVariable("post_id") Integer id){
        return service.getCommentsByPostId(id);
    }
}
