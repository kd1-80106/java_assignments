package com.suunbeam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;


public class BuﬀeredReader {
	
	public static void BufferWrite() {
		
	
	try(FileWriter fw = new FileWriter("file.txt")){
		try(BufferedWriter bw = new BufferedWriter(fw)){
			
			for(int i = 1 ; i <= 4 ; i++)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("enter a line : ");
				String line = sc.nextLine();
				bw.write(line);
				bw.newLine();
			}
		}			
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}	
	
	
	public static void BufferRead() {
		
	
	try(FileReader fr = new FileReader("file.txt")){
		try(BufferedReader br = new BufferedReader(fr)){
			
			String line ;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
	}
	catch (Exception e) {
    	e.printStackTrace();
	}
}
	
	public static void main(String[] args) {
		
		
		BufferWrite();
		BufferRead();
	}
}



	
		
		

	


