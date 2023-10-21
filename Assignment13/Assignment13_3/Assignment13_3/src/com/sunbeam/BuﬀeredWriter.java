//3. Write a program that inputs 4 lines and stored them in a text ﬁle. Use BuﬀeredWriter class.
//for(int i=1; i<=4; i++) {
//String line = sc.nextLine();
//bwr.write(line);
//}
package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BuﬀeredWriter {
	
	
	
	

	public static void main(String[] args) {
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
		catch(Exception e )
		{
			e.printStackTrace();
		}


}
}