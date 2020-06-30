package Polymorphism;

class Brands

{
	void model()
	{
		System.out.println("Car Model");
	}
}

class Ford extends Brands
{
	void display()
	
	{
		System.out.println("Ford Mustang");
	}
}

class Corvet extends Brands
{
	void show()
	{
		System.out.println("Corvet");
	}
}


public class Polymorphism_Practice_2 {

public static void main(String[] args) {
	
	
	
	Brands br = new Brands();
	br.model();
     
    br = new Ford ();
    br = new Corvet();
	

	}

}
