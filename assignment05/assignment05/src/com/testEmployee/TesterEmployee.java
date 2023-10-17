package com.testEmployee;

import com.employee.*;

public class TesterEmployee {

	public static void main(String[] args) {
		
		Employee employee ;
		
		// employee = new employee() ; // NOT OK 
		
		
		employee = new Salaried_employees();
		employee.acceptEmployee();
		employee.calculateTotalCommission();
		employee.displayEmployee();
		
     //    employee = (Employee)Salaried_employees ;
		
		
		
		employee = new Hourly_employees() ;
		employee.acceptEmployee();
		employee.calculateTotalCommission();
		employee.displayEmployee();
		
		employee = new Commission_employees();
		employee.acceptEmployee();
		employee.calculateTotalCommission();
		employee.displayEmployee();
		
		
		
		
		
	
		
		
		

	}

}
