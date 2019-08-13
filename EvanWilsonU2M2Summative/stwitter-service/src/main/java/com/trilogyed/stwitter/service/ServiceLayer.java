package com.trilogyed.stwitter.service;

import com.trilogyed.stwitter.model.Comment;
import com.trilogyed.stwitter.model.Post;
import com.trilogyed.stwitter.util.feign.CommentClient;
import com.trilogyed.stwitter.util.feign.PostClient;
import com.trilogyed.stwitter.viewmodel.CommentViewModelReq;
import com.trilogyed.stwitter.viewmodel.CommentViewModelRes;
import com.trilogyed.stwitter.viewmodel.PostViewModelReq;
import com.trilogyed.stwitter.viewmodel.PostViewModelRes;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceLayer {

    private static final String EXCHANGE = "comment-exchange";
    private static final String ROUTING_KEY = "comment.create.comment.service";

    @Autowired
    private CommentClient commentClient;

    @Autowired
    private PostClient postClient;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public ServiceLayer(RabbitTemplate rabbitTemplate, CommentClient commentClient, PostClient postClient) {
        this.rabbitTemplate = rabbitTemplate;
        this.commentClient = commentClient;
        this.postClient = postClient;
    }

    // create post
    public PostViewModelRes createPost(PostViewModelReq req) {

        Post post = new Post();
        post.setPosterName(req.getPosterName());
        post.setPost(req.getPost());
        post = postClient.createPost(post);

        PostViewModelRes res = new PostViewModelRes();
        res.setPostId(post.getPostID());
        res.setPosterName(req.getPosterName());
        res.setPost(post.getPost());
        res.setCommentList(getCommentsByPostId(post.getPostID()));

        return res;
    }

    // get post
    public PostViewModelRes getPost(Integer post_id){
        Post post = postClient.getPost(post_id);
        PostViewModelRes pvmRes = new PostViewModelRes();
        pvmRes.setPostId(post_id);
        pvmRes.setPosterName(post.getPosterName());
        pvmRes.setPostDate(post.getPostDate());
        pvmRes.setPost(post.getPost());
        pvmRes.setCommentList(getCommentsByPostId(post_id));

        return pvmRes;
    }

    // get all posts
    public List<PostViewModelRes> getAllPosts() {
        List<PostViewModelRes> pvmResList = new ArrayList<>();

        postClient.getAllPosts().stream()
                .forEach(post -> {
                    PostViewModelRes res = new PostViewModelRes();
                    res.setPosterName(post.getPosterName());
                    res.setPostId(post.getPostID());
                    res.setPost(post.getPost());
                    res.setCommentList(getCommentsByPostId(post.getPostID()));
                    pvmResList.add(res);
                });

        return pvmResList;
    }

    // get posts by poster
    public List<PostViewModelRes> getPostsByPoster(String name) {
        List<PostViewModelRes> pvmResList = new ArrayList<>();

        postClient.getPostsByPosterName(name).stream()
                .forEach(post -> {
                    PostViewModelRes res = new PostViewModelRes();
                    res.setPostId(post.getPostID());
                    res.setPosterName(post.getPosterName());
                    res.setPostDate(post.getPostDate());
                    res.setPost(post.getPost());
                    res.setCommentList(getCommentsByPostId(post.getPostID()));
                    pvmResList.add(res);
                });

        return pvmResList;
    }

    // delete post
    public String deletePosts(Integer post_id){
        commentClient.getCommentsByPostId(post_id)
                .stream()
                .forEach(comment -> commentClient.deleteComment(comment.getCommentId()));
        postClient.deletePost(post_id);
        return "Post and all associated comments have been DELETED";
    }

    // create comment
    public String createComment(CommentViewModelReq cvm) {
        Comment comment = new Comment(
                cvm.getCommentId(),
                cvm.getPostId(),
                cvm.getCommenterName(),
                cvm.getComment());

        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, comment);
        System.out.println("Sent to queue: " + comment);
        return "New comment sent to queue";

    }

    // update comment
    public String updateComment(CommentViewModelReq cvm, Integer id) {
        Comment comment = new Comment(
                id,
                cvm.getPostId(),
                cvm.getCommenterName(),
                cvm.getComment());

        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, comment);
        System.out.println("Sent to queue: " + comment);
        return "Updated comment sent to queue";

    }

    // get comments by post_id
    public List<CommentViewModelRes> getCommentsByPostId(Integer post_id){
        List<CommentViewModelRes> cvmresList = new ArrayList<>();
        commentClient.getCommentsByPostId(post_id).stream()
                .forEach(comment -> {
                    CommentViewModelRes cvmres = new CommentViewModelRes();
                    cvmres.setCommenterName(comment.getCommenterName());
                    cvmres.setPostId(comment.getPostId());
                    cvmres.setCreateDate(comment.getCreateDate());
                    cvmres.setComment(comment.getComment());
                    cvmres.setCommentId(comment.getCommentId());

                    cvmresList.add(cvmres);
                });
        return cvmresList;
    }
}
