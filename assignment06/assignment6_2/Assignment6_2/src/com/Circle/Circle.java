package com.Circle;

import java.util.Scanner;

public class Circle {
	
	private Point2D center;
	private double diameter;

	public Circle() {
		this.center = new Point2D(0,0);
		this.diameter=100;	//or
		//this(new Point2D(),150);
	}

	public Circle(Point2D p, double diameter) throws InvalidDiameter {
		this.center = p;
		if (diameter < 0)
			throw new InvalidDiameter();
		this.diameter = diameter;
	}

	public Circle(Circle center, int i) {
		// TODO Auto-generated constructor stub
	}

	public Point2D getP() {
		return center;
	}

	public void setP(Point2D p) {

		this.center = p;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) throws InvalidDiameter {
		if (diameter < 0)
			throw new InvalidDiameter();
		this.diameter = diameter;
	}

	public void display() {
		center.displayPoint();
		System.out.println("Diamter=" + this.diameter);
	}

	public void accept() throws InvalidDiameter {

		center.acceptPoint();
		System.out.println("Enter diameter=");
		this.diameter = new Scanner(System.in).nextDouble();
		if (this.diameter < 0)
			throw new InvalidDiameter();

	}

}
