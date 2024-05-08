package inheritance3;

import inheritance2.Appliance;
import inheritance2.WashingMachine;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Appliance app = new Appliance();
//		
//		AirFryer airFryer = new AirFryer("Braun AirFryer", "HGH1235", 100.0);
//		
//		airFryer.displaySpecifications();
//		
//		airFryer.setNum("11");
//		
//		//Object / Reference variable - mac
//		// mac is a reference variable of type Macbook
//		Macbook mac = new Macbook();
//		
//		mac.orderAdditionalMemory();
//		
//		mac.displayCustomerReviews();
//		
//		mac.displaySpecifications();

// Parent reference variable: 
// referring to object of child class using parent reference variable

		Laptop laptop = new Macbook();

		Appliance appliance = new Macbook();

		Appliance appliance2 = new AirFryer();

		Appliance appliance3 = new WashingMachine();

		appliance.displayCustomerReviews();

		appliance.displaySpecifications();

		System.out.println("________________________");

		appliance2.displayCustomerReviews();

		appliance2.displaySpecifications();

		System.out.println("________________________");

		appliance3.displayCustomerReviews();

		appliance3.displaySpecifications();
		
		Appliance hplaptop = new Laptop(); 
		
		hplaptop.displayCustomerReviews();
		
		Laptop laptop3 = new Laptop();
		
		laptop3.orderAdditionalMemory();
		
		
		

	}

}
