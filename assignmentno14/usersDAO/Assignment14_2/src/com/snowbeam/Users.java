package com.snowbeam;

import java.util.Date;

public class Users {
	


	 private int id ; 
	 private String fname ;
	 private String lname ;
	 private String email ;
	 private String passwd ;
	 private Date dob ;
	 private Boolean status ;
	 private String role ;
	
	 
	 public Users(int id, String fname, String lname, String email, String passwd, Date dob, Boolean status, String role) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.passwd = passwd;
		this.dob = dob;
		this.status = status;
		this.role = role;		
	}


	public Users() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", passwd=" + passwd
				+ ", dob=" + dob + ", status=" + status + ", role=" + role + "]";
	}
	 
	 
	 
	 


}
