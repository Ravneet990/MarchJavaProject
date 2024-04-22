package waterTankAssignment;

import java.util.Scanner;

public class WaterTank {

	int waterTankCapacity = 11;

	int counter = 10;

	Scanner sc = new Scanner(System.in);

	public void fillWaterTank() {

		System.out.println("The capacity of water tank in litres right now is :  " + waterTankCapacity);

		if (counter != 0) {

			for (int i = 10; i <= 100; i++) {

				System.out.println("Do you want to add more water into the tank with bucket?");

				String addWater = sc.next();

				if (addWater.equalsIgnoreCase("yes")) {

					waterTankCapacity = waterTankCapacity + 10;

					System.out.println("The capacity of Water right now is : " + waterTankCapacity);

					counter--;

					if (counter == 0) {

						System.out.println("You have reached the maximum capacity of Water Tank");

						break;
					}

				}

				else if (addWater.equalsIgnoreCase("no")) {

					System.out.println("The Final Capacity of Water in litres is :" + waterTankCapacity);

					break;

				}

			}

		}

	}

}
