package Abstract;

abstract class Animals {
	
public abstract void sound();	  // nobody

public void eat ()

{
	System.out.println("Animals are eating");
}
}	


//subclass
class dog extends Animals{

public void sound()

{
	System.out.println("The dog is eating");
}
}

public class Abstract {

public static void main(String[] args) {
	
	dog obj = new dog ();
	obj.sound();
	obj.eat();
	
}

	}


