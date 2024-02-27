package com.mahait.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class TestingDemo {

	public static void main(String[] args) {
		List<Employee> asList = Arrays.asList(new Employee(122, "Shivram",
				45000, 101, "Active"), new Employee(2, "Brijoy", 70000, 102,
				"Active"), new Employee(3, "Mahendra", 55000, 103, "Inactive"),
				new Employee(4, "Sudir", 50000, 102, "Active"), new Employee(5,
						"Parvez", 150000, 102, "Inactive"), new Employee(6,
						"Amit", 100000, 101, "Active"), new Employee(7,
						"Ashish", 60000, 102, "Inactive"), new Employee(8,
						"Lekhchand", 100000, 103, "Active"), new Employee(9,
						"Sana", 50000, 102, "Inactive"), new Employee(10,
						"Pratik", 50000, 101, "Active"), new Employee(11,
						"Shiva", 50000, 102, "Inactive"));
		
		/* print employee details based on deptCode */
		Map<Long, List<Employee>> collect = asList.stream().collect(
				Collectors.groupingBy(Employee::getEmpDeptCode,
						Collectors.toList()));
		collect.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		});

		/* print employee Count based on deptCode */
		Map<Long, Long> collect2 = asList.stream().collect(
				Collectors.groupingBy(Employee::getEmpDeptCode,
						Collectors.counting()));
		collect2.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		});
		/* print employee Count based on Status */
		long active = asList.stream()
				.filter(m -> "Active".equals(m.getEmpStatus())).count();
		long inActive = asList.stream()
				.filter(m -> "Inactive".equals(m.getEmpStatus())).count();
		System.out.println("Active = " + active);
		System.out.println("InActive = " + inActive);

		/* Max Salary found */
		Employee employee = asList.stream()
				.max(Comparator.comparing(Employee::getEmpSalary)).get();
		System.out.println("Max Salary = " + employee);

		/* Min Salary found */
		Employee employee2 = asList.stream()
				.min(Comparator.comparing(Employee::getEmpSalary)).get();
		System.out.println("Min Salary = " + employee2);

		/* Department Wise Max Salary */
		Map<Long, Optional<Employee>> collect3 = asList.stream().collect(
				Collectors.groupingBy(Employee::getEmpDeptCode, Collectors
						.reducing(BinaryOperator.maxBy(Comparator
								.comparing(Employee::getEmpSalary)))));

		collect3.entrySet().forEach(
				entry -> {
					System.out.println("Key = " + entry.getKey() + " Value = "
							+ entry.getValue());
				});

		/* Find First from List */
		Integer integer = asList.stream().map(m -> m.getSrNo()).findFirst()
				.orElse(0);
		System.out.println(integer);

		// SummeringInt
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7);
		IntSummaryStatistics stats = integers.stream().collect(
				Collectors.summarizingInt(x -> x));
		System.out.println(stats);

		/* Count,Sum, Min, Average , max */
		IntSummaryStatistics collect4 = asList.stream().collect(
				Collectors.summarizingInt(Employee::getSrNo));
		System.out.println("All in one " + collect4);
		/* Filter Data */
		asList.stream().filter(m -> "Shivram".equals(m.getEmpName())).forEach(System.out::print);
	}
}
