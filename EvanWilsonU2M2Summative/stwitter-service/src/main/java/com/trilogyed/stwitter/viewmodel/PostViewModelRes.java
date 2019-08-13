package com.trilogyed.stwitter.viewmodel;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class PostViewModelRes {

    private Integer postId;
    private LocalDate postDate = LocalDate.now();
    private String posterName;
    private String post;
    private List<CommentViewModelRes> commentList;

    public PostViewModelRes() {
    }

    public PostViewModelRes(Integer postId, LocalDate postDate, String posterName, String post, List<CommentViewModelRes> commentList) {
        this.postId = postId;
        this.postDate = postDate;
        this.posterName = posterName;
        this.post = post;
        this.commentList = commentList;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    public String getPosterName() {
        return posterName;
    }

    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public List<CommentViewModelRes> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<CommentViewModelRes> commentList) {
        this.commentList = commentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostViewModelRes that = (PostViewModelRes) o;
        return getPostId().equals(that.getPostId()) &&
                getPostDate().equals(that.getPostDate()) &&
                getPosterName().equals(that.getPosterName()) &&
                getPost().equals(that.getPost()) &&
                getCommentList().equals(that.getCommentList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPostId(), getPostDate(), getPosterName(), getPost(), getCommentList());
    }
}
