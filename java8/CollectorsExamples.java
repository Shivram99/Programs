package com.mahait.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExamples {
    public static void main(String[] args) {
        // Sample data
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");

        // toList() example
        List<String> namesList = names.stream()
                .collect(Collectors.toList());
        System.out.println("toList: " + namesList);

        // toSet() example
        Set<String> namesSet = names.stream()
                .collect(Collectors.toSet());
        System.out.println("toSet: " + namesSet);

        // joining() example
        String joinedNames = names.stream()
                .collect(Collectors.joining("','","'","'"));
        System.out.println("joining: " + joinedNames);

        // averagingInt() example
        double averageLength = names.stream()
                .collect(Collectors.averagingInt(String::length));
        System.out.println("averageLength: " + averageLength);

        // groupingBy() example
        Map<Integer, List<String>> namesByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("groupingBy: " + namesByLength);

        // partitioningBy() example
        Map<Boolean, List<String>> partitionedNames = names.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 4));
        System.out.println("partitioningBy: " + partitionedNames);

        // counting() example
        long count = names.stream()
                .collect(Collectors.counting());
        System.out.println("counting: " + count);

        // mapping() example
        List<Integer> nameLengths = names.stream()
                .collect(Collectors.mapping(String::length, Collectors.toList()));
        System.out.println("mapping: " + nameLengths);

        // reducing() example
        Optional<String> concatenatedNames = names.stream()
                .collect(Collectors.reducing((s1, s2) -> s1 + ", " + s2));
        System.out.println("reducing: " + concatenatedNames.orElse(""));

        // maxBy() example
        Optional<String> longestName = names.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(String::length)));
        System.out.println("maxBy: " + longestName.orElse(""));

        // minBy() example
        Optional<String> shortestName = names.stream()
                .collect(Collectors.minBy(Comparator.comparingInt(String::length)));
        System.out.println("minBy: " + shortestName.orElse(""));
    }
}
