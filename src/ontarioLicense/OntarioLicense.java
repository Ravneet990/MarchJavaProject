package ontarioLicense;

import java.util.Scanner;

public class OntarioLicense {

	int age;

	boolean isLevelCleared;
	
	boolean isLevelCleared1;

	Scanner sc = new Scanner(System.in);

	Scanner sc1 = new Scanner(System.in);
	
	Scanner sc2 = new Scanner(System.in);

	
	void checkOntarioLicense() {

		System.out.println("Enter Age");

		age = sc.nextInt();

		if (age >= 16) {

			System.out.println("You are eligible to give G1 written test");

			System.out.println("Did you clear G1 written test?");

			isLevelCleared = sc1.nextBoolean();
			
			if (isLevelCleared) {
				
				System.out.println("You are eligible to give G2 driving test");
				
				System.out.println("Did you clear G2 driving test?");
				
				isLevelCleared1 = sc2.nextBoolean();
				
				if(isLevelCleared1) {
					
					System.out.println("You are eligible to give G driving test");
				}
				else {
					
					System.out.println("Try giving G2 driving test again.");
				}
			}
			
			else {
				
				System.out.println("Try giving G1 test again.");
			}
		}
		
		else {
			
			System.out.println("You are not eligible to a drivers license");

		}
	}
}

