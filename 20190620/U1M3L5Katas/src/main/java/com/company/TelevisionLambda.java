package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TelevisionLambda {
    public static void main(String[] args) {
        try {
            // Initialize Obj Mapper to be able to read json
            ObjectMapper mapper = new ObjectMapper();

            // Declare a list type televisions and call it tvs
            List<Television> tvs;

            // Use mapper to dig out data from json and use type reference to math with Television type
            tvs = mapper.readValue(
                    new File("src/main/resources/televisions.json"),
                    new TypeReference<List<Television>>() {
                    });

            // Use stream and lambdas to filter/iterate over list
            System.out.println("~U1M3L5 Television Katas | Evan Wilson~");
            System.out.println("\n===| TVs Larger Than 60 inches |===");
            tvs
                    .stream()
                    .filter(tv -> tv.getScreenSize() > 60)
                    .forEach(tv -> System.out.println(tv.getBrand() + ": " + tv.getScreenSize() + " in"));

            // New stream operation for groupBy
            System.out.println("\n===| Group TVs by brand |===");
            Map<String, List<Television>> groupTvs =
                    tvs
                            .stream()
                            .collect(Collectors.groupingBy(tv -> tv.getBrand()));
            Set<String> keys = groupTvs.keySet();
            keys
                    .stream()
                    .forEach(System.out::println);

            // New stream operation for Average
            System.out.println("\n===| Average screen size |===");
            double avgSreenSize =
                    tvs
                            .stream()
                            .mapToInt(tv -> tv.getScreenSize())
                            .average()
                            .getAsDouble();

            System.out.println("Avg: " + avgSreenSize);

            // New stream operation for Max
            System.out.println("\n===| Largest TV size|===");
            int maxSreenSize =
                    tvs
                            .stream()
                            .mapToInt(tv -> tv.getScreenSize())
                            .max()
                            .getAsInt();
            System.out.println("Max: " + maxSreenSize);

            // Challenge
            // New stream operation for sorting
            System.out.println("\n===| Sorted list by screen size (challenge)|===");
            tvs
                    .stream()
                    .sorted(Comparator.comparingInt(Television::getScreenSize))
                    .collect(Collectors.toList())
                    .forEach(tv -> System.out.println(tv.getBrand() + ": " + tv.getScreenSize() + " in"));

        } catch (Exception e) {

        }
    }
}
