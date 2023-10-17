package com.sunbeam.tester;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.sunbeam.*;

class CityMarksName implements Comparator<Student> {
	@Override
//	public int compare(Student s1, Student s2) {
//		int diff = s1.getCity().compareTo(s2.getCity());
//		if(diff == 0)
//			diff = Double.compare(s1.getMarks(), s2.getMarks());
//			if(diff == 0)
//			diff = s1.getName().compareTo(s2.getName());
//			return diff;
	
		
		public int compare(Student s1, Student s2) {
			int diff = -s1.getCity().compareTo(s2.getCity());
			if(diff == 0)
				diff = -Double.compare(s1.getMarks(), s2.getMarks());
			
			if(diff == 0)
				 diff = s1.getName().compareTo(s2.getName());
			return diff;
		}
		
	}



//int roll = 1001;
//String name  = "kumar";
//String city = "jadgaon";
//double marks = 40

public class Tester {

	public static void main(String[] args) {
		
		Student [] arr = new Student[5] ;
		
		arr[0] = new Student(1001,"mohan" , "Nainital" , 40);
		arr[1] = new Student(1002,"sohan" , "Nainital" , 100) ;
		arr[2] = new Student(1003,"sohan" , "Karad" , 55);
		arr[3] = new Student(1004,"pohan" , "Satara" , 100) ;
		arr[4] = new Student(1005,"gohan" , "Zambei" , 77) ;
		
		System.out.println("Before Sort: ");
		for (Student e : arr)
			System.out.println(e);
		
		CityMarksName t = new CityMarksName();
		Arrays.sort(arr,t);
		
		System.out.println("After Sort: ");
		for (Student e : arr)
			System.out.println(e);
		
		
		
		
		
		
		
		
		

	}

}
