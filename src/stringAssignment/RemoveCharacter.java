package stringAssignment;

import java.util.Scanner;

public class RemoveCharacter {

	String name;

	Scanner sc = new Scanner(System.in);

	public void removeFirstAndLastCharacter() {

		System.out.println("Enter your name");

		String name = sc.next();

//	 String[] newName = name.substring(0, name.length()-1);

		// System.out.println("New name " + name.substring(name.indexOf(0)));

		// System.out.println("New name: " + name.substring(0,
		// name.indexOf(name.length()-1)));

		System.out.println("New name: " + name.substring(1, name.length() - 1));

	}

}
