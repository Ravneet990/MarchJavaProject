package inheritance3;

import inheritance2.Appliance;

public class AirFryer extends Appliance {
	
	

public AirFryer(String name, String modelNumber, double price) {
		super(name, modelNumber, price); // Calls the parent/ superclass constructor and initializes all the variables in it
		// TODO Auto-generated constructor stub
	}


public AirFryer() {
	// TODO Auto-generated constructor stub
}


public void displaySpecifications() {
		
		System.out.println("Display Specifications of " + name);
		
		System.out.println("Show airfryer details");
		
		System.out.println("Show warrenty details");

	}
	
}
