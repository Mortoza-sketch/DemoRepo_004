package Inheritance;

   class F

{
	int a;
	void display ()
	
	{
		System.out.println(a);
	}
	
}

    class G extends F
    
    {
    	int b;
    	void print ()
    	
    	{
    		System.out.println(b);
    	}
    }


public class Inheritance_Practice_2 {

	public static void main(String[] args) {
		
	   F aobj = new F ();
	   aobj.a = 100; 
		
	   aobj.display();

       G bobj = new G();
       bobj.b = 200;  
       bobj.a = 300;
       
       bobj.print();
       bobj.display();
       
       	
	
	}

}
