package com.employee;

import java.util.Scanner;

public class Hourly_employees extends Employee {

	private double wages;
	private int hours_worked;

	public Hourly_employees() {
		this.wages = 100;
		this.hours_worked = 8;
	}

	public Hourly_employees(double wages, int hours_worked) {
		super();
		this.wages = wages;
		this.hours_worked = hours_worked;
	}

	public double getWages() {
		return wages;
	}

	public void setWages(double wages) {
		this.wages = wages;
	}

	public int getHours_worked() {
		return hours_worked;
	}

	public void setHours_worked(int hours_worked) {
		this.hours_worked = hours_worked;
	}

	@Override
	public String toString() {
		return "Hourly_employees [wages=" + wages + ", hours_worked=" + hours_worked + "]";
	}

	@Override
	public void calculateTotalCommission() {
		if (this.hours_worked <= 40) {
			this.wages = wages * hours_worked;
			}
		else if(hours_worked > 40) {
            
			this.wages = this.wages * 40 + (hours_worked - 40) * this.wages * 1.5 ;
			
		}

	}

	@Override
	public void acceptEmployee() {

		super.acceptEmployee();
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number of hours worked ");
		this.hours_worked = obj.nextInt();

		System.out.println("enter wages per hour ");
		this.wages = obj.nextDouble();
	}

	@Override
	public void displayEmployee() {

		super.displayEmployee();
		System.out.println("Total hours worked = " + this.hours_worked);
		System.out.println("wages per hourly basis = " + this.wages);
	}

}
