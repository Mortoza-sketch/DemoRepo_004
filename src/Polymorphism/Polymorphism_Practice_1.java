package Polymorphism;

class car{
void model ()

{
	System.out.println("Car Model");
}

}

class Mercedes extends car {
	
	void display()
	{
		System.out.println("Mercedes");
	}
	
}

class Toyota extends car {
	void show()
	{
		System.out.println("Toyota");
	}
	
}
public class Polymorphism_Practice_1 {		
public static void main(String[] args) {

car obj = new car();
obj.model();


obj = new Mercedes();
obj = new Toyota ();


}

}
