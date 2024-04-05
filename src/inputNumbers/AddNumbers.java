package inputNumbers;

import java.util.Scanner;

public class AddNumbers {

	int num1, num2, result;

	Scanner input = new Scanner(System.in);

	void addTwoNumbers() {

		System.out.println("Enter num1");

		num1 = input.nextInt();

		System.out.println("Enter num2");

		num2 = input.nextInt();

		result = num1 + num2;

		System.out.println(result);

		System.out.println("Addition of two numbers is :" + result);

	}

}
