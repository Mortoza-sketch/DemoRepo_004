package Abstract;

abstract class Animal{
	
public abstract void sound();	

public void eat ()

{
	System.out.println("Animals are eating");
}
	
}

class cat extends Animal{

public void sound() {
	
	System.out.println("Cats are eating");
	
		
	}
	
}


public class Abstract_Demo_1 {

public static void main(String[] args) {

	cat obj = new cat ();
	obj.sound();
    obj.eat();  
    
	}

}
