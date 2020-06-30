package Practice_for_Mentoring;

public class Multi_Array_Practice {

	public static void main(String[] args) {
	
	int a [][]= new int [3][2];	
	
	a[0][0] = 100;
	a[0][1] = 200;
	
	a[1][0] = 300;
	a[1][1] = 400;
	
	a[2][0] = 500;
	a[2][1] = 600;
	
	System.out.println("Number of Rows are: " +a.length);
	System.out.println("Number of Colums are: " +a[0].length);
	
	for 
	    (int i= 0; i<a.length;i++)
		
	{
		for (int j=0; j<a[0].length; j++)
		{
		
		System.out.println(a[i][j]);
		}
	
	}
	
	
	

	}

}
