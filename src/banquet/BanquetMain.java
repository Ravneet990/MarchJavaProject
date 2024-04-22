package banquet;

import java.util.Scanner;

public class BanquetMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Cost of Booking");

		double costOfBooking = sc.nextDouble();

		System.out.println("Enter the Cost of Food");

		double costOfFood = sc.nextDouble();

		System.out.println("Enter the Cost of Beverages");

		double costOfBeverages = sc.nextDouble();

		System.out.println("Enter the Cost of Tip");

		double costOfTip = sc.nextDouble();

		System.out.println("Enter the percentage tax value");

		double valueOfPercentage = sc.nextDouble();

		System.out.println("Enter the number of Guests visiting.");

		int numberOfGuests = sc.nextInt();

		Banquet cost = new Banquet();

		System.out.println("The Total Base Cost is :"
				+ cost.calculateBaseCost(costOfBooking, costOfFood, costOfBeverages, costOfTip));

//	System.out.println("The value of Base cost after applying tax is :" + cost.calculatetax);

		cost.calculatetax(cost.totalBaseCost, valueOfPercentage);

		System.out.println(

				"The value of Price with tax is : " + cost.calculatetax(cost.totalBaseCost, valueOfPercentage));

		cost.calculateCess(cost.totalBaseCost, numberOfGuests);

		System.out.println("The Cess price with " + numberOfGuests + " number of Guests will be : "
				+ cost.calculateCess(cost.totalBaseCost, numberOfGuests));
		
		cost.CalculateTotalCost(cost.totalAfterPercentage, cost.serviceCess);

		System.out.println("The Final cost after the tax and service charges is : " + cost.CalculateTotalCost(cost.totalAfterPercentage, cost.serviceCess));
	}

}
