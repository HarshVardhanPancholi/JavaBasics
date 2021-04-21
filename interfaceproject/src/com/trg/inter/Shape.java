

package com.trg.inter;

public interface Shape {

	//any shape must have some basic requirements that we implements here
	double PI=3.1434; //This is automatically public static final
	double getArea(); 
	double getPerimeter();
	default void m1() {
		System.out.println("Default method");
	}
}
