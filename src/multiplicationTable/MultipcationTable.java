package multiplicationTable;

import java.util.Scanner;

public class MultipcationTable {

	Scanner input = new Scanner(System.in);

	void CreateMultiplicationTable() {

		System.out.println("Input the number");

		int num1 = input.nextInt();

		System.out.println("Input the seccond number");

		int num2 = input.nextInt();

		System.out.println(num1 + "x" + num2 + "=" + num1 * num2);
	}

}
