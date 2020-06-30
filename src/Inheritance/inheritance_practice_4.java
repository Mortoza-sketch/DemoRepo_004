package Inheritance;

class parent 

{
	int a;
	void display()
	
	{
		System.out.println(a);
	}
}
	
class child1 extends parent

{
	int b;
	void print ()
	
	{
		System.out.println(b);
	}
	
}


class child2 extends child1

{
	int c;
	void show ()
	
	{
		System.out.println(c);
	}
	
}


public class inheritance_practice_4 {

public static void main(String[] args) {
	
	child1 cd1 = new child1();
	cd1.a = 5;
	cd1.b = 10;
	cd1.display();
    cd1.print();

    child2 cd2 = new child2();
    cd2.b = 15;
    cd2.c = 20;
    cd2.a = 25;
    cd2.print();
    cd2.show();
    cd2.display();
	
	
	
	

	}

}
