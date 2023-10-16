package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee {
	
	
	  private float bonus;
	  Scanner obj = new Scanner(System.in);

	   public void accept_manager()
	    {
		   super.accept();
		   System.out.println("enter bonus");
		   this.bonus = obj.nextFloat();
	        System.out.println("Bonus = " + this.bonus );
	        System.out.println(" salary + bonus = " + (this.bonus + this.getsal())) ;
	    }
	   public  void display_manager()
	    {
	       System.out.println("The bonus is : ");
	    }


		   
	   public  Manager()
	    {
	       super() ;
	       this.getid();
	       this.getsal() ;
	        this.bonus = 0;
	    }
	   public void Testcalc() {
		    // super();
		  System.out.println(this.getsal()  + bonus); 
		  }
	
	   public Manager(float bonus)
	    {
	    
	        this.bonus = bonus;
	    }
	   public float getbonus()
	    {
	        return this.bonus;
	    }
	    void setbonus(float bonus)
	    {
	        this.bonus = bonus;
	    }
	    public void display()
	    {
	     super.display();  	
	      System.out.println("bonus amount is = " + this.bonus);
	    }

}
