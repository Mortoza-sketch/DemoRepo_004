package Practice_for_Mentoring;

public class Multi_Array_Practice_4 {

	public static void main(String[] args) {
	
	int a [][] = {{100,200}, {300,400}, {500,600}};
	
	a [0][0] = 100;
	a [0][1] = 200;
	
	a [1][0] = 300;	
	a [1][1] = 400;
	
	a [2][0] = 500;
	a [2][1] = 600;
	
	
	System.out.println("The number of Rows are: " +a.length);
	System.out.println("The number of Columns are: " +a[0].length);
	
	
	for (int r[]:a)
		
	{
		for (int i:r)
			
		{
			System.out.println(i);
		}
	}
	
	

	}

}
