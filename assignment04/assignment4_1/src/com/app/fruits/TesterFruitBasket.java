package com.app.fruits;

import java.util.Scanner;
import com.app.fruits.*;

public class TesterFruitBasket {
	static int menu()
	{
		int choice ;
		System.out.println("*********************************************");
		
		System.out.println("0.EXIT");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display names of all fruits in the basket.");
		System.out.println("5.Display name,color,weight , taste of all fresh fruits , in the basket.");
		System.out.println("6.Display tastes of all stale(not fresh) fruits in the basket");
		System.out.println("7.Mark a fruit as stale");
		System.out.println("8.Mark all sour fruits stale (optional)");
		
		
		System.out.println("*********************************************");
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the choice ");
		choice = obj.nextInt();
		return choice ;
	}

	public static void main(String[] args) {
	
		int n ,choice ,index = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		n = sc.nextInt() ;
		FruitBasket[] fruitBasekt = new FruitBasket[n] ;
		
		while ((choice = menu()) != 0)
		{
			switch(choice)
			{
			  case 1 : // Mangp
				  if( index >= 0 && index < n)
				  {
					  
					  fruitBasekt[index] = new Mango() ;
					  fruitBasekt[index].acceptFruitBasket();
					  index++ ;
				  }
				  else 
					  System.out.println(" Basket is full ");
				  
				  break;
				  
				  
			  case 2 :   // Orange
				  if(index >= 0 && index < n)
				  {
					  fruitBasekt[index] = new Orange();
					  fruitBasekt[index].acceptFruitBasket();
					  index++ ;
					  
				  }
				  else 
                     System.out.println(" Basket is full ");
				  
				  break;
				  
				  
			  case 3 : // Apple
				  if(index >= 0 &&  index < n )
				  {
					  fruitBasekt[index] = new Apple();
					  fruitBasekt[index].acceptFruitBasket();
					  index++ ;
				  }
				  
				  else 
	                     System.out.println(" Basket is full ");
					  
					  break;
					  
					  
			  case 4 : //Display names of all fruits in the basket.
				  
				  for(int i  = 0 ; i <  index ; i++)
				  {
					  System.out.println(fruitBasekt[i].getName());
				  }
				  break;
				  
				  
			  case 5 : // Display name,color,weight , taste of all fresh fruits , in the basket.
				  for(int i = 0 ; i < index ; i++)
				  {
					  fruitBasekt[i].displayFruitBasket();
				  }
				  
				  break ;
				  
			  case 6 : // Display tastes of all stale(not fresh) fruits in the basket.
				  
				  for(int i = 0 ; i < index ; i++ )
				  {
					  System.out.println(fruitBasekt[i].isFresh());
				  }
				  break ;
				  
			  case 7 : //Mark a fruit as stale
				  
				  
				  for(int i = 0 ; i < index ; i++ )
				  {
					  fruitBasekt[i].setFresh(false);
					  System.out.println("Invalid index ");
				  }
				  break ;
				  
			  case 8 : 
				  for(int i = 0 ; i < index ; i++ )
				  {
					  if(fruitBasekt[i].taste() == "sour")
						  fruitBasekt[i].setFresh(false); 
				  }
				  break ;
				  t
			  default :
				  System.out.println(" wrong choice ");
	              			  
				  
			}
		}
		
		

	}

}
