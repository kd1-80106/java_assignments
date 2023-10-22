package com.sunbeam;

import java.util.List;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-22 12:53
 */

public class Demo03Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try(CandidateDao dao=new CandidateDao()) {
			List<PartyVotes>pvotes=dao.getPartywiseVotes();
			for (PartyVotes partyVotes : pvotes) {
				System.out.println(partyVotes);
				
			}
		}
		
		catch (Exception e) {
	       e.printStackTrace();
		}
		
		try(CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter candidate id , name , party to be modify : ");
			
			
			Candidate cd = new Candidate();
			System.out.println("enter  id  of candidate ");
			int id = sc.nextInt();
			
			System.out.println("enter  party  of candidate ");
			String party = sc.next();
			
			System.out.println("enter  name  of candidate ");
			String name = sc.next();
		    
			cd.setId(id);
			cd.setName(name);
			cd.setParty(party);
			
			
			int cnt = dao.update(cd);
			System.out.println("Candidate added: " + cnt);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
//		
//		
//		try(CandidateDao dao = new CandidateDao()) {
//			System.out.print("Enter candidate id to be added   name , party , votes : ");
//			
//			
//			Candidate cd = new Candidate();
//			
//			System.out.println("enter  id  of candidate ");
//			String name = sc.next();
//			
//			System.out.println("enter  party  of candidate ");
//			String party = sc.next();
//			
//			
//			System.out.println("enter  votes  of candidate ");
//			int votes = sc.nextInt();
//			
//			
//			
//			
//			
//			cd.setName(name);
//			cd.setParty(party);
//			cd.setVotes(votes);
//			
//			int cnt = dao.addNewCandidateBy(cd);
//			System.out.println("Candidate added: " + cnt);
//		} // dao.close();
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
		
		
//		try(CandidateDao dao = new CandidateDao()) {
//			System.out.print("Enter candidate id to be updated: ");
//			int id = sc.nextInt();
//			int cnt = dao.deleteById(id);
//			System.out.println("Candidates deleted: " + cnt);
//		} // dao.close();
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//		
		
		/*
		try(CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter candidate id to be deleted: ");
			int id = sc.nextInt();
			int cnt = dao.deleteById(id);
			System.out.println("Candidates deleted: " + cnt);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try(CandidateDao dao = new CandidateDao()) {
			List<Candidate> list = dao.findAll();
			list.forEach(c -> System.out.println(c));
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		*/

		/*
		try(CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter party: ");
			String party = sc.next();
			List<Candidate> list = dao.findByParty(party);
			list.forEach(c -> System.out.println(c));
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
//		try(CandidateDao dao = new CandidateDao()) {
//			System.out.print("Enter candidate id (to vote): ");
//			int candidateId = sc.nextInt();
//			int cnt = dao.incrementVote(candidateId);
//			System.out.println("Rows updated: " + cnt);
//		} // dao.close();
//		catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}






