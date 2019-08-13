package com.trilogyed.stwitter.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Comment{
    private Integer commentId;
    private Integer postId;
    private LocalDate createDate;
    private String commenterName;
    private String comment;

    public Comment() {
    }

    public Comment(Integer commentId, Integer postId, LocalDate createDate, String commenterName, String comment) {
        this.commentId = commentId;
        this.postId = postId;
        this.createDate = createDate;
        this.commenterName = commenterName;
        this.comment = comment;
    }

    public Comment(Integer commentId, Integer postId, String commenterName, String comment) {
        this.commentId = commentId;
        this.postId = postId;
        this.commenterName = commenterName;
        this.comment = comment;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getCommenterName() {
        return commenterName;
    }

    public void setCommenterName(String commenterName) {
        this.commenterName = commenterName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment1 = (Comment) o;
        return Objects.equals(getCommentId(), comment1.getCommentId()) &&
                Objects.equals(getPostId(), comment1.getPostId()) &&
                Objects.equals(getCreateDate(), comment1.getCreateDate()) &&
                Objects.equals(getCommenterName(), comment1.getCommenterName()) &&
                Objects.equals(getComment(), comment1.getComment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCommentId(), getPostId(), getCreateDate(), getCommenterName(), getComment());
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", postId=" + postId +
                ", createDate=" + createDate +
                ", commenterName='" + commenterName + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
