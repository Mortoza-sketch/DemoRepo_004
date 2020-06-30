package Switch;

import java.util.Scanner;

public class Demo_6 {

	public static void main(String[] args) {
	
		
	Scanner userInput = new Scanner (System.in);
	System.out.println("Enter Your Grade: ");
	
	
	String grade = userInput.next();
	grade = grade.toUpperCase();
	switch (grade)
	
	{
	case "A": System.out.println("Congratulations! your mark is" +
	                               "in the range of 75-100");break;
	
	case "B": System.out.println("Your mark is in the range of 60 -75");break;	
	case "C": System.out.println("Your mark is in the range of 50-60");break;
	case "D": System.out.println("Your mark is in the range of 40-50");break;
	case "F": System.out.println("Sorry! Your score" +
                                          " is not enough to follow thw course");break;        

    default:  System.out.println("Error!");
              System.out.println("The Grade you have entered is not valid");
   
	
	
	}

	}

}
