package accountReturnType;

import java.util.Scanner;

public class Account {

	String nameOfAccountHolder;

	String rajinderAccount;

	String accountNumber;

	int balance;

	int pin;

	public String accountType;
	
	public Account() {
	
	}

	public String getNameOfAccountHolder() {

		return nameOfAccountHolder;

	}

	public int getBalance() {

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

	public Account getAccountIfValidateCredentials(String accountNumberEntered, int pinEntered, Account[] accounts) {

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
