package Invoice;

import java.util.Scanner;

public class invoice {

	String part_number ;
	String part_description ;
	int Qty ;
	double price ;
	
	public invoice() {
		
		this.part_number = "0000";
		this.part_description = "items";
		Qty = 0;
		this.price = 0 ;
		
	}
	
	public invoice(String part_number, String part_description, int qty, double price) {
		super();
		this.part_number = part_number;
		this.part_description = part_description;
		Qty = qty;
		this.price = price;
	}
	
	public String getPart_number() {
		return part_number;
	}
	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}
	public String getPart_description() {
		return part_description;
	}
	public void setPart_description(String part_description) {
		this.part_description = part_description;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void acceptOrder()
	{   
		Scanner obj = new Scanner(System.in);
		System.out.println("enter part number ");
		this.part_number = obj.nextLine();
		
		
		System.out.println("enter part name ");
		this.part_description = obj.nextLine();
		
		System.out.println("enter part QTY ");
		this.Qty = obj.nextInt();	
		if(Qty < 0 )
			this.Qty= 0 ;
		
		System.out.println("enter part Price ");
		this.price = obj.nextDouble();
		if(price < 0 )
			this.price = 0 ;
		
	}
	
	public void displaInvoice()
	{
		System.out.println(" part number  = " + part_number);
		System.out.println(" part Description  = " + part_description);
		System.out.println(" part QTY  = " +  Qty);
		System.out.println(" part Price  = " + Qty*price );
	}

}
