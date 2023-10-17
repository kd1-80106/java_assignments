package com.employee;

import java.util.Scanner;

public class Commission_employees extends Employee {
	
	private double commission_rate ;
	private double gross_sales ;
	private double commission ;
 
	
	
	public Commission_employees() {
	   this.commission_rate = 10 ;
	   this.gross_sales = 2000 ;
	   this.commission = 200 ;
	}

	public Commission_employees(double commission_rate, double gross_sales) {
		super();
		this.commission_rate = commission_rate;
		this.gross_sales = gross_sales;
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

	@Override
	public void calculateTotalCommission() {
		this.commission =  this.commission_rate * this.gross_sales ;
		
		
	}

	@Override
	public void acceptEmployee() {
		
		super.acceptEmployee();
		System.out.println("Enter commission rate ");
		Scanner obj = new Scanner(System.in);
		this.commission_rate = obj.nextDouble() ;
		
		System.out.println("Enter gross_sales ");
		this.gross_sales = obj.nextDouble() ;
		
	}

	@Override
	public void displayEmployee() {
		
		super.displayEmployee();
		System.out.println("commission_rate = " + this.commission_rate);
		System.out.println("gross_sales = " + this.gross_sales);
		System.out.println("Commission earned = " + this.commission);
		
	}

	@Override
	public String toString() {
		return "commission_rate = " + this.commission_rate + "gross_sales = " + this.gross_sales +"Commission earned = " + this.commission;
	}
	
	

	
}
