package Overloading;

public class methodoverloading1 {
	
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
		
		methodoverloading1 mo = new methodoverloading1();
		
		mo.add(1, 1);
		mo.add(1, 1.7);
	    mo.add(26.3, 1.4);
	    mo.add(9, 9, 9);
		
	

	}

}
