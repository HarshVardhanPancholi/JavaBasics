package com.trg.inter;

public class Circle implements Shape{

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}
	public String toString() {
		return "Circle";
	}
	
}
