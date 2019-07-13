package com.evanco.EvanWilsonU1M5Summative.model;

import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.Objects;

public class Book {

    //--------------------------------------------------------------------
    // Annotate each property to be not null and label them
    // private to adhere to data hiding practices - Public
    // interface, private implementation
    //--------------------------------------------------------------------
    @NotEmpty
    private int bookId;
    @NotEmpty
    private String isbn;
    @NotEmpty
    private Date publishDate;
    @NotEmpty
    private int authorId;
    @NotEmpty
    private String title;
    @NotEmpty
    private int publisherId;
    @NotEmpty
    private float price;

    //---------------------------------------------------------------------
    // Getters and Setters
    //---------------------------------------------------------------------
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    //---------------------------------------------------------------------
    // equals() and hasCode()
    //---------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getBookId() == book.getBookId() &&
                getAuthorId() == book.getAuthorId() &&
                getPublisherId() == book.getPublisherId() &&
                Float.compare(book.getPrice(), getPrice()) == 0 &&
                getIsbn().equals(book.getIsbn()) &&
                getPublishDate().equals(book.getPublishDate()) &&
                getTitle().equals(book.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookId(), getIsbn(), getPublishDate(), getAuthorId(), getTitle(), getPublisherId(), getPrice());
    }
}
