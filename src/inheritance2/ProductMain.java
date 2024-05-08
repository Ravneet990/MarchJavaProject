package inheritance2;

import inheritance3.AirFryer;
import inheritance3.Laptop;

public class ProductMain {

	public static void main(String[] args) {
		
		Appliance laptop = new Appliance("Asus Laptop", "FXTM01012", 900);
		
	//	Appliance airFryer = new Appliance("Philips AirFryser", "PH78462", 70);
		
		laptop.displaySpecifications();
		
		
		Laptop hpLaptop = new Laptop();
		
		hpLaptop.displaySpecifications();
		
		hpLaptop.name = "HP Laptop";
		
		hpLaptop.modelNumber = "x456987";
		
		hpLaptop.price = 900;
		
		System.out.println("Display price" + hpLaptop.price);
		
		hpLaptop.displayCustomerReviews();
		
		AirFryer airFryer = new AirFryer();
		
		airFryer.name = "Phillips AirFryer";
		
		airFryer.modelNumber = "PH4567";
		
		airFryer.price = 500;
		
		Reviews airFryerReview = new Reviews();
		
		airFryerReview.rating = 4;
		
		String[] airFryerComments = {"Good product" , "excellent AirFryer" , "stopped working after 6 months"};
		
		airFryerReview.setComments(airFryerComments);
		
		airFryer.customerReview = airFryerReview;
		
		airFryer.displaySpecifications();
		
		airFryer.displayCustomerReviews();
		
		WashingMachine washingMachine = new WashingMachine();
		
		washingMachine.setNum("10");
		
		Reviews customerReviewForWM = new Reviews();
		
		customerReviewForWM.setRating(3.5);
		
		String[] comments = {"Good product" , "excellent" , "stopped working after 6 months"};
		
		customerReviewForWM.setComments(comments);
		
		washingMachine.customerReview = customerReviewForWM;
		
//		washingMachine.customerReview = new Reviews();
//		
//		washingMachine.customerReview.setRating(3.5);
//		
//		String[] comments = {"Good product" , "excellent" , "stopped working after 6 months"};
//		
//		washingMachine.customerReview.setComments(comments);
//		
//		washingMachine.displayCustomerReviews();
	}

}
