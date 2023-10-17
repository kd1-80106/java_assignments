package com.app.sunbeam;

public class ArrayofString {
	

	public static void main(String[] args) {
		String[] s1 = {"a","b","c","d"};
		String[] s2 = {"e","f","c","d"};	
		//String[] s2 = s1;
	
		
		for(int i=0;i<s1.length;i++)
			for(int j=0;j<s2.length;j++) {
				if(s1[i].equals(s2[j])){
					System.out.print(s1[i]+" ");
				}
			}
//		if(s1.equals(s2))
//			System.out.println("Equals...");
//		else
//			System.out.println("Not Equals...");
		
		
//		for(int i=0;i<s.length;i++) {
//			if() {
//				
//			}
//		}	
	}
//for(String arr:s) {
//	arr
//}

}