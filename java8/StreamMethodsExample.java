package com.mahait.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethodsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");

        // Creating a stream from a list
        Stream<String> stream = names.stream();

        // Filtering: Keep names starting with 'A'
        List<String> filteredNames = stream
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames);

        // Mapping: Uppercase all names
        List<String> uppercasedNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercased Names: " + uppercasedNames);

        // Sorting: Sort names in natural order
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames);

        // Terminal Operations:

        // Counting: Count the number of names
        long count = names.stream().count();
        System.out.println("Number of Names: " + count);

        // Any Match: Check if any name starts with 'B'
        boolean anyMatch = names.stream().anyMatch(name -> name.startsWith("B"));
        System.out.println("Any Name starts with 'B': " + anyMatch);

        // Reducing: Concatenate all names into a single string
        Optional<String> concatenatedNames = names.stream()
                .reduce((name1, name2) -> name1 + ", " + name2);
        System.out.println("Concatenated Names: " + concatenatedNames.orElse(""));

        // forEach: Print each name
        names.stream().forEach(System.out::println);

        // Generating a range of numbers
        IntStream numbers = IntStream.rangeClosed(1, 10);

        // Summing: Calculate the sum of numbers
        int sum = numbers.sum();
        System.out.println("Sum of Numbers: " + sum);
    }
}
