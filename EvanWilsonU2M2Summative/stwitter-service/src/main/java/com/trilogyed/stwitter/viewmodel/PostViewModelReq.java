package com.trilogyed.stwitter.viewmodel;

import com.trilogyed.stwitter.model.Post;

import java.time.LocalDate;
import java.util.Objects;

public class PostViewModelReq {
    private Integer postID;
    private String posterName;
    private String post;

    public PostViewModelReq() {
    }

    public PostViewModelReq(Integer postID,  String posterName, String post) {
        this.postID = postID;
        this.posterName = posterName;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostViewModelReq req = (PostViewModelReq) o;
        return getPostID().equals(req.getPostID()) &&
                getPosterName().equals(req.getPosterName()) &&
                getPost().equals(req.getPost());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPostID(), getPosterName(), getPost());
    }

    @Override
    public String toString() {
        return "PostViewModelReq{" +
                "postID=" + postID +
                ", posterName='" + posterName + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
