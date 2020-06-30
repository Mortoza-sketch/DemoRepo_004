package Abstract;

abstract class Teacher {
	
public void display()	

{
	System.out.println("Teacher is in the class");
}
		
}


class Students extends Teacher {
	
public void show()	

{
	System.out.println("But the students hate that teacher");
}
	
}

public class Abstract_Demo_3 {

public static void main(String[] args) {
	
Students obj = new Students ();
obj.display();
obj.show();
		
		
		
	}

}
