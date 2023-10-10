package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	
	private double x ;
	private double y ;
	
	public Point2D()
	{
		this.x = 0.0 ;
		this.y = 0.0 ;
	}
	
	public Point2D(double x , double y)
	{
		this.x = x  ;
		this.y = y ;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	void acceptPoint2D()
	{   
		Scanner obj = new Scanner(System.in);
		System.out.println("enter X co-ordinate");
		this.x = obj.nextDouble();
		
		System.out.println("enter Y co-ordinate");
		this.x = obj.nextDouble();
	}
	
	void displayPoint2D()
	{
		System.out.println("value of X co-ordinate = " + this.x);
		System.out.println("value of y co-ordinate = " + this.y);	
	}
	
	public String getDetails() {
		String sx , sy ;
		sx=Double.toString(this.x);
		sy=Double.toString(this.y);
		
		return "Point = ("+sx+","+sy+")";	
	}
	public boolean isEqual(Point2D p) {
		if(p.x==this.x && p.y==this.y)
			return true;
		else
			return false;
	}
	
	public double calculateDistance(Point2D p) {
		double distance,x_sq,y_sq;
		x_sq = p.x-this.x;
		y_sq = p.y-this.y;
		distance = Math.sqrt((x_sq*x_sq)-(y_sq*y_sq));
		return distance;
	}
	
	

}
