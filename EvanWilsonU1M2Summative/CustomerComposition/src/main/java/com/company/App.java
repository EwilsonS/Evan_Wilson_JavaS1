package com.company;

public class App {
    public static void main(String[] args) {
        Address shippingAddress = new Address("2017 Baby St", "", "Charlotte", "NC", 55445);
        Address homeAddress = new Address("1987 Daddy Dr", "", "Kalamazoo", "MI", 37036);

        Customer customer = new Customer(
                "Ava",
                "Baby",
                "email@bellsouth.net",
                "911",
                shippingAddress,
                homeAddress,
                true
        );

        System.out.println("First: " + customer.getFirstName());
        System.out.println("Last: " + customer.getLastName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Phone: " + customer.getPhoneNumber());
        System.out.println("Rewards Member: " + customer.isRewardsMember());
        System.out.println("Shipping address(street): " + customer.getShippingAddress().getStreet1());
        System.out.println("Home address(street): " + customer.getHomeAddress().getStreet1());


    }
}
