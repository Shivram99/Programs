package com.mahait.programs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BooleanCheck implements Cloneable {

	public static void main(String[] args) {

		Set<Student> hashSet = new HashSet<Student>();

		hashSet.add(new Student(11, "ABC", "Mubbai"));
		hashSet.add(new Student(12, "ABC1", "Mubbai"));
		hashSet.add(new Student(13, "ABC2", "Mubbai"));
		hashSet.add(new Student(14, "AB3", "Mubbai"));
		hashSet.add(new Student(14, "ABa", "Mubbai"));
		hashSet.add(new Student(14, "ABb", "Mubbai"));

		List<Object> collect = hashSet.stream().map(student -> student.getStudentAge()).collect(Collectors.toList());
		System.out.println(collect);
		
		
	}
}
