package Inheritance;
class A

{
	int a;
	void display ()
	
	{
		System.out.println(a);
	}
	
}
class B extends A

{
	int b;
	void print ()
	
	{
		System.out.println(b);
	}
	
	
}


public class inheritance_practice_1 {

	public static void main(String[] args) {
		
		A aobj = new A ();
		aobj.a = 10;
		aobj.display();
		
		B bobj = new B ();
		bobj.b= 20;
		bobj.a = 30;
		
		
		bobj.display();
        bobj.print();
	

	}

}
