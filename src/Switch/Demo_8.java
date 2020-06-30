package Switch;

import java.util.Scanner;

public class Demo_8 {

	public static void main(String[] args) {
	
		
	Scanner userInput = new Scanner (System.in);
	System.out.println("Enter Your Grade: ");
	
	String grade = userInput.next();
	grade = grade.toUpperCase();
	switch (grade)
	
	{
	
	case "A": System.out.println("Congratulations! Your score range is "
                                + "in between 75-100");break;
                                
	case "B": System.out.println("Your score range is in between 60-75"); break;                            
	case "C": System.out.println("Your Score range is in between 50-60"); break;
	case "D": System.out.println("Your score range is in between 40-50"); break;
	case "F":
		    System.out.println("Sorry!");
		    System.out.println("You don't have enough score to continue this course");break;
		    
	default: System.out.println("You have entered an invalid Grade");	    
		      
		   
	
	
	
                                
	
	
	
	
	}
	
	
		
	}

}
