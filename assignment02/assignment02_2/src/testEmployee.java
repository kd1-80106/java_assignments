import emp.*;
public class testEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		Employee emp2 = new Employee();
		
		emp1.acceptEmployee();
		emp1.displayEmployee();
		
		emp2.acceptEmployee();
		emp2.displayEmployee();
		
		emp1.raiseSalary();
		emp1.displayEmployee();
		emp2.raiseSalary();
		emp2.displayEmployee();

	}

}
