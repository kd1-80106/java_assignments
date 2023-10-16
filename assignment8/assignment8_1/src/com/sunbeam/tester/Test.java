package com.sunbeam.tester;
import com.sunbeam.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Box<Manager> b1 = new Box<Manager>();
//		Manager m=new Manager();
//		b1.set(m);
//		Manager manager = b1.get();
//		manager.accept_manager();
//	    b1.calcSalary();
	    
	    
	    Box<Salesman> b2 = new Box<>();
	    Salesman s = new Salesman();
	    b2.set(s);
	    Salesman salesman = b2.get();
	    salesman.accept();
	    b2.calcSalary();
	    
	    

	}

}
