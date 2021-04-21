package com.trg.inherit;

import java.time.LocalDate;

//import java.time.format.DateTimeFormatter;

public class Employee extends Person {
	private int empId;
	private float salary;
	
	public Employee(){
		super();
		salary=735;
		empId=35;
	}
	
	
	
	public Employee(String name, String address, LocalDate dob, int id, float sal) {
		super(name, address, dob);
		empId=id;
		salary=sal;
		// TODO Auto-generated constructor stub
	}



	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void show() {
		System.out.println("EmpId "+empId);
		System.out.println("Name "+getName());
		System.out.println("Salary "+salary);
		
		
	}
	public int add(int x, int y) {
		return (x+y);
	}
}
