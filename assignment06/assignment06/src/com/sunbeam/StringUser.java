package com.sunbeam;

import java.util.Scanner;
import java.io.IOException;

public class StringUser {
	
	private String string ;
	
	public StringUser()
	{
		this.string = "xyz" ;
		
	}

	public StringUser(String string) throws ExceptionLineTooLong {
		if(string.length() < 0 || string.length() > 81)
			throw new ExceptionLineTooLong();
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
	
	public void acceptString()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println(" enter string ");
		this.string = obj.nextLine() ;
			
	}
	
	public void displayString()
	{
		System.out.println("String = " + this.string);
		calculateLength();
		
	}
   
	public void calculateLength()
	{
		int length = this.string.length() ;
		System.out.println(" length of the string is = " + length);
	}

	@Override
	public String toString() {
		return "StringUser [string=" + string + "]";
	}
	
	
	
}	
