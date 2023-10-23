package com.snowbeam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//try with resource block 
	// reference creation 
	// getting connection object into reference via getConnection()

//	public class UserDao implements AutoCloseable{
//		private Conenction con ;
//		public UsersDao throws Exception{
//			
//		}
//		@Override
		
		
		public class UserDao implements AutoCloseable { 
			private Connection con;
			public UserDao() throws SQLException {
				con = DbUtil.getConnection();
			}
			@Override
			public void close() {
				try {
					if (con != null)
						con.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
			// case1 :  add new candidate
			
			public int addNewUser(Users user)throws SQLException{
				
				String sql = "Insert into users VALUES(default,?,?,?,?,?,false,'Voter')" ;
			    try(PreparedStatement stmt = con.prepareStatement(sql)){
			    	stmt.setString(1,user.getFname());
			    	stmt.setString(2,user.getLname());
			    	stmt.setString(3,user.getEmail());
			    	stmt.setString(4, user.getPasswd());
			    	
			    	java.sql.Date sdate=new Date(user.getDob().getTime());
			    	stmt.setDate(5, sdate);
			    	
			  
			    	
			    	int cnt = stmt.executeUpdate();
			    	return cnt ;
			    	
			    }
			}

		 //case 2 : delete given user 
			public int deleteUser(int user) throws SQLException{
				String sql = "DELETE FROM users where id=?" ;
				try(PreparedStatement stmt = con.prepareStatement(sql)){
					stmt.setInt(1, user);
					int cnt = stmt.executeUpdate();
					return cnt ;
					
				}
				
			}
			


			
	
			
		// case 3 : get ALL candidates
		// we are using SELECT QUERY thus we must use stmt.executeQuery()
     
			public List<Users> findAll() throws SQLException{
				List<Users> list = new ArrayList<>();
				String sql = "SELECT * from users " ;
				try(PreparedStatement stmt = con.prepareStatement(sql)){
					try(ResultSet rs = stmt.executeQuery()){
						while(rs.next()) {
							int id = rs.getInt("id");
							String first_name = rs.getString("first_name");
							String last_name = rs.getString("last_name");
							String email = rs.getString("email");
							String password = rs.getString("password");
							
							
							java.util.Date udate=new java.util.Date(rs.getDate("dob").getTime());
							
							Boolean status = rs.getBoolean("status");
							String role = rs.getString("role");
							
							Users users = new Users(id,first_name,last_name,email,password,udate,status,role);
							list.add(users);
							
						}
						
					}
	             
	             }
				return list;
				
			
  				
				
				
			}
			
			
}


