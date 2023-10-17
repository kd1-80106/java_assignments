package com.app.sunbeam;



import java.util.Scanner;

public class Palindrome {

public static void main(String[] args) {
	System.out.println("Enter a string = ");

	String s = new Scanner(System.in).next();
	String temp="";
	for(int i=s.length()-1;i>=0;i--) {
		temp +=s.charAt(i);
	}
	System.out.println(temp);
	if(temp.equals(s)){
		System.out.println("String is  Palindrome...!!!!!!");		
	}else {
		System.out.println("String is not Palindrome...!!!!!!");	
	}

	//for(int i=s.length()-1;i>=0;i--) {
//		   else if(i==s.length()-1) {
//				System.out.println("String is Palindrome...!!!!!!");
//			}

		

//	   else if(i==s.length()-1) {
//			System.out.println("String is Palindrome...!!!!!!");
//		}	
//		if(i==s.length()-1) {
//			System.out.println("String Palindrome...!!!!!!");
//			break;
//		}
//	}

	
}

}