package Constructor;

public class ConstructorParameter {
	
	int X;
	int Y;

	ConstructorParameter()
	
	{
		X = 10;
		Y = 20;
	}
	
	void display()
	
	{
		System.out.println(X+Y);
	}
	

public static void main(String[] args) {
	
	ConstructorParameter cm1 = new ConstructorParameter ();
	cm1.display();
   		
		

	}

}
