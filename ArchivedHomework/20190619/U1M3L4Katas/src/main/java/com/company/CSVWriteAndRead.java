package com.company;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVWriteAndRead {
    public static void main(String[] args) {

        FileWriter writer = null;

        List<Car> carList = new ArrayList<>();

        carList.add(new Car(2012, "Toyota", "Camry", "Blue"));
        carList.add(new Car(2001, "Honda", "Civic", "Silver"));
        carList.add(new Car(2009, "Jeep", "Wrangler", "Rust"));
        carList.add(new Car(2018, "Tesla", "Roadster", "Black"));
        carList.add(new Car(1964, "Ford", "Mustang", "Red"));

        try{

            System.out.println("\n[[[[[[[[ Car list made from List<Car> data ]]]]]]]]");
            for (Car car: carList) {
                System.out.println("\n=== " + car.getMake() + " ====");
                System.out.println("Model: " + car.getModel());
                System.out.println("Year: " + car.getYear());
                System.out.println("Color: " + car.getColor());

                writer = new FileWriter("src/main/resources/car_list.csv");
                StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
                beanToCsv.write(carList);
                writer.close();
            }
        }catch (Exception e){
            System.out.println("Error: .....");
        }

        try{
            List<Car> cars= new CsvToBeanBuilder<Car>(new FileReader("src/main/resources/car_list.csv"))
                    .withType(Car.class).build().parse();

            System.out.println("\n((((((((((( Car list made from car_list.csv data )))))))))");
            for (Car car: cars) {
                System.out.println("\n=== " + car.getMake() + " ====");
                System.out.println("Model: " + car.getModel());
                System.out.println("Year: " + car.getYear());
                System.out.println("Color: " + car.getColor());

                writer = new FileWriter("src/main/resources/car_list2.csv");
                StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
                beanToCsv.write(carList);
                writer.close();
            }
        }catch (Exception e){
            System.out.println("Error: ....2");
        }

    }
}
