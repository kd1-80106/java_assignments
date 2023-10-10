package com.usercost;

import java.util.Scanner;

/* Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day */

public class Usercost {
	
	private int total_miles ;
	private int per_gallon_cost ;
	private int average_miles ;
	private int Parking_fees ;
	private int Tolls_per_day ;
	private int sharing_persons;

	public Usercost(){
		this.total_miles = 0 ;
		this.per_gallon_cost = 0 ;
		this.average_miles = 0 ;
		this.Parking_fees = 0 ;
		this.Tolls_per_day  = 0 ;
		this.sharing_persons = 0  ;
	}
	
public Usercost(int total_miles, int per_gallon_cost, int average_miles, int parking_fees, int tolls_per_day , int sharing_persons) {
	super();
	this.total_miles = total_miles;
	this.per_gallon_cost = per_gallon_cost;
	this.average_miles = average_miles;
	Parking_fees = parking_fees;
	Tolls_per_day = tolls_per_day;
	this.sharing_persons = 4 ;
}

public int getTotal_miles() {
	return total_miles;
}

public void setTotal_miles(int total_miles) {
	this.total_miles = total_miles;
}

public int getPer_gallon_cost() {
	return per_gallon_cost;
}

public void setPer_gallon_cost(int per_gallon_cost) {
	this.per_gallon_cost = per_gallon_cost;
}

public int getAverage_miles() {
	return average_miles;
}

public void setAverage_miles(int average_miles) {
	this.average_miles = average_miles;
}

public int getParking_fees() {
	return Parking_fees;
}

public void setParking_fees(int parking_fees) {
	Parking_fees = parking_fees;
}

public int getTolls_per_day() {
	return Tolls_per_day;
}

public void setTolls_per_day(int tolls_per_day) {
	Tolls_per_day = tolls_per_day;
}

public void acceptUserInput()
{   
	Scanner obj = new Scanner(System.in);
	System.out.println("enter total miles ");
	total_miles = obj.nextInt();
	
	System.out.println("enter per_gallon_cost ");
	per_gallon_cost = obj.nextInt();
	
	System.out.println("enter average_miles ");
	average_miles = obj.nextInt();
	
	System.out.println("enter Parking_fees ");
	Parking_fees = obj.nextInt();
	
	System.out.println("enter Tolls_per_day ");
	Tolls_per_day = obj.nextInt();
	
	System.out.println("enter sharing persons ");
	this.sharing_persons = obj.nextInt();
	
}

public void displayUser()
{   
	
	System.out.println(" total miles  = " + total_miles);

	
	System.out.println(" per_gallon_cost = "+ per_gallon_cost);
	
	
	System.out.println(" average_miles = " + average_miles );
	
	 
	System.out.println(" Parking_fees  = " + Parking_fees);
	
	
	System.out.println(" Tolls_per_day = " + Tolls_per_day);

	System.out.println(" sharing persons  = " + sharing_persons );
	
	
}

public void calculate()
{
	
	int total_cost = (((this.per_gallon_cost/this.average_miles)*this.total_miles) + Parking_fees + sharing_persons) ;
	System.out.println("total cost per day  = " + total_cost );
	
	int distributed_cost = total_cost / 4 ;
	System.out.println("distributed cost per person = " +  distributed_cost);
	
	int saving = total_cost - distributed_cost ;
	System.out.println(" saved cost per person due to sharing = " + saving );
	
	
	}




	
	
	

}
