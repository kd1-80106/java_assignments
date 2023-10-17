package com.sunbeam;

import java.lang.Math;

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

}
