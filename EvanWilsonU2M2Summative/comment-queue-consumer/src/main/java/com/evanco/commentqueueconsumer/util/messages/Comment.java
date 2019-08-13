package com.evanco.commentqueueconsumer.util.messages;

import java.time.LocalDate;
import java.util.Objects;

public class Comment {
    private Integer commentId;
    private Integer postId;
    private String commenterName;
    private String comment;

    public Comment() {
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
        return getCommentId().equals(comment1.getCommentId()) &&
                getPostId().equals(comment1.getPostId()) &&
                getCommenterName().equals(comment1.getCommenterName()) &&
                getComment().equals(comment1.getComment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCommentId(), getPostId(), getCommenterName(), getComment());
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", postId=" + postId +
                ", commenterName='" + commenterName + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
