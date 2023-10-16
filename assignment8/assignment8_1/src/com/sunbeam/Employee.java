package com.sunbeam;

import java.util.Scanner;

abstract public class Employee {
	
	
	   
	   private int id;
	   private float sal;

  
	  abstract  public void Testcalc();  //kyo : 
	   
	   public Employee()   
	    {
	        this.id = 0;
	        this.sal = 0;
	    }
	   public Employee(int id, float sal)
	    {
	        this.id = id;
	        this.sal = sal;
	    }
	   public int getid()
	    {
	        return this.id;
	    }
	   public float getsal()
	    {
	        return this.sal;
	    }
	    void setid(int id)
	    {
	        this.id = id;
	    }
	    void setsal(float sal)
	    {
	        this.sal = sal;
	    }
	    public void accept()
	    {
	        Scanner obj = new Scanner(System.in);
	        System.out.println("Enter employee id");
	        this.id = obj.nextInt();
	        
	        System.out.println("Enter SALARY ");
	        this.sal = obj.nextFloat() ;
	        
	        
	    }
	    public void display()
	    {
	    	System.out.println(" employee id = " + this.id);
	    	
	    	 System.out.println(" SALARY  = " + this.sal);
	    }

}
