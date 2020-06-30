package Overriding;

class Bank 

{
	double rateofinterest()
	
	{
		return 0;
	}
	
}

class CitiBank 

{
	double rateofinterest()
	
	{
		return 40;
	}
	
}


class BankofAmerica 

{
	double rateofinterest()
	
	{
		return 99;
	}
}

class CapitalOne

{
	double rateofinterest()
	
	{
		return 100;
	}
}


public class OverridingDemo {

public static void main(String[] args) {
	
	
	CitiBank ci = new CitiBank();
	System.out.println(ci.rateofinterest());
	
	BankofAmerica bo = new BankofAmerica();
	System.out.println(bo.rateofinterest());
	
	CapitalOne cp = new CapitalOne();
	System.out.println(cp.rateofinterest());
	
	

	}

}
