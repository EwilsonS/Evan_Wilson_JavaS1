package com.evanco.EvanWilsonU1M5Summative.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Author {

    //--------------------------------------------------------------------
    // Annotate each property to be not null and label them
    // private to adhere to data hiding practices - Public
    // interface, private implementation
    //--------------------------------------------------------------------
    @NotEmpty
    private int authorId;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty
    private String street;
    @NotEmpty
    private String city;
    @NotEmpty
    @Size(min = 2, max = 2)
    private String state;
    @NotEmpty
    private String postalCode;
    @NotEmpty
    private String phone;
    @NotEmpty
    private String email;

    //---------------------------------------------------------------------
    // Getters and Setters
    //---------------------------------------------------------------------
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //---------------------------------------------------------------------
    // equals() and hasCode()
    //---------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return getAuthorId() == author.getAuthorId() &&
                getFirstName().equals(author.getFirstName()) &&
                getLastName().equals(author.getLastName()) &&
                getStreet().equals(author.getStreet()) &&
                getCity().equals(author.getCity()) &&
                getState().equals(author.getState()) &&
                getPostalCode().equals(author.getPostalCode()) &&
                getPhone().equals(author.getPhone()) &&
                getEmail().equals(author.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthorId(), getFirstName(), getLastName(), getStreet(), getCity(), getState(), getPostalCode(), getPhone(), getEmail());
    }
}
