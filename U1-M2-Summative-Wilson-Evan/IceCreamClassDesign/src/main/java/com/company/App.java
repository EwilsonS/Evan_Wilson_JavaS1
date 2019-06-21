package com.company;

public class App {
    public static void main(String[] args) {
        IceCreamFactory factory = new IceCreamFactory();
        IceCreamShop shop = new IceCreamShop();

        factory.setBuyer("Evan's IC Place");
        System.out.println("\n~Factory~\nBuyer: " + factory.getBuyer());

        shop.setNumScoops(3);
        shop.setPrice(5.99f);
        System.out.println("\n~Shop~\nNumber of scoops: " + shop.getNumScoops() + "\nPrice: " + shop.getPrice());
    }
}
