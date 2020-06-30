package Abstract;

abstract class Zoo {
	
public void display()	

{
	System.out.println("Animals are in the zoo");
}
	
}

class home extends Zoo{
	
	public void show ()
	
	{
		System.out.println("Cat stays at home");
	}
	
}


public class Abstract_Demo_2 {

public static void main(String[] args) {
	
	home obj = new home();
	obj.display();
    obj.show(); 
	
	}

}
