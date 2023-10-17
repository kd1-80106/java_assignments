package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.*;

public class TestPoint {
	
	public static void main(String[] args) {
		int x, y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER VALUE X-AXIS");
		x = scanner.nextInt();
		System.out.println("ENTER VALUE Y-AXIS");
		y = scanner.nextInt();
		
		Point2D p1 = new Point2D(x, y);
		
		System.out.println("ENTER VALUE X-AXIS");
		x = scanner.nextInt();
		System.out.println("ENTER VALUE Y-AXIS");
		y = scanner.nextInt();
		
		Point2D p2 = new Point2D(x, y);
		
		System.out.println("VALUES FOR P1 : " + p1.getValues()); 
		System.out.println("VALUES FOR P2 : " + p2.getValues()) ;
		

		if (p1.isEqual(p2)) {
			System.out.println("BOTH P1 AND P2 ARE POINTING AT SAME LOCATION");
		}
		else {
			System.out.println("DISTANCE BETWEEN P1 AND P2 IS " + p1.calculateDistance(p2));
		}
	}

	

}
