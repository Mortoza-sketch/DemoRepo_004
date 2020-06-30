package Array_List;

import java.util.ArrayList;

public class Array_List {
		
public static void main(String[] args) {
	
	ArrayList<String> cars = new ArrayList<String>();
	
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    for (String i : cars) 
    	
    {  System.out.println(i); }

}
}