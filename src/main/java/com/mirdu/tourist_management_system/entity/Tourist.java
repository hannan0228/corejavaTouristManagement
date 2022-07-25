package com.mirdu.tourist_management_system.entity;

public class Tourist {
	private int empId;
	private String empName;
	private String empDsignation;
	private double empSalary;
	
	public Tourist() {
		super();
	}
	
	public Tourist(int empId, String empName, String empDsignation, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDsignation = empDsignation;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDsignation() {
		return empDsignation;
	}

	public void setEmpDsignation(String empDsignation) {
		this.empDsignation = empDsignation;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDsignation=" + empDsignation + ", empSalary="
				+ empSalary + "]";
	}	
}
