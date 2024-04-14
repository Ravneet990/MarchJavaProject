package pizzaShopPractice;

import java.util.Scanner;

public class PizzaShopPractice {

	double price;

	String orderName;

	Scanner sc = new Scanner(System.in);

	double finalBill;

	boolean wouldWantPepperoni = false;

	public double prepareFinalBill() {

		System.out.println("Do you want Small, Medium or Large Pizza?");

		String size = sc.next();

		switch (size) {
		case "small":

			price = 15;

			System.out.println("The price of small pizza is : $" + price);

			System.out.println("Would you like to have Pepperoni on your pizza?");

			String pepperoni = sc.next();

			switch (pepperoni) {

			case "yes":

				price = price + 2;

				System.out.println("Your new price is: " + price);
				
				System.out.println("Would you like Cheese on your pizza?");

				String cheese = sc.next();

				switch (cheese) {

				case "yes":

					price = price + 1;

					System.out.println("Your new price is: " + price);

					break;

//				case "no":
//
//					System.out.println("Your price is:" + price);
//
//					break;
				}

				break;

			case "no":

				System.out.println("Would you like to have Cheese on your pizza?");

				String cheese1 = sc.next();

				switch (cheese1) {

				case "yes":

					price = price + 1;

					System.out.println("Your new price is: " + price);

					break;
				}

//				case "no":
//
//					System.out.println("Your price is:" + price);
//
//					break;
//				}
//				
//				System.out.println("Your price is:" + price);
//				
				

//				break;
			}

			break;
			
		case "medium":

			price = 20;

			System.out.println("The price of medium pizza is : $" + price);

			System.out.println("Would you like to have Pepperoni on your pizza?");

			String pepperoni1 = sc.next();

			switch (pepperoni1) {

			case "yes":

				price = price + 3;

				System.out.println("Your new price is: " + price);
				
				System.out.println("Would you like Cheese on your pizza?");

				String cheese = sc.next();

				switch (cheese) {

				case "yes":

					price = price + 1;

					System.out.println("Your new price is: " + price);

					break;

//				case "no":
//
//					System.out.println("Your price is:" + price);
//
//					break;
				}

				break;

			case "no":

				System.out.println("Would you like to have Cheese on your pizza?");

				String cheese1 = sc.next();

				switch (cheese1) {

				case "yes":

					price = price + 1;

					System.out.println("Your new price is: " + price);

					break;
				}

//				case "no":
//
//					System.out.println("Your price is:" + price);
//
//					break;
//				}
//				
//				System.out.println("Your price is:" + price);
//				
//				
//
//				break;
			}

			break;
			
		case "large":

			price = 25;

			System.out.println("The price of large pizza is : $" + price);

			System.out.println("Would you like to have Pepperoni on your pizza?");

			String pepperoni3 = sc.next();

			switch (pepperoni3) {

			case "yes":

				price = price + 3;

				System.out.println("Your new price is: " + price);
				
				System.out.println("Would you like Cheese on your pizza?");

				String cheese = sc.next();

				switch (cheese) {

				case "yes":

					price = price + 1;

					System.out.println("Your new price is: " + price);

					break;

//				case "no":
//
//					System.out.println("Your price is:" + price);
//
//					break;
				}

				break;

			case "no":

				System.out.println("Would you like to have Cheese on your pizza?");

				String cheese1 = sc.next();

				switch (cheese1) {

				case "yes":

					price = price + 1;

					System.out.println("Your new price is: " + price);

					break;
				}

//				case "no":
//
//					System.out.println("Your price is:" + price);
//
//					break;
//				}
//				
//				System.out.println("Your price is:" + price);
//				
//				
//
//				break;
			}

			break;
			
			
			

		
		}
		return price;

	}
}
