package com.employee;

import java.util.Scanner;

abstract public class Employee {

	private String first_name;
	private String last_name;
	private int social_security_number;

	public Employee() {

		this.first_name = " Saurav";
		this.last_name = " Thakela";
		this.social_security_number = 1001;
	}

	public Employee(String first_name, String last_name, int social_security_number) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.social_security_number = social_security_number;
	}

	abstract public void calculateTotalCommission();

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getSocial_security_number() {
		return social_security_number;
	}

	public void setSocial_security_number(int social_security_number) {
		this.social_security_number = social_security_number;
	}

	public void acceptEmployee() {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter employee first_name");
		this.first_name = obj.nextLine();

		System.out.println("enter employee last_name ");
		this.last_name = obj.nextLine();

		System.out.println("enter employee salary ");
		this.social_security_number = obj.nextInt();

	}

	public void displayEmployee() {

		System.out.println("employee first_name  = " + first_name);

		System.out.println(" employee last_name = " + last_name);

		System.out.println(" employee social_security_number = " + social_security_number);

	}

	@Override
	public String toString() {

		return "employee first_name  = " + first_name + " employee last_name = " + last_name
				+ " employee social_security_number = " + social_security_number;

	}

}
