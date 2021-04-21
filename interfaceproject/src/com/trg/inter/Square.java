package com.trg.inter;

public class Square implements Shape{

	private double side;

	public Square(double side) {
		this.side = side;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}
	public String toString() {
		return "Square";
	}
}
