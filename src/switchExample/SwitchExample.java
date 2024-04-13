package switchExample;

import java.util.Scanner;

public class SwitchExample {

	Scanner sc = new Scanner(System.in);

	void exampleOfSwitchCase() {

		System.out.println("Enter the brand name you wanna see");

		String brandName = sc.next();

		switch (brandName) {
		case "Audi":

			System.out.println("The cars are : RS5 , A5 ");

			break;

		case "Toyota":

			System.out.println("The cars are : Corolla, Camry");

			break;
		case "Hyundai":

			System.out.println("The car is : Elantra");

			break;
		case "Honda":
			System.out.println("The cars are : Civic, Pilot");
			break;

		default:

			System.out.println("Select Cars from Toyota, Hyundai, Audi or Honda");
			break;
		}
	}

	public void daysOfTheWeek() {

		System.out.println("Enter the number of day");

		int numberOfDay = sc.nextInt();
		
		switch (numberOfDay) {
		case 1:

			System.out.println("Sunday");
			
			System.out.println("Enter the city to visit");
			
			String cityName = sc.next();
			
			if(cityName == "Niagara") {
				
				System.out.println("You can see Niagara Falls");
				
			}
				
				else
					
				{
					
					System.out.println("Looks like you don't like Niagara Falls");
				}
			
			break;

		case 2:

			System.out.println("Monday");

			break;
		case 3:

			System.out.println("Tuesday");

			break;
		case 4:

			System.out.println("Wednesday");

			break;
		case 5:
			System.out.println("Thursday");

			break;
		case 6:

			System.out.println("Friday");

			break;
		case 7:

			System.out.println("Saturday");

			break;

		default:

			System.out.println("Enter a valid number day of the week");
			break;
		}
	}

}
