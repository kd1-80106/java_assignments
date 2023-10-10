package com.app.geometry;

import com.app.geometry.*;

public class TestPoint2D {

	public static void main(String[] args) {
		
		Point2D p1 = new Point2D(5.5,8.8);
		Point2D p2 = new Point2D(5.5, 8.8);
		
//		p1.acceptPoint2D();
//		p1.displayPoint2D();
//		p2.acceptPoint2D();
		System.out.println(p1.isEqual(p2)); 
		
		 System.out.println(" area = " + p1.calculateDistance(p2));   
		

	}

}
