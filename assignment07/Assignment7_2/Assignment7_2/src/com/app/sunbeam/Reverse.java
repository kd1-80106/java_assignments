package com.app.sunbeam;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
//Q2. Write a java program to reverse a String	
	String s = new Scanner(System.in).next();
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		//rev +=s[i];//not applicable
		rev +=s.charAt(i);
	}
System.out.println(rev);

}
}