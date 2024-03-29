package com.evanco.EvanWilsonU1M5Summative.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Publisher {

    //--------------------------------------------------------------------
    // Annotate each property to be not null and label them
    // private to adhere to data hiding practices - Public
    // interface, private implementation
    //--------------------------------------------------------------------
    @NotEmpty
    private int publisherId;
    @NotEmpty
    private String name;
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
    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Publisher publisher = (Publisher) o;
        return getPublisherId() == publisher.getPublisherId() &&
                getName().equals(publisher.getName()) &&
                getStreet().equals(publisher.getStreet()) &&
                getCity().equals(publisher.getCity()) &&
                getState().equals(publisher.getState()) &&
                getPostalCode().equals(publisher.getPostalCode()) &&
                getPhone().equals(publisher.getPhone()) &&
                getEmail().equals(publisher.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPublisherId(), getName(), getStreet(), getCity(), getState(), getPostalCode(), getPhone(), getEmail());
    }
}
