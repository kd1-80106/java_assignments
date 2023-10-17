package com.employee;

import java.util.Scanner;

public class Base_Salaried_Commission extends Employee{

	private double commission_rate ;
	private double gross_sales ;
	private double  base_salary ;
	private double commission ;
	
	public Base_Salaried_Commission()
	{   
		this.commission_rate = 10 ;
		this.gross_sales = 2000;
		this.base_salary = 20000;
	}

	public Base_Salaried_Commission(double commission_rate, double gross_sales, double base_salary) {
		super();
		this.commission_rate = commission_rate;
		this.gross_sales = gross_sales;
		this.base_salary = base_salary;
	}

	public double getCommission_rate() {
		return commission_rate;
	}

	public void setCommission_rate(double commission_rate) {
		this.commission_rate = commission_rate;
	}

	public double getGross_sales() {
		return gross_sales;
	}

	public void setGross_sales(double gross_sales) {
		this.gross_sales = gross_sales;
	}

	public double getBase_salary() {
		return base_salary;
	}

	public void setBase_salary(double base_salary) {
		this.base_salary = base_salary;
	}

	@Override
	public String toString() {
		return "Base_Salaried_Commission [commission_rate=" + commission_rate + ", gross_sales=" + gross_sales
				+ ", base_salary=" + base_salary + "]";
	}

	@Override
	public void calculateTotalCommission() {
		this.commission = this.commission_rate * this.gross_sales + this.base_salary ;
		
	}

	@Override
	public void acceptEmployee() {
		
		super.acceptEmployee();
		Scanner obj = new Scanner(System.in);
		System.out.println(" Enter commission_rate");
		this.commission_rate = obj.nextDouble();
		
		System.out.println(" Enter gross_sales");
		this.gross_sales = obj.nextDouble();
		
		System.out.println(" Enter base_salary");
		this.base_salary = obj.nextDouble();
		
		
		
	}

	@Override
	public void displayEmployee() {
		
		super.displayEmployee();
		System.out.println(" commission_rate = " + commission_rate);
		
		System.out.println(" gross_sales = " + gross_sales);
		
		System.out.println(" base_salary = " + base_salary);

		System.out.println(" commission in rs  = " + commission);
	}
	
	
	
	
	
}
