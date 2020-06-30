package Practice_for_Mentoring;

public class Employee {
	
		String name;  // Instance Variable
		int age;      // Instance Variable
		
// Instance Variables are variables that are declare inside a class, but outside of any method, block or constructor
		
		static int companyCode = 2000;
		
// Static are class variable declared with static keyword			
// Static variable are initialized only once				
		
               public int getSalary() {
            	  
                    int salary = 60000;	// Local Variable
                    int tax = 10000;   // Local Variable
                    salary = salary - tax;
                    return salary;

}

}