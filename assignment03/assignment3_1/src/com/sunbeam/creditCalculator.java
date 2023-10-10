package com.sunbeam;

import java.util.Scanner;

public class creditCalculator {
	
	/*(Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded". */
	
	private int acc_no ;
	private int balance ;                         //at start of month
	private int total_charges ;
	private int all_credits ;
	private int allowed_credit ;                // balanced limit
	private int new_balance ;
	
	
	
	public creditCalculator() {
		this.acc_no = 0 ;
		this.balance = 0 ;
		this.total_charges = 0 ;
		this.all_credits = 0 ;
		this.allowed_credit = 0 ;
		this.new_balance = 0 ;
	}
	
	public creditCalculator(int acc_no ,
	int balance ,
	int total_charges , 
	int all_credits ,
	int allowed_credit ) {
		this.acc_no = acc_no ;
		this.balance = balance ;
		this.total_charges = total_charges ;
		this.all_credits = all_credits ;
		this.allowed_credit = allowed_credit ;
		
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTotal_charges() {
		return total_charges;
	}

	public void setTotal_charges(int total_charges) {
		this.total_charges = total_charges;
	}

	public int getAll_credits() {
		return all_credits;
	}

	public void setAll_credits(int all_credits) {
		this.all_credits = all_credits;
	}

	public int getAllowed_credit() {
		return allowed_credit;
	}

	public void setAllowed_credit(int allowed_credit) {
		this.allowed_credit = allowed_credit;
	}
	
	public void acceptAccountDetails()
	{
		Scanner obj = new Scanner(System.in);
		
		
		System.out.println("enter acc_no = ");
		this.acc_no = obj.nextInt();
		
		System.out.println("balance = ");
		this.balance = obj.nextInt();
		
		System.out.println("enter all_credits = ");
		this.all_credits = obj.nextInt();
		
		
		System.out.println("enter allowed_credit = ");
		this.allowed_credit = obj.nextInt();
		
		calculateBalance();
	}
	
	public void displayBalance()
	{
		System.out.println("acc_no = " + this.acc_no );
		System.out.println("balance = " + this.balance );
		System.out.println("total_charges = " + this.total_charges );
		System.out.println("all_credits = " + this.all_credits );
		System.out.println("allowed_credit = " + this.allowed_credit );
		System.out.println(" new_balance = " + new_balance );
	}
	
	public void calculateBalance()
	{
		//new balance (= beginning
		//balance+ charges – credits)
		 
		new_balance = this.balance + this.total_charges - this.all_credits ;  
		if(new_balance > this.all_credits)
		{
			System.out.println("Credit limit exceeded");
		}
		else
		System.out.println(new_balance);
		
	}
	
	
 
}
