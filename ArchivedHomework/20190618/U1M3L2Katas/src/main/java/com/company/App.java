package com.company;

import java.util.*;

public class App {
    public void printKeys(Map<String, String> myEntry){
        for (Map.Entry<String, String> e : myEntry.entrySet()) {
            System.out.println(e.getKey());

        }
    }
    public void printValues(Map<String, String> myEntry){
        for (Map.Entry<String, String> e : myEntry.entrySet()) {
            System.out.println(e.getValue());

        }
    }
    public void printKeysAndValues(Map<String, String> myEntry2){
        Set<Map.Entry<String, String>> myEntry = myEntry2.entrySet();
        for (Map.Entry<String, String> e : myEntry) {
            System.out.println(e.getKey() +": "+ e.getValue());
        }

    }
    public Map<String, Integer> mapFun(Map<String, Integer> myEntry){
        myEntry.put("Ford", 2012);
        myEntry.put("Smart Fortwo", 2013);
        myEntry.remove("Jeep Wrangler");
        return myEntry;
    }

    public Map<String, List<Car>> listCars(List<Car> car){

        List<Car> toyotaList = new ArrayList<>();
        Car toyota = new Car("Toyota","");
        toyotaList.add(toyota);

        List<Car> fordList = new ArrayList<>();
        Car ford = new Car("Ford","");
        fordList.add(ford);

        List<Car> hondaList = new ArrayList<>();
        Car honda = new Car("Honda","");
        hondaList.add(honda);

        Map<String, List<Car>> dealership = new HashMap<>();
        dealership.put("Toyota", toyotaList);
        dealership.put("Ford", fordList);
        dealership.put("Honda", hondaList);

        return dealership;



    }
    
}
