package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class XMLWriteAndRead {
    public static void main(String[] args) {
        PrintWriter writer = null;


        List<Car> carList = new ArrayList<>();

        carList.add(new Car(2012, "Toyota", "Camry", "Blue"));
        carList.add(new Car(2001, "Honda", "Civic", "Silver"));
        carList.add(new Car(2009, "Jeep", "Wrangler", "Rust"));
        carList.add(new Car(2018, "Tesla", "Roadster", "Black"));
        carList.add(new Car(1964, "Ford", "Mustang", "Red"));

        try {
            ObjectMapper mapper = new XmlMapper();
            String jsonCarList = mapper.writeValueAsString(carList);

            writer = new PrintWriter(new FileWriter("src/main/resources/car_list.xml"));

            writer.println((jsonCarList));
        } catch (JsonProcessingException e) {
            System.out.println("Error ..." + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: ...");
        } finally {
            if (writer != null) {
                writer.flush();
                writer.close();
            }
        }

        try {
            ObjectMapper mapper = new XmlMapper();

            carList = mapper.readValue(
                    new File("src/main/resources/car_list.xml"),
                    new TypeReference<List<Car>>() {
                    });

            System.out.println("\n[[[[[[[[ Car list made from car_list.xml data ]]]]]]]]");
            for (Car car: carList) {
                System.out.println("\n=== " + car.getMake() + " ====");
                System.out.println("Model: " + car.getModel());
                System.out.println("Year: " + car.getYear());
                System.out.println("Color: " + car.getColor());

                String jsonCarList = mapper.writeValueAsString(carList) ;
                writer = new PrintWriter(new FileWriter("src/main/resources/car_list2.xml"));
                writer.println(jsonCarList);
                writer.close();
            }
        }catch (IOException e){
            System.out.println("Error: ....." + e.getMessage());
        }

    }
}
