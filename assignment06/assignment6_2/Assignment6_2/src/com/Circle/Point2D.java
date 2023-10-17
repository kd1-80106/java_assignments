package com.Circle;

import java.lang.Math;
import java.util.Scanner;

public class Point2D {
	
	 public int x_axis, y_axis;

	    public Point2D() {
	        this(0, 0);
	    }

	    public Point2D(int x, int y) {
	        this.x_axis = x;
	        this.y_axis = y;
	    }

	    public String getValues() {
	        return ("x-axis : " + this.x_axis + "\ny-axis : " + this.y_axis);
	    }

	    public boolean isEqual(Point2D p2) {
	        if (this.x_axis == p2.x_axis && this.y_axis == p2.y_axis)
	            return true;
	        else
	            return false;
	    }
	    
	    public void setX_axis(int x_axis) {
			this.x_axis = x_axis;
		}
	    public void setY_axis(int y_axis) {
			this.y_axis = y_axis;
		}
	    
	    public double calculateDistance(Point2D p2) {
	        return Math.sqrt((Math.pow(p2.x_axis - this.x_axis, 2) + Math.pow(p2.y_axis - this.y_axis, 2)));
	    }
	    public double calculateDistance(Point2D p1, Point2D p2) {
	    	return Math.sqrt((Math.pow(p2.x_axis - p1.x_axis, 2) + Math.pow(p2.y_axis - p1.y_axis, 2)));
	    }

		public void displayPoint() {
			System.out.println("x_axis = " + this.x_axis);
			
			System.out.println("y_axis = " + this.y_axis);
			
		}

		public void acceptPoint() {
			
			Scanner obj = new Scanner(System.in);
            System.out.println("Enter x_axis = " );
            this.x_axis = obj.nextInt();
			
			System.out.println("Enter y_axis = " );
			this.y_axis = obj.nextInt();
			
		}

}