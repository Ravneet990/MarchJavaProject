package accountReturnType;

import java.util.Scanner;

public class AccountWithConstructor {

	public String nameOfAccountHolder;

	String rajinderAccount;

	String accountNumber;

	double balance;

	int pin;

	String accountType;
	
//	public AccountWithConstructor(String name, String accntType, String accntNum, double bal, int pin1) {
//	
//		nameOfAccountHolder = name;
//		accountType = accntType;
//		accountNumber = accntNum;
//		balance = bal;
//		
//		pin = pin1;
//	}
	
	

	public AccountWithConstructor(String nameOfAccountHolder, String accountNumber,
			double balance, int pin, String accountType) {
		super();
		this.nameOfAccountHolder = nameOfAccountHolder;
//		this.rajinderAccount = rajinderAccount;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
		this.accountType = accountType;
	}

public AccountWithConstructor() {
	
	
}

	public String getNameOfAccountHolder() {

		return nameOfAccountHolder;

	}

	public double getBalance() {

		return balance;
	}

	public String getAccountType() {

		return accountType;
	}

	public String getAccountNumber() {

		return accountNumber;

	}

	public boolean validatePin(int pinEntered) {

		if (pin == pinEntered) {

			return true;
		}
		return false;

	}

	public boolean validateCredentials(String accountNumberEntered, int pinEntered) {

		if (accountNumber.equals(accountNumberEntered))

			if (validatePin(pinEntered)) {

				return true;
			}
		return false;
	}

	public AccountWithConstructor getAccountIfValidateCredentials(String accountNumberEntered, int pinEntered, AccountWithConstructor[] accounts) {

		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i].getAccountNumber().equals(accountNumberEntered)) { // did not get accounts[i].getAccountNumber

				if (accounts[i].pin==pinEntered) { // if we had method getPinEntered then we can write this line as accounts[i].getPinEntered same as line number 66

					return accounts[i];
				}
			}
		}
		return null;

	}
	
	public void printCredentials() {
		
		System.out.println("Account Holder Name:" + getNameOfAccountHolder()); // or 	System.out.println("Account Holder Name:" + ac.getNameOfAccountHolder());
		
		System.out.println("Type of Account : " + getAccountType()); // or 		System.out.println("Type of Account : " + ac.getAccountType());
		
		System.out.println("Account Balance : " + getBalance()); // System.out.println("Account Balance : " + ac.getBalance());
		
		
	}

}
