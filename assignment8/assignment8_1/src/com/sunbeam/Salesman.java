package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee{
	
	
	    private float comm;

	   public  void accept_salesman()
	    {
		   
		   Scanner obj = new Scanner(System.in);
	        System.out.println("Enter the commission") ;
	        this.comm = obj.nextFloat();  
	       
	    }
	    void display_Salesman()
	    {
	        System.out.println();
	    }

	
	    public Salesman()
	    {
	        
	        this.comm = comm;
	    }
	    public  Salesman( float comm)
	    {
	        
	        this.comm = comm;
	    }
	    public float getcomm()
	    {
	        return this.comm;
	    }
	    public void setcomm(float comm)
	    {
	        this.comm = comm;
	    }
	  
	    	
	    
	    public void accept()
	    {
	    	super.accept();
	       Scanner obj = new Scanner(System.in);
	       System.out.println(" Enter the commission: ");
	       this.comm = obj.nextFloat() ;
	    }
	    public  void display()
	    {   super.display();
	        System.out.println("The commission is : "  + this.comm);
	    }
	    
	    public void Testcalc() {
		    // super();
		  System.out.println("Total salary = " + (this.getsal()  +  this.comm)); 
		  }
	

}
