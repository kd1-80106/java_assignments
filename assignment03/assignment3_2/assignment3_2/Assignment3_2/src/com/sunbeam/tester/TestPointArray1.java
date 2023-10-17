package com.sunbeam.tester;

import java.util.Iterator;
import java.util.Scanner;
import javax.imageio.metadata.IIOMetadataFormatImpl;

import com.sunbeam.*;

public class TestPointArray1 {

	
		public static void main(String[] args) {
			int number;
			Scanner scanner = new Scanner(System.in);

			System.out.print("ENTER NUMBER OF POINTS TO PLOT : ");
			number = scanner.nextInt();

			Point2D points[] = new Point2D[number];

			for (int i = 0; i < points.length; i++) {
				points[i] = new Point2D();
			}

			for (int i = 0; i < points.length; i++) {
				System.out.print("ENTER VALUE OF X FOR POINT " + (i+1) + " : ");
				int x = scanner.nextInt();
				System.out.print("ENTER VALUE OF Y FOR POINT " + (i+1) + " : ");
				int y = scanner.nextInt();

				points[i].setX_axis(x);
				points[i].setY_axis(y);
			}

			int exit = 0;
			int choice = 0;
			int input = 0;
			int input2 = 0;

			while (exit == 0) {

				System.out.println("1. DISPLAY SPECIFIC POINT");
				System.out.println("2. DISPLAY ALL POINTS");
				System.out.println("3. DISTANCE BETWEEN TWO POINTS");
				System.out.println("4. EXIT");
				System.out.println("ENTER YOUR CHOICE");
				choice = scanner.nextInt();

				switch (choice) {
				case 1:

					System.out.print("ENTER POINT NUMBER TO PRINT X AND Y AXIS : ");
					input = scanner.nextInt();
					
					if (input < 0 || input2 < 0 || input > points.length - 1 || input2 > points.length - 1) {
						System.out.println("YOU CAN NOT ENTER VALUE BEYOND VALUE OF AN ARRAY");
						break;
					}
					
					System.out.println("FOR POINT " + (input + 1) + "\n" + points[input].getValues());
					break;

				case 2:

					for (int i = 0; i < points.length; i++) {
						System.out.println("FOR POINT " + (i + 1) + "\n" + points[i].getValues());
					}
					break;

				case 3:
					System.out.print("ENTER FIRST POINT NUMBER : ");
					input = scanner.nextInt();
					System.out.print("ENTER SECOND POINT NUMBER : ");
					input2 = scanner.nextInt();

					if (input < 0 || input2 < 0 || input > points.length - 1 || input2 > points.length - 1) {
						System.out.println("YOU CAN NOT ENTER VALUE BEYOND VALUE OF AN ARRAY");
						break;
					}

					if (points[input].isEqual(points[input2])) {
						System.out.println("BOTH P1 AND P2 ARE POINTING AT SAME LOCATION");
					} else {
						System.out.print(
								"DISTANCE BETWEEN TWO POINTS IS : " + points[input].calculateDistance(points[input2]));
					}
					break;

				case 4:
					exit = 1;
					System.out.println("THANKS");
					break;

				default:
					System.out.println("WRONG CHOICE");
					break;
				}
			}
		}


	}


