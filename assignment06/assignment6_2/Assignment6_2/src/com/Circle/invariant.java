package com.Circle;

public class invariant {
	
	
		public static void main(String[] args)  {
			
			//Point2D center=new Point2D(4,5);

			//or
			Circle c = new Circle();
			try {
				//c.setDiameter(-56);
			
				c.accept();
				c.display();
				//Circle c2 = new Circle(center,150);
				//c2.display();	


				
				
			}
			catch(InvalidDiameter e) {
		e.printStackTrace();
			}
			//c.display();
			
		//Point2D p=new Point2D();
		//p.acceptPoint();
		//p.displayPoint();

		}

}
