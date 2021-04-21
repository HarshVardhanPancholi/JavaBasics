package com.trg.inherit;

import java.time.LocalDate;

public class Student extends Person{
	private int studentId;
	private float marks;
	
	public Student(int id, String name, String address, LocalDate dob, float m) {
		super(name, address, dob);
		studentId = id;
		marks = m;
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void show() {
		System.out.println("StudentId "+getStudentId());
	
		System.out.println("Marks "+getMarks());
	}
	
	
	
}
