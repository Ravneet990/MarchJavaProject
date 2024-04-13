package amusementPark;

import java.util.Scanner;

public class AmusementPark {

	double height;

	int numberOfPeople;

	boolean isRideOverfilling = false;

	Scanner sc = new Scanner(System.in);

	Scanner sc1 = new Scanner(System.in);

	void validateRide() {

		System.out.println("Enter you height in cm");

		height = sc.nextDouble();

		if (height > 90 && height < 200) {

			for (int numberOfPeople = 1; numberOfPeople <= 10; numberOfPeople++) {

				System.out.println("Enter number of people already in the ride");

				numberOfPeople = sc1.nextInt();

				if (numberOfPeople < 10) {

					numberOfPeople = numberOfPeople + 1;
					isRideOverfilling = true;

					System.out.println("You are at position " + numberOfPeople + " in the ride. You can take the ride.");

					break;

				}
				
				else if (!isRideOverfilling) {

					System.out.println("The ride has filled to its Maximum capacity.");

				}

			}
		}


		else {

			System.out.println("You are not allowed to take the ride due to height constraint");
		}
	}
}
