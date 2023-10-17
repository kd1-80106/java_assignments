package com.employee;

import java.util.Scanner;

public class Salaried_employees extends Employee {

	private double fixed_weekly_salary;

	public Salaried_employees() {
		this.fixed_weekly_salary = 20000;
	}

	public Salaried_employees(double fixed_weekly_salary) {
		super();
		this.fixed_weekly_salary = fixed_weekly_salary;
	}

	public double getFixed_weekly_salary() {
		return fixed_weekly_salary;
	}

	public void setFixed_weekly_salary(double fixed_weekly_salary) {
		this.fixed_weekly_salary = fixed_weekly_salary;
	}

	@Override
	public void calculateTotalCommission() {
		System.out.println("Total fixed_weekly_salary = " + this.fixed_weekly_salary);

	}

	@Override
	public void acceptEmployee() {
		super.acceptEmployee();
		System.out.println("enter fixed_weekly_salary");
		Scanner obj = new Scanner(System.in);
		this.fixed_weekly_salary = obj.nextDouble();

	}

	@Override
	public void displayEmployee() {

		super.displayEmployee();
		System.out.println("fixed_weekly_salary = " + this.fixed_weekly_salary);
	}

	@Override
	public String toString() {

		return "fixed_weekly_salary = " + fixed_weekly_salary;
	}

}
