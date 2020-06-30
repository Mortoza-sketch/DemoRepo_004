package Constructor;

class ConstructorDemo {
	
	int x;
	int y;
	
	ConstructorDemo()	
	
	{
		x = 100;
		y = 200;
	}
	
	void display()
	
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
    ConstructorDemo cm1 = new ConstructorDemo();	
    cm1.display();
		


	}

}
