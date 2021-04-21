package com.trg.inter.main;
import com.trg.inter.Circle;
import com.trg.inter.Rectangle;
import com.trg.inter.Shape;
import com.trg.inter.Square;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(23.0,22.0);
		showData(r);
		Square s = new Square(34);
		Circle c = new Circle(10.5);
		showData(s);
		
		showData(c);
	}
	static void showData(Shape s) {
		// shape is rectangle
		double area= s.getArea();
		double peri=s.getPerimeter();

		//System.out.println("Shape is: "+s.toString());
		if(s instanceof Rectangle) {System.out.println("Shape is rectangle");}
		else if(s instanceof Circle) {System.out.println("Shape is circle");}
		else if(s instanceof Square) {System.out.println("Shape is square");}
		System.out.println("Area is: "+area);
		System.out.println("Perimeter is: "+peri);
		s.m1();
		System.out.println("-------------------------");
	}

}
