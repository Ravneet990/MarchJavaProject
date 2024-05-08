package learnPolymorphism;

public class PolymorphismExample {
	
	// Polymorphism or compile type polymorphism or compile type polymorphism

	public void addNumbers(int num1, int num2) {

		int sum = num1 + num2;

		System.out.println("Sum of two numbers is :" + sum);

	}
	// polymorphism by changing number of arguments

	public void addNumbers(int num1, int num2, int num3) {

		int sum = num1 + num2 + num3;

		System.out.println("Sun of three numbers is :" + sum);

	}

	// polymorphism by changing type of arguments

	public void addNumbers(double num1, double num2) {

		double sum = num1 + num2;

	}

	public void addNumbers(double num1, double num2, double num3) {

		double sum = num1 + num2 + num3;

		System.out.println("Sun of three numbers is :" + sum);

	}

	public void addNumbers(int num1, double num2) {

		double sum = num1 + num2;

	}
	
	// polymorphism by changing type of arguments

	public void addNumbers(double num1, int num2) {

		double sum = num1 + num2;

	}

}
