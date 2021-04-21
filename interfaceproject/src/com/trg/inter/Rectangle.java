package com.trg.inter;

public class Rectangle implements Shape{
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(length+breadth);
	}

	@Override
	public String toString() {
		return "Rectangle";
	}
	

}
