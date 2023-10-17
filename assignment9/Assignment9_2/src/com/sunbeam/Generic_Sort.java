package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Generic_Sort {

		static <T> void selectionSort(T[] arr, Comparator<T> c) {
			for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
			if(c.compare(arr[i], arr[j]) > 0) {
			T temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			}
			}
			}
			}
	public static void main(String[] args) {
		
		Double[] arr = new Double[5];
		
		arr[0] = 22.33 ;
		arr[1] = 44.55 ;
		arr[2] = 66.77 ;
		arr[3] = 33.22 ;
		arr[4] = 11.22 ;
		
	   DoubleSortComparator doubleSortComparator = new DoubleSortComparator();
	     Arrays.sort( arr , doubleSortComparator) ;
	      System.out.println("After Sort by  Asc: ");
	      	for (Double e : arr)
				System.out.println(e);	
			
	

	}
	
	}
