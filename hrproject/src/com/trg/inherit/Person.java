package com.trg.inherit;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;


abstract public class Person {
	private String name;
	private String address;
	private LocalDate dob;
	
	public Person() {
		name="as";
		address="ddc";
		dob=LocalDate.now();
	}
	
	public Person(String name, String address, LocalDate dob) {
		this.name = name;
		this.address = address;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	abstract public void show();
	public int add(int x, int y, int z) {
		return (x+y+z);
	}
	
}
