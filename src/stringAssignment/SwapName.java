package stringAssignment;

import java.util.Scanner;

public class SwapName {

	Scanner sc = new Scanner(System.in);

	public void swapFirstAndLastName() {

		System.out.println("Enter your first name");

		String firstName = sc.next();

		System.out.println("Enter your last name");

		String lastName = sc.next();

//	 String[] newName = name.substring(0, name.length()-1);

		// System.out.println("New name " + name.substring(name.indexOf(0)));

		// System.out.println("New name: " + name.substring(0,
		// name.indexOf(name.length()-1)));

		String fullName = firstName + lastName;

		System.out.println("Your full name is: " + fullName);

		lastName = fullName.substring(0, fullName.length() - lastName.length());

		firstName = fullName.substring(lastName.length());

		String swappedName = firstName + lastName;

		System.out.println("The swapped name will be:" + swappedName);

	}

}
