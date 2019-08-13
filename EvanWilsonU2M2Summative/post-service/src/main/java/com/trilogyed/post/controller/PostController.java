package com.trilogyed.post.controller;

import com.trilogyed.post.dao.PostDao;
import com.trilogyed.post.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    // Dependency injection - The container provides an instance of the object
    @Autowired
    private PostDao dao;

    // Create
    @PostMapping(value = "/posts")
    public Post createPost(@RequestBody Post post) {
        return dao.createPost(post);
    }

    // Get
    @GetMapping(value = "/posts/{id}")
    public Post getPost(@PathVariable("id") Integer id) {
        return dao.getPost(id);
    }

    // Update
    @PutMapping(value = "/posts/{id}")
    public void updatePost(@RequestBody Post newPost, @PathVariable("id") Integer id) {
        Post post = dao.getPost(id);
        if(newPost.getPostDate() != null){
            post.setPostDate(newPost.getPostDate());
        }
        if(newPost.getPosterName() != null){
            post.setPosterName(newPost.getPosterName());
        }
        if(newPost.getPost() != null){
            post.setPost(newPost.getPost());
        }
        post.setPostID(id);
        dao.updatePost(post);
    }

    // Delete
    @DeleteMapping(value = "/posts/{id}")
    public void deletePost(@PathVariable("id") Integer id) {
        dao.deletePost(id);
    }

    // Get all
    @GetMapping(value = "/posts")
    public List<Post> getAllPosts(){
        return dao.getAllPosts();
    }

    // Get all
    @GetMapping(value = "/posts/user/{poster_name}")
    public List<Post> getAllPostsByPoster(@PathVariable("poster_name") String poster_name){
        return dao.getByPosterName(poster_name);
    }
}
