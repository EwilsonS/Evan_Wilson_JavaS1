package com.company;

import java.util.*;

public class App {
    public static void main(String[] args) {
        City newYork =   new City("New York    ", 8654321);
        City losAngeles= new City("Los Angeles ", 4563218);
        City chicago=    new City("Chicago     ", 2716520);
        City denver =    new City("Denver      ", 704621);
        City desMoines = new City("Des Moines  ", 217521);
        City atlanta=    new City("Atlanta     ", 486213);

        Map<String,City> states = new HashMap<>();

        states.put("New York  ", newYork);
        states.put("California", losAngeles);
        states.put("Illinois  ", chicago);
        states.put("Colorado  ", denver);
        states.put("Iowa      ", desMoines);
        states.put("Georgia   ", atlanta);

        // Print all info
        System.out.println("~Largest Cities by Evan Wilson~\n");
        System.out.println("" +
                "\n" +
                "|     State     |       City      |    Population     |\n" +
                "|---------------|-----------------|-------------------|");
        for (Map.Entry<String, City> entry: states.entrySet()) {
            System.out.println("|    " + entry.getKey() +" |     "+ entry.getValue().getName()+ "|    " + entry.getValue().getPopulation());
        }

        Scanner scan = new Scanner(System.in);
        System.out.printf("\nEnter a minimum population: ");
        int userInput = Integer.parseInt(scan.nextLine());

        System.out.println("" +
                "|     State     |       City      |    Population     |\n" +
                "|---------------|-----------------|-------------------|");
        for (Map.Entry<String, City> entry: states.entrySet()) {
            if (entry.getValue().getPopulation() > userInput)
                System.out.println("|    " + entry.getKey() + " |     " + entry.getValue().getName() + "|    " + entry.getValue().getPopulation());
        }




        }
}
