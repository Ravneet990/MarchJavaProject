package inheritance;

public class Appliance {
	
	String name;
	
	String mobileNumber;
	
	double price;
	
	
	
	public Appliance(String name, String mobileNumber, double price) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.price = price;
	}

	public void displayCustomerReviews() {
		
		System.out.println("Display customer reviews");
		
		
	}
	
	public void checkOffer() {
		
		System.out.println("Check the offers");
		
	}
	
	public void displaySpecifications() {
		
		System.out.println("Display specifications of " + name);
		
		System.out.println("Show processor details");
		
		System.out.println("Show RAM detials");
	}

}
