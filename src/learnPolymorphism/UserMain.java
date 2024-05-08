package learnPolymorphism;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserAccount user = new UserAccount("987456221", 6541);

		user.setUserName("user123");

		user.setPassword("user12345");

		Scanner sc = new Scanner(System.in);

		System.out.println("Which operation do you want to perform? ATM or Online?");

		String operationEntered = sc.next();
		
		boolean isUserValid = false;

		switch (operationEntered) {
		case "ATM":

			isUserValid = user.validateUser("987456221", 6541);

			break;

		case "Online":

			isUserValid = user.validateUser("user123", "user12345");

			break;

		default:
			
			System.out.println("Invalid operation. Enter ATM or Online option only");
			
			break;
		}
		
		if(isUserValid) {
			
			System.out.println("Balance is :" + user.getBalance());
		}
		else {
			
			System.out.println("Invalid Credentials");
		}

	}

}
