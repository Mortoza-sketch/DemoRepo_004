package Overloading;

public class ovmm {
	
	public void main (int x)
	
	{
		System.out.println(x);
	}
	
	public void main (int x, int y)
	
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		ovmm ov = new ovmm ();
		ov.main(1);
		ov.main(2, 3);
	

	}

}
