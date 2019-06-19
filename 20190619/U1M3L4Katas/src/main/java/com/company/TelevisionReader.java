package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TelevisionReader {
    public static void main(String[] args) {
        PrintWriter writer;

        // Make List type Television
        List<Television> tvList = new ArrayList<>();
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Read json file with mapper/jackson
            tvList = mapper.readValue(
                    new File("src/main/resources/televisions.json"),
                    new TypeReference<List<Television>>() {
                    });

            // Loop through tvList and use data
            for (Television tv: tvList) {
                System.out.println("\n~~~ " + tv.getBrand() + " ~~~~~~~~~~~~~");
                System.out.println("Model: " + tv.getModel());
                System.out.println("Price: $" +tv.getPrice());
                System.out.println("Screen size: " +tv.getScreenSize() + " in.");

                // Put data into JSON format
                String jsonTvList = mapper.writeValueAsString(tvList);
                writer = new PrintWriter(
                        new FileWriter("src/main/resources/televisions2.json"
                        ));
                writer.println(jsonTvList);
                writer.close();
            }
        }catch (Exception e){
            System.out.println("Error:...");
        }


    }
}
