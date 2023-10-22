package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CandidateDao implements AutoCloseable {
	private Connection con;
	public CandidateDao() throws SQLException {
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
	// add new candidate
	
	public int addNewCandidateBy(Candidate cd) throws SQLException{
		
		String sql = "Insert into candidates VALUES(default,?,?,?)" ;
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, cd.getName());
			stmt.setString(2, cd.getParty());
			stmt.setInt(3, cd.getVotes());
			
			int cnt = stmt.executeUpdate();
			return cnt ;
		}
	
		catch(Exception e)
		{
			e.printStackTrace();
		
		}
		return 0;
	}
	
	//int update(Candidate c);
	public int update(Candidate c){
    	
		String sql = "UPDATE candidates set name = ? , party = ? where id = ? " ;
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, c.getName()) ;
			stmt.setString(2,c.getParty()) ;
			stmt.setInt(3, 10);
			
			int cnt = stmt.executeUpdate();
			return cnt ;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		
		}
		return 0 ;
	}

		
	
	// delete given candidate
	public int deleteById(int id) throws SQLException {
		String sql = "DELETE FROM candidates WHERE id=?";          // step 4 
		try(PreparedStatement stmt = con.prepareStatement(sql)) {       // step 5
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		} //stmt.close();
	}
	
	// update candidate
		// update candidate
	
	
	
	
	// get all candidates
	public List<Candidate> findAll() throws SQLException {
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}
	
	// increment candidate vote
	public int incrementVote(int candidateId) throws SQLException {
		String sql = "UPDATE candidates SET votes=votes+1 WHERE id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, candidateId);
			int cnt = stmt.executeUpdate();
			return cnt; 
		} //stmt.close();
	}
	
	// get all candidates of given party
	public List<Candidate> findByParty(String givenParty) throws SQLException {
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates WHERE party=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, givenParty);
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}
	
	List<PartyVotes> getPartywiseVotes() throws SQLException{
	 List<PartyVotes> pvotes = new ArrayList<>();
	String sql = "SELECT party , sum(votes) as TOTALVOTES from candidates GROUP BY party" ;
	try(PreparedStatement stmt = con.prepareStatement(sql)){
		try( ResultSet rs = stmt.executeQuery()){
			while(rs.next()) {
				String party = rs.getString("party");
				int id = rs.getInt("TOTALVOTES");
				
				PartyVotes pv = new PartyVotes(party, id);
				pvotes.add(pv);
				
			}
		}
	 }
	return pvotes;	
	}
		
			
			
			
	public int updateById(Candidate cd) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// get partywise vote count
}





