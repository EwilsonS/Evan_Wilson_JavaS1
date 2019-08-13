package com.trilogyed.stwitter.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Post implements Serializable {
    private Integer postID;
    private String posterName;
    private LocalDate postDate;
    private String post;

    public Post() {
    }

    public Post(Integer postID, String posterName, String post) {
        this.postID = postID;
        this.posterName = posterName;
        this.post = post;
    }

    public Post(Integer postID, String posterName, LocalDate postDate, String post) {
        this.postID = postID;
        this.posterName = posterName;
        this.postDate = postDate;
        this.post = post;
    }

    public Integer getPostID() {
        return postID;
    }

    public void setPostID(Integer postID) {
        this.postID = postID;
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

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post1 = (Post) o;
        return Objects.equals(getPostID(), post1.getPostID()) &&
                Objects.equals(getPosterName(), post1.getPosterName()) &&
                Objects.equals(getPostDate(), post1.getPostDate()) &&
                Objects.equals(getPost(), post1.getPost());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPostID(), getPosterName(), getPostDate(), getPost());
    }

    @Override
    public String toString() {
        return "Post{" +
                "postID=" + postID +
                ", posterName='" + posterName + '\'' +
                ", postDate=" + postDate +
                ", post='" + post + '\'' +
                '}';
    }
}
