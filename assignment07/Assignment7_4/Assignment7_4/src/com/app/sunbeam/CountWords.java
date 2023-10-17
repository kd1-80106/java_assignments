package com.app.sunbeam;
import java.util.Scanner;

//Q4. write a java program to count number of words in a String.
//Hint: You can use , trim() , length() and split() methods
public class CountWords {

public static void main(String[] args) {
	System.out.println("Enter a String = ");
	String s = new Scanner(System.in).nextLine();

int count=0;
String[]words = s.split(" ");
count=words.length;
System.out.println("Words count = "+count);
for(String arr:words)
	System.out.println(arr);

}

}