package com.snowbeam;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) throws SQLException, ParseException {
		  int choice ;
		Scanner obj = new Scanner(System.in);
		do {
			
			System.out.println("0.EXIT") ;
			System.out.println("1.add new candidate") ;
			System.out.println("2.delete given user ") ;
			System.out.println("3.get ALL candidates") ;
			
	     
	       System.out.println("Enter choice to perform operation ");
	       choice = obj.nextInt();
	       
	       switch(choice) {
	       
	       case 1 : // "1.add new candidate"
	    	   
	    	   
			
                 try(UserDao dao = new UserDao()){
                	 Users user = new Users() ;
                	 System.out.println("enter USER information WE MUST....!!! ");
                
                	 System.out.println("Enter id");
                	 int id = obj.nextInt();
                	 
                	 System.out.println("Enter first_name");
                	 String first_name = obj.next();
                	 
                	 System.out.println("Enter last_name");
                	 String last_name = obj.next();
                	 
                	 System.out.println("Enter email");
                	 String email = obj.next();
                	 
                	 System.out.println("Enter password");
                	 String password = obj.next();
                	 
                	 System.out.println("Enter dob");
                	 
                	 String dob = obj.next();
                	 SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                	 
                	 
                	 java.util.Date udate=sdf.parse(dob);
                	 
                
                	 
                	 System.out.println("Enter Status:");
                	 Boolean status = obj.nextBoolean();
                	 
                	 
                	 System.out.println("Enter password");
                	 String role = obj.next();
                	 
                	 
                    user.setId(id);
                    user.setFname(first_name);
                    user.setLname(last_name);
                    user.setEmail(email);
                    user.setPasswd(password);
                	user.setDob(udate);
                	user.setRole(role);
                	user.setStatus(false);
                	
                	
                	int cnt = dao.addNewUser(user);
                	System.out.println("New User Added = " + cnt);
                	 
                	
                 }
	    	   
	    	
	       case 2 :       //   delete given user
	    	   
	    	   try(UserDao dao = new UserDao()) {
	    		   System.out.println("Enter user to be deleted");
	    		   int id = obj.nextInt();
	    		   int cnt = dao.deleteUser(id);
	    		   System.out.println("User deleted : " + cnt);
	    	   }catch (Exception e) {
	    		   e.printStackTrace();
	    	   }
	    	   
	    	   
	    	   
	       case 3 :    // get ALL candidates
	    	   
	    	   
	    	   try(UserDao dao = new UserDao()){
	    		   List<Users> list = dao.findAll();
	    		   list.forEach(c -> System.out.println(c));
	    	   }catch (Exception e) {
		   			e.printStackTrace();
		   		}
	    	   
	    	  
			
  			
		}while(true) ;
		
		

	}
	
	

}
