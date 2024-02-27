package com.mahait.programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMainClass {


	public static void main(String[] args) {
		
		 ArrayList<Student> arrayList = new ArrayList<Student>();
		 
		 arrayList.add(new Student(30,"Shivram", "Latur"));
		 arrayList.add(new Student(32,"Shiva", "Latur"));
		 arrayList.add(new Student(31,"Brjioy", "Virar"));	
		 arrayList.add(new Student(31,"Brjioy", "Virar"));	
		 arrayList.add(new Student(29,"Venkat", "Pune"));
		 arrayList.add(new Student(30,"Shivram", "Nagpur"));
		 arrayList.add(new Student(32,"Shiva", "Hydrabad"));
		 arrayList.add(new Student(30,"Shivram", "Latur"));
		 arrayList.add(new Student(30,"Shivram", "Latur"));
		 arrayList.add(new Student(30,"Shivram", "Latur"));
		 
		 
		 System.out.println("Sum Of  Age ");
		 Integer collect3 = arrayList.stream().collect(Collectors.summingInt(Student::getStudentAge));
		 System.out.println(collect3);
		 System.out.println("--------");
		 
		 System.out.println("Sum Of  Age Grouping By ");
		 Map<String, Double> collect4 = arrayList.stream().collect(Collectors.groupingBy(Student::getStudentName,Collectors.averagingInt(Student::getStudentAge)));
		 System.out.println(collect4);
		 System.out.println("--------");
		 
		 Map<String, Map<String, Long>> collect2 = arrayList.stream().collect(Collectors.groupingBy(Student::getStudentName,
				 Collectors.groupingBy(Student::getStudentAddress,Collectors.counting())));
		 System.out.println(collect2);
		 
		 System.out.println(" -------- Group By ----------");
		 Map<String, List<Student>> collect = arrayList.stream().filter(e-> e.getStudentName().startsWith("Shivram")).collect(Collectors.groupingBy(Student::getStudentName));
		 System.out.println(collect);
		 
		 System.out.println("===== Max and Second and Nth max values =====");
		 List<Student> sortedList = arrayList.stream()
				 .sorted(Comparator.comparingDouble(Student::getStudentAge).reversed()).collect(Collectors.toList());
		 System.out.println(sortedList.get(1));
		
		 System.out.println("==========");
		 arrayList.stream().filter(s->s.getStudentAge()>=30 && s.getStudentName().startsWith("i", 2)).forEach(System.out::println);
		 
		 Comparator<Student> cmp = Comparator.comparing(Student::getStudentName);
		 
		 Collections.sort(arrayList, cmp);
		 System.out.println("Sorting By Name....");
		 for (Student student : arrayList) {
			System.out.println(student.getStudentAge()+"\t"+student.getStudentName()+"\t"+student.getStudentAddress());
		}
		 
		 System.out.println("--------------------");
		 
		 Comparator<Student> age = Comparator.comparing(Student::getStudentAge);
		 
		 Collections.sort(arrayList, age);
		 System.out.println("Sorting By Age....");
		 
		 for (Student stud : arrayList) {
			System.out.println(stud.getStudentAge()+"\t"+stud.getStudentName()+"\t"+stud.getStudentAddress());
		}
		 
		
	}
	
}
