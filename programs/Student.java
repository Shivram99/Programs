package com.mahait.programs;
public class Student {
	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}

	private int studentAge;
	private String studentName;
	private String studentAddress;
	
	public Student(int studentAge, String studentName, String studentAddress) {
		super();
		this.studentAge = studentAge;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentAge=" + studentAge + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}

	
	
	
	
}
