package completeBankingAssignment;

import java.util.Scanner;

public class PersonalAccountDetails {

	private String accountNumber;

	private String nameOfAccountHolder;

	private double totalFunds = 5000;

	private int savedPin = 6547;

	private String savedOnlineBankingPassword = "123654ab";

	Scanner sc = new Scanner(System.in);

	public void chooseOperation() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Which operation do you want to perform? Withdraw, Deposit or View Balance?");

		String op = sc.next();

		switch (op) {
		case "Withdraw":

			withdrawAmount();

			break;

		case "Deposit":
			
			depositAmount();

			break;

		case "View":
			
			viewTotalFunds();

			break;

		default:
			
			System.out.println("Not a valid option");
			chooseOperation();
				
			break;
		}

	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getNameOfAccountHolder() {
		return nameOfAccountHolder;
	}

	public double getTotalFunds() {
		return totalFunds;
	}

	public int getSavedPin() {
		return savedPin;
	}

	public void setSavedPin(int savedPin) {
		this.savedPin = savedPin;
	}

	public String getSavedOnlineBankingPassword() {
		return savedOnlineBankingPassword;
	}

	public void setSavedOnlineBankingPassword(String savedOnlineBankingPassword) {
		this.savedOnlineBankingPassword = savedOnlineBankingPassword;
	}

	public void withdrawAmount() {

		System.out.println("Please enter the amount you want to withdraw");

		double withdrawMoney = sc.nextDouble();

		if (withdrawMoney < getTotalFunds()) {

			double newAmount = getTotalFunds() - withdrawMoney;

			System.out.println("You new balance is :" + newAmount);

		} else {

			System.out.println("The amount entered must be less than you balance");
		}
	}

	public void depositAmount() {

		System.out.println("Please enter the amount you want to deposit");

		double deposit = sc.nextDouble();

		double newAmount = getTotalFunds() + deposit;

		System.out.println("You new balance is :" + newAmount);

	}
	
	public void viewTotalFunds() {

		System.out.println("Your total funds are: " + getTotalFunds());


	}
	
//	public boolean validatePassword(String enteredPassword) {
//		
//		if(get)
//	}

}
