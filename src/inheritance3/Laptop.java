package inheritance3;

import inheritance2.Appliance;

public class Laptop extends Appliance {

	public Laptop() {
		super();
		System.out.println("In laptop no-arg constuctor");
	}

	public Laptop(String name, String modelNumber, double price) {
		super(name, modelNumber, price);

	}

// Method overriding - Run time polymorphism
	@Override
	public void displaySpecifications() {

		System.out.println("Display Specifications of " + name);

		System.out.println("Show processor details");

		System.out.println("Show Memory details");

	}

	public void orderAdditionalMemory() {

		System.out.println("Placing an order for an additional memory");
	}

}
