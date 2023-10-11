package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	//Properties (instance variables) : color : String , weight : double , name:String, isFresh : boolean
	
	private String color ;
	private double weight ;
	private String name ;
	private boolean isFresh ;
	
	public FruitBasket() {
		System.out.println("inside fruitbasket() ");
		
	}

	public FruitBasket(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return this.color+" , "+this.weight+" , "+this.name + " , " + this.isFresh;
		
	}
	public String taste(){
//		 System.out.println("no specific taste");
		return "no specific taste";
		
	}
	
	public void acceptFruitBasket()
	{
		Scanner jb = new Scanner(System.in);
		System.out.println("Enter colour ");
		this.color = jb.next();
		
		System.out.println("Enter weight ");
		this.weight = jb.nextDouble();
		
		System.out.println("Enter name ");
		this.name = jb.next();
		
		System.out.println("Enter isFresh ");
		this.isFresh = jb.hasNext() ;
		
	  
	}
	
	public void displayFruitBasket()
	{
		
		System.out.println(" colour = " + this.color);
		
		
		System.out.println(" weight  = " + this.weight);
		
		
		System.out.println(" name  = " + this.name);
		
		System.out.println(" isFresh = " + this.isFresh);
		
		
	  
	}
	
	
	

}
