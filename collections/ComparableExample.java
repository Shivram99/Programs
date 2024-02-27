package com.mahait.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ComparableExample implements Comparable<ComparableExample> {
	int rollno;
	String name;
	int age;

	public ComparableExample(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(ComparableExample st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		List<ComparableExample> al = Arrays.asList(
		new ComparableExample(101, "Vijay", 23),
		new ComparableExample(106, "Ajay", 27),
		new ComparableExample(105, "Jai", 21));

		Collections.sort(al);
		for (ComparableExample st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}

// Creating a test class to sort the elements
