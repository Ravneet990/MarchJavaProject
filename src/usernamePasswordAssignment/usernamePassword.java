package usernamePasswordAssignment;

import java.util.Scanner;

public class usernamePassword {

	String inputusername;

	String inputpassword;

	String userID = "pivotAdmin";

	String password = "Admin123";

	int maxAttempts = 3;

	Scanner sc = new Scanner(System.in);


	public void compareUsernamePassword() {

		for (int i = 0; i < 3; i++) {

//		while (true) {

			System.out.println("Enter username");

			inputusername = sc.next();

			System.out.println("Enter password");

			inputpassword = sc.next();

			if ((inputusername.equals(userID)) && (inputpassword.equals(password)))

			{

				System.out.println("You are logged in to the application.");
				break;

//				break;

			}

			else if ((!inputusername.equals(userID)) && (!inputpassword.equals(password)))

				System.out.println("Incorrect UserID or Password.");

			maxAttempts--;

		}

		if (maxAttempts == 0) {

			System.out.println("Max attempts reached. Your account is blocked");
//				break;
		}

	}

}
