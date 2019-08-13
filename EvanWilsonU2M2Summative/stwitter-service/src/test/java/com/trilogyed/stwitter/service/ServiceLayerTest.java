package com.trilogyed.stwitter.service;

import com.trilogyed.stwitter.model.Comment;
import com.trilogyed.stwitter.model.Post;
import com.trilogyed.stwitter.util.feign.CommentClient;
import com.trilogyed.stwitter.util.feign.PostClient;
import com.trilogyed.stwitter.viewmodel.CommentViewModelReq;
import com.trilogyed.stwitter.viewmodel.PostViewModelReq;
import com.trilogyed.stwitter.viewmodel.PostViewModelRes;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class ServiceLayerTest {
    @InjectMocks
    ServiceLayer service;
    @Mock
    CommentClient commentClient;
    @Mock
    PostClient postClient;
    @Mock
    RabbitTemplate rabbitTemplate;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        setUpPostClientMock();
        setUpRabbitTemplateMock();
        setUpCommentClientMock();
    }

    // -----------------------------------------------------------------
    // Mock set up
    // -----------------------------------------------------------------
    private void setUpPostClientMock() {
        Post post = new Post();
        post.setPostID(1);
        post.setPostDate(LocalDate.now());
        post.setPosterName("Evan");
        post.setPost("This is a mock post");

        Post post2 = new Post();
        post2.setPosterName("Evan");
        post2.setPost("This is a mock post");

        List<Post> postList = new ArrayList<>();
        postList.add(post);

        doReturn(post).when(postClient).createPost(post2);
        doReturn(post).when(postClient).getPost(1);
        doReturn(postList).when(postClient).getAllPosts();
        doReturn(postList).when(postClient).getPostsByPosterName("Evan");
    }

    public void setUpCommentClientMock() {
        Comment comment = new Comment();
        comment.setCommentId(1);
        comment.setCommenterName("Scott");
        comment.setCreateDate(LocalDate.now());
        comment.setPostId(5);
        comment.setComment("This is a mock comment");

        Comment comment2 = new Comment();
        comment2.setCommenterName("Scott");
        comment2.setPostId(5);
        comment2.setComment("This is a mock comment");

        List<Comment> commentList = new ArrayList<>();
        commentList.add(comment);

        doNothing().when(rabbitTemplate).convertAndSend(comment2);
        doReturn(commentList).when(commentClient).getCommentsByPostId(5);
    }

    private void setUpRabbitTemplateMock() {
        RabbitTemplate rabbitTemplate = new RabbitTemplate();
    }

    // -----------------------------------------------------------------
    // Tests
    // -----------------------------------------------------------------
    @Test
    public void createPost() {
        PostViewModelReq req = new PostViewModelReq();
        req.setPosterName("Evan");
        req.setPost("This is a mock post");

        Post post = new Post();
        post.setPosterName(req.getPosterName());
        post.setPost(req.getPost());
        post = postClient.createPost(post);

        PostViewModelRes res = new PostViewModelRes();
        res.setPostId(post.getPostID());
        res.setPosterName(req.getPosterName());
        res.setPost(post.getPost());
        res.setCommentList(service.getCommentsByPostId(post.getPostID()));

        // add post
        service.createPost(req);

        // get post
        PostViewModelRes res2 = service.getPost(post.getPostID());
        assertEquals("Evan", res2.getPosterName());


    }

    @Test
    public void getAllPosts() {
        assertEquals(1, postClient.getAllPosts().size());
    }

    @Test(expected = AssertionError.class)
    public void getPostsByPoster() {
        assertEquals(1, postClient.getPostsByPosterName("Evan").size());
        assertEquals(1, postClient.getPostsByPosterName("%56546$===__").size());

        List<PostViewModelRes> pvmResList = new ArrayList<>();

        postClient.getPostsByPosterName("Evan").stream()
                .forEach(post -> {
                    PostViewModelRes res = new PostViewModelRes();
                    res.setPostId(post.getPostID());
                    res.setPosterName(post.getPosterName());
                    res.setPostDate(post.getPostDate());
                    res.setPost(post.getPost());
                    res.setCommentList(service.getCommentsByPostId(post.getPostID()));
                    pvmResList.add(res);
                });

    }

    @Test
    public void createComment() {
        CommentViewModelReq cvm = new CommentViewModelReq();
        cvm.setCommenterName("Scott");
        cvm.setPostId(5);
        cvm.setComment("This is a mock comment");

        Comment comment2 = new Comment(
                cvm.getCommentId(),
                cvm.getPostId(),
                cvm.getCommenterName(),
                cvm.getComment());

        rabbitTemplate.convertAndSend(comment2);
        assertEquals("New comment sent to queue", service.createComment(cvm));
    }

    @Test(expected = AssertionError.class)
    public void getCommentsByPostId(){
        assertEquals(1, commentClient.getCommentsByPostId(5).size());
        assertEquals(1, commentClient.getCommentsByPostId(6).size());

    }

    @Test
    public void updateComment(){
        CommentViewModelReq cvm = new CommentViewModelReq();
        cvm.setCommentId(1);
        cvm.setCommenterName("Scott");
        cvm.setPostId(5);
        cvm.setComment("This is a mock comment");

        Comment comment = new Comment(
                cvm.getCommentId(),
                cvm.getPostId(),
                cvm.getCommenterName(),
                cvm.getComment());

        rabbitTemplate.convertAndSend(comment);
        assertEquals("Updated comment sent to queue",service.updateComment(cvm, cvm.getPostId()));
    }
}