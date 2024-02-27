package com.mahait.java8;

public class Employee {
	private int srNo;
	private String empName;
	private Long empSalary;
	private Long empDeptCode;
	private String empStatus = "Active";
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Long getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Long empSalary) {
		this.empSalary = empSalary;
	}
	public Long getEmpDeptCode() {
		return empDeptCode;
	}
	public void setEmpDeptCode(Long empDeptCode) {
		this.empDeptCode = empDeptCode;
	}
	public String getEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	@Override
	public String toString() {
		return "Employee [srNo=" + srNo + ", empName=" + empName
				+ ", empSalary=" + empSalary + ", empDeptCode=" + empDeptCode
				+ ", empStatus=" + empStatus + "]";
	}
	public Employee(int srNo, String empName, long empSalary, long empDeptCode,
			String empStatus) {
		super();
		this.srNo = srNo;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDeptCode = empDeptCode;
		this.empStatus = empStatus;
	}
	
	
	
	
	
}
