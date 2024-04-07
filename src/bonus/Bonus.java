package bonus;

import java.util.Scanner;

public class Bonus {

	double salary;

	double totalSalary;

	double bonus;

	String employee;

	boolean isEnoughSales;

	Scanner sc = new Scanner(System.in);

	void calculateBonus() {

		System.out.println("Please enter your Salary");
		
		salary = sc.nextDouble();

		if (salary <= -1) {
			
			System.out.println("Incorrect input. The salary cannot be less than zero");
		}

		else if (salary > 0 && salary <= 20000) {

			bonus = 7 / 100;

			totalSalary = salary + salary*bonus;

			System.out.println("The total salary including bonus is : " + totalSalary);
		}
		
		else if (salary > 20000 && salary <= 40000) {
			
			bonus = 5 / 100;
			
			totalSalary = salary + salary*bonus ;
			
			System.out.println("The total salary including bonus is : " + totalSalary);
		}
		
		else if (salary > 40000 && salary <= 80000) {
			
			bonus = 3.5 / 100;
			
			totalSalary = salary + salary*bonus ;
			
			System.out.println("The total salary including bonus is : " + totalSalary);
		}
		
		else {
			
			bonus = 0 ;
			
			totalSalary = salary ;
			
			System.out.println("The bonus does not apply. Your total salary is : " + totalSalary);
		}
	}

}
