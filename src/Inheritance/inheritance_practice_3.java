package Inheritance;


   class T
   
   {
	   int t;
	   void display()
	   
	   {
		   System.out.println(t);
	   }
   }
   
   class U extends T
   
   {
	   int u;
	   void print()
	   
	   {
		   System.out.println(u);
	   }
   }
   
   class V extends U
   
   {
	   int v;
	   void show()
	   
	   {
		   System.out.println(v);
	   }
   }

   
public class inheritance_practice_3 {

public static void main(String[] args) {
	
	
	V vobj = new V ();
	
	vobj.t = 10;
	vobj.u = 20;
	vobj.v = 30;
	
	vobj.display();
    vobj.print();
    vobj.show();


	}

}
