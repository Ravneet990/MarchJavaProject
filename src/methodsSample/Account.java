package methodsSample;

public class Account {

	String nameOfAccountHolder;

	String accountNumber;

	String accountType;

	double balance;

	int pin;

	public String getNameOfAccountHolder() {

		return nameOfAccountHolder;
	}

	public double getBalance() {

		return balance;
	}

	public String getaccountNumber() {

		return accountNumber;
	}

	public String getaccountType() {

		return accountType;
	}

	public boolean validatePin(int pinEntered) {

		if (pin == pinEntered) {

			return true;

		}
		return false;

	}

	public boolean validateCredentials(String accountNumberEntered, int pinEntered) {

		if (accountNumber.equals(accountNumberEntered)) {

			if (validatePin(pinEntered)) {

				return true;
			}

		}
		return false;

	}

	public Account getAccountIfValidCredentials(String accountNumberEntered, int pinEntered, Account[] accounts) {

		for (int i = 0; i < accounts.length; i++)

			if (accounts[i].getaccountNumber().equals(accountNumberEntered)) {

				if (accounts[i].pin == pinEntered) {

					return accounts[i];

				}
			}
		return null;

	}

	public void displayAccountDetails() {

		System.out.println("Account Holder name :" + getNameOfAccountHolder());
		System.out.println("Type of Account :" + getaccountType());
		System.out.println("Accounts Balance is: " + getBalance());

	}

}
