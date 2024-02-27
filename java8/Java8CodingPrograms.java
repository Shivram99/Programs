package com.mahait.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8CodingPrograms {
	public static void main(String[] args) {
		Stream<String> of = Stream.of("Shivram","Mayur","Sudhip","Shiva","Brijoy");
		
		/*Find Names whose start from 'S' and collect them*/
		of.filter(x-> x.startsWith("S")).collect(Collectors.toList()).forEach(System.out::println);
		
		/*filter employee and group based on department code*/ 
		List<Employee> asList = Arrays.asList(new Employee(1, "Shivram", 10000, 101, "Active"),
					  new Employee(2, "Sudhip", 50000, 202, "DeActive"),
					  new Employee(3, "Mayur", 50000, 101, "DeActive"),
					  new Employee(4, "Shiva", 50000, 202, "DeActive"),
					  new Employee(5, "Brijoy", 50000, 101, "Active"),
					  new Employee(6, "Vaibhav", 50000, 202, "Active"),
					  new Employee(7, "Mahendra", 50000, 101, "Active")
				);
		 Map<Long, List<Employee>> collect = asList.stream().filter(x->x.getEmpStatus().equals("Active")).collect(Collectors.groupingBy(Employee::getEmpDeptCode));
		collect.forEach((key,value) -> {
			System.out.println(key+" "+value);
		});
		
		/*Find Duplicate word and there count in the string*/
		String s1 = "This is my program This is my system";
		/*========== first way =============*/
		String[] split = s1.split(" ");
		ArrayList<String> arrayList = new ArrayList<String>();
		
		for (String string : split) {
			arrayList.add(string);
		}
		HashSet<String> hashSet = new HashSet<String>(arrayList);
		for (String string : hashSet) {
			System.out.println(string+ " = " +Collections.frequency(arrayList, string));
		}
		
		
		/*========== second way =============*/
		
		HashMap<String, Integer> hashMap = new HashMap<String,Integer>();
		
		for (String string : split) {
			Integer oldCount = hashMap.get(string);
			if(oldCount == null) {
				oldCount = 0;
			}
			hashMap.put(string, oldCount+1);
		}
		System.out.println("By Using HashMap ");
		hashMap.forEach((key,value) -> {
			System.out.println(key+ " = " +value);
		});
		
		/*Create custom functional interface and use it in main method with lambda expression*/
		
		CustomFunctionalInterface cfi = () ->{
			System.out.println("Custom Functional Interface Demo is Successfully Done");
		};
		
		cfi.customFunctionalInterfaceDemo();
	}
	
	

}
