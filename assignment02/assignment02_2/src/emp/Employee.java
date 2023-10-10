package emp;

import java.util.Scanner;

/* Create a class called Employee that includes three fields—a first name (type String), a last
name (type String) and a monthly salary (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the monthly salary
is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */

public class Employee {
	
	String f_name ;
	String l_name ;
	double monthly_salary ;
	
	
   public Employee(){
	   this.f_name = "scott" ;
		this.l_name = "shawshamkar" ;
		this.monthly_salary =  10000 ;
   }
	
	public Employee(String f_name,String l_name,double monthly_salary ){
		this.f_name = f_name ;
		this.l_name = l_name ;
		this.monthly_salary =  monthly_salary ;
		
		
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public double getMonthly_salary() {
		return monthly_salary;
	}

	public void setMonthly_salary(double monthly_salary) {
		this.monthly_salary = monthly_salary;
	}
	
	public void acceptEmployee()
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter First Name");
		f_name = obj.nextLine();
		
		System.out.println("enter Last Name");
		l_name = obj.nextLine();
		
		System.out.println("enter Monthly Salary ");
		monthly_salary = obj.nextDouble();
		if(monthly_salary < 0)
		{
			monthly_salary = 0 ;
		}
		
	}	
	

	public void displayEmployee()
	{
		
		System.out.println(" First Name" + f_name);
		
		
		System.out.println(" Last Name" + l_name);
		
		
		System.out.println(" Monthly Salary " + monthly_salary);
		
		System.out.println(" Yearly Salary " + monthly_salary*12) ;
	
	}	
	
	public void raiseSalary()
	{
		System.out.println("After Increment Salary");
		setMonthly_salary(monthly_salary *1.1);
		
	}
	
		
}
	
			


