package com.mahait.java8;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayListRemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("A");

		System.out.println("--- By Using Distinct ---");
		arrayList.stream().distinct().forEach(System.out::println);
		Set<String> collect = arrayList.stream().collect(Collectors.toSet());
		System.out.println("--- By Using toSet ---");
		System.out.println(collect);

		Map<String, Long> collect2 = arrayList.stream().collect(
				Collectors.groupingBy(Function.identity(),
						Collectors.counting()));
		System.out.println(collect2);

		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

		arrayList1.add(1);
		arrayList1.add(1);
		arrayList1.add(2);
		arrayList1.add(3);
		arrayList1.add(2);
		arrayList1.add(1);

		IntSummaryStatistics collect3 = arrayList1.stream().collect(
				Collectors.summarizingInt(m -> m));
		System.out.println("Max Salary = " + collect3.getMax()
				+ "\tMin Salary = " + collect3.getMin());
	}

}
