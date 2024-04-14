package usernamePasswordAssignment;

import java.util.Scanner;

public class usernamePassword {

	String inputusername;

	String inputpassword;

	String userID = "pivotAdmin";

	String password = "Admin123";

	int maxAttempts = 3;

	Scanner sc = new Scanner(System.in);

	Scanner sc1 = new Scanner(System.in);

	public void compareUsernamePassword() {
		if (maxAttempts != 0) {

			for (int i = 0; i < 3; i++) {

//		while (true) {

				System.out.println("Enter username");

				inputusername = sc.next();

				System.out.println("Enter password");

				inputpassword = sc1.next();

				if (inputusername.equals(null) && (inputpassword.equals(null)))

				{

					System.out.println("Enter username and password");

//				break;

				} else if ((inputusername.equals(userID)) && (inputpassword.equals(password)))

				{

					System.out.println("You are logged in to the application.");

					break;

				}

				else {

					System.out.println("Incorrect UserID or Password. Please try again.");

					maxAttempts--;

				}
			}
		}

		else if (maxAttempts == 0) {

			System.out.println("Max attempts reached;");
//				break;
		}

	}
}
