package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PhoneReader {
    public static void main(String[] args) {
        PrintWriter writer;

        // Make List type Phone
        List<Phone> phoneList = new ArrayList<>();
        try {
            ObjectMapper mapper = new XmlMapper();

            // Read json file with mapper/jackson
            phoneList = mapper.readValue(
                    new File("src/main/resources/phones.xml"),
                    new TypeReference<List<Phone>>() {
                    });

            // Loop through phoneList and use data
            for (Phone phone : phoneList) {
                System.out.println("\n+-+-+ " + phone.getBrand() + " +-+-+-+-+-+");
                System.out.println("Model: " + phone.getModel());
                System.out.println("Processor : " + phone.getProcessor());
                System.out.println("Price: $" + phone.getPrice());
                System.out.println("Storage: $" + phone.getStorage());


                // Put data into JSON format
                String xmlPhoneList = mapper.writeValueAsString(phoneList);
                writer = new PrintWriter(
                        new FileWriter("src/main/resources/phones2.xml"
                        ));
                writer.println(xmlPhoneList);
                writer.close();
            }
        } catch (Exception e) {
            System.out.println("Error:...");
        }


    }
}
