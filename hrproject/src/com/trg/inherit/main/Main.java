package com.trg.inherit.main;

import java.time.LocalDate;

import com.trg.inherit.Person;
import com.trg.inherit.Employee;
import com.trg.inherit.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee emp = new Employee("Harsh","Jaipur", LocalDate.of(1997, 12, 8), 100, 100000 );
		//emp.show();
		/*Student std = new Student(1, "Harsh","Jaipur", LocalDate.of(1997, 12, 8), 100);
		std.show();*/
		
		//Polymorphism
		Person p;

		System.out.println("----------------");
		p= new Employee("Harsh","Jaipur", LocalDate.of(1997, 12, 8), 100, 100000);
		p.show();
		System.out.println("----------------");
		p= new Student(1, "Harsh","Jaipur", LocalDate.of(1997, 12, 8), 100);
		p.show();
		
		
		
	}
	//Advantage of poly as we need only one method to show Employee,Student,Person as emp and stu are subclass of person.
	
	static void operate(Person o){
			o.show();
		}

}
