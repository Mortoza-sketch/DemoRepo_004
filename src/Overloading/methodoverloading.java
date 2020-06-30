package Overloading;

public class methodoverloading {
	
	
   void add (int a, int b)
   
   {
	   System.out.println(a+b);
   }
   
   void add (int a, double b)
   
   {
	   System.out.println(a+b);
   }
   
   void add (double a, double b)
   
   {
	   System.out.println(a+b);
   }
	
   void add (int a, int b, int c)
   
   {
	   System.out.println(a+b+c);
   }
	
	

	public static void main(String[] args) {
		
	methodoverloading mo = new methodoverloading();	
	
	mo.add(10, 20);
    mo.add(30, 30.5);
    mo.add(40.5, 40.5);
    mo.add(5, 15, 25);
	

		
	}

}
