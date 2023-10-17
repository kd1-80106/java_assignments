package com.sunbeam;

import java.util.Scanner;

public  class Student {
		
		private int roll;
		private String name;
		private String city;
		private double marks;
		
		Scanner obj = new Scanner(System.in);
		public Student()
		{
			 int roll = 1001;
			 String name  = "kumar";
			 String city = "jadgaon";
			 double marks = 40;
		}

		public Student(int roll, String name, String city, double marks) {
			super();
			this.roll = roll;
			this.name = name;
			this.city = city;
			this.marks = marks;
		}

		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public double getMarks() {
			return marks;
		}

		public void setMarks(double marks) {
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
		}
		
		
		
//		void acceptStudent()
//		{
//			System.out.println("enter name");
//			this.name = obj.nextLine();
//			
//			System.out.println("enter roll");
//			this.roll = obj.nextInt();
//			
//			
//			System.out.println("enter city");
//			this.city = obj.nextLine();
//			
//			System.out.println("enter marks");
//			this.marks = obj.nextInt();
//		}
//		
//		void displayStudent()
//		{
//			System.out.println(" name  = " + this.name);
//			
//			
//			System.out.println("enter roll = " + this.roll);
//			
//			
//			
//			System.out.println("enter city = " + this.city );
//			
//			
//			System.out.println("enter marks  = " + this.marks);
//			
//		}
		
		
		
	}
	
	


