package com.company;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class ComputerReader {
    public static void main(String[] args) {
        FileWriter writer;

        try{
            // Read csv file and set contents to List type Computer
            List<Computer> computers= new CsvToBeanBuilder<Computer>(new FileReader("src/main/resources/computers.csv"))
                    .withType(Computer.class).build().parse();

            // Loop through the list of computers and do something with the data
            for (Computer computer: computers) {
                System.out.println("\n=== " + computer.getBrand() + " ==========");
                System.out.println("Model: " + computer.getModel());
                System.out.println("CPU: " + computer.getCpu());
                System.out.println("RAM: " + computer.getRam());
                System.out.println("Storage: " + computer.getStorageSize());

                // Now, we write that data to a different file.
                writer = new FileWriter("src/main/resources/computers2.csv");
                StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
                beanToCsv.write(computers);
                writer.close();
            }
        }catch (Exception e){
            System.out.println("Error: ....2");
        }
    }
}
