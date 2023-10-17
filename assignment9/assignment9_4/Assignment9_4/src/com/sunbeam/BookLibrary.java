package com.sunbeam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookLibrary {

	public static int menu() {
		int choice;
		System.out.println("-------------------------------");
		System.out.println("0. Exit");
		System.out.println("1. Add new book");
		System.out.println("2. Display all books");
		System.out.println("3. Delete book at given index");
		System.out.println("4. Check for book with isbn");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books");
		System.out.println("7. Sort all books by price in desc order");
		System.out.print("Enter Your Choice: \t");
		choice = new Scanner(System.in).nextInt();
		System.out.println("-------------------------------");
		return choice;

	}

	public static void main(String[] args) {
		
		List<Book> lib = new ArrayList<>();
		Book book ; 
		
		while(true)
		{
			int choice = menu();
			switch(choice) {
			
			case 1 :
				 book = new Book();
				book.accept();
				lib.add(book);
				System.out.println("Book Added.");
				break;
				
				
			case 2 :
				
				for (Book book2 : lib) {
					System.out.println(book2);
				}
				break;
				
			case 3 :
				int index;
				System.out.print("Enter Index for the book which should be removed: \t");
				index = new Scanner(System.in).nextInt();
				lib.remove(index);
				System.out.println("Book Removed.");
				break;
			
			
		   
			case 4 :
				
				book = new Book();
				System.out.print("Enter isbn no of the book: ");
				book.setIsbn(new Scanner(System.in).next());
				if (lib.contains(book))
					System.out.println("Book is PRESENT.");
				else
					System.out.println("Book is UNAVAILABLE.");
				break;
				
			case 5:
				lib.clear();
				System.out.println("All Books are Clear.");
				break;

			case 6:
				System.out.println("Total Types of Books: " + lib.size());
				break;

			case 7:
				class BookSortComparator implements Comparator<Book> {

					@Override
					public int compare(Book b1, Book b2) {
						int diff = -(Double.compare(b1.getPrice(), b2.getPrice()));
						return diff;
					}

				}
				lib.sort(new BookSortComparator());
				System.out.println("Books Sorted.");
				break;

			default:
				System.out.println("Invalid Choice Entered......:(");
				break;
		
		
			}		
		}
		
	}		
		
}
	


