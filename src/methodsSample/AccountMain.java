package methodsSample;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Account jerinAccount = new Account();

		jerinAccount.accountNumber = "123456789";

		jerinAccount.nameOfAccountHolder = "Jerin Raj";

		jerinAccount.accountType = "Chequing account";

		jerinAccount.balance = 4567.82;

		jerinAccount.pin = 1234;

	//	String ac = jerinAccount.getaccountNumber();

	//	System.out.println("jerin Account is : " + ac);

	//	System.out.println("Jerin Account is :" + jerinAccount.getaccountNumber());

		Account ravneetAccount = new Account();

		ravneetAccount.accountNumber = "456789";

		ravneetAccount.nameOfAccountHolder = "Ravneet Kaur";

		ravneetAccount.accountType = "Savings account";

		ravneetAccount.pin = 1234;

		ravneetAccount.balance = 789456;

		Account jagAccount = new Account();

		jagAccount.accountNumber = "456845";

		jagAccount.nameOfAccountHolder = "Jag Singh";

		jagAccount.accountType = "Savings account";

		jagAccount.pin = 4569;

		jagAccount.balance = 654665;

	//	String[] names = { "Rav", "Prabh", "Arsh", "Jerin" };

		Account[] accounts = { jerinAccount, ravneetAccount, jagAccount };

		// jerin account balance

		System.out.println(accounts[0].getBalance());

		Scanner sc = new Scanner(System.in);

		System.out.println(accounts[2].getBalance());

		System.out.println("Enter your account number");

		String accountNumberEntered = sc.next();

		System.out.println("Enter your Pin number");

		int pinEntered = sc.nextInt();

//		for (int i = 0; i < accounts.length; i++) {
//
//			if (accounts[i].getaccountNumber().equals(accountNumberEntered)) {
//				
//				boolean isPinValid = accounts[i].validatePin(pinEntered);
//				
//				if (isPinValid) {
//
//				System.out.println("Account Holder name :" + accounts[i].getNameOfAccountHolder());
//				System.out.println("Type of Account :" + accounts[i].getaccountType());
//			
//			System.out.println("Accounts Balance is: " + accounts[i].getBalance());
//			break;
//			}
//			else {
//				
//				System.out.println("Your pin is incorrect");
//				
//				break;
//			}
//
//		}
//
//	}

		boolean isAccountValidated = false;

//		for (int i = 0; i < accounts.length; i++) {
//
//			if (accounts[i].validateCredentials(accountNumberEntered, pinEntered)) {
//				System.out.println("Account Holder name :" + accounts[i].getNameOfAccountHolder());
//				System.out.println("Type of Account :" + accounts[i].getaccountType());
//				System.out.println("Accounts Balance is: " + accounts[i].getBalance());
//				isAccountValidated = true;
//
//				break;
//
//			}
//
//			if (!isAccountValidated) {
//
//				System.out.println("Incorrect credentials");
//			}
//
//		}

		Account account = new Account();

		account = account.getAccountIfValidCredentials(accountNumberEntered, pinEntered, accounts);
		
		account.displayAccountDetails();

//		System.out.println("Account Holder name :" + account.getNameOfAccountHolder());
//		System.out.println("Type of Account :" + account.getaccountType());
//		System.out.println("Accounts Balance is: " + account.getBalance());

	
		Account account1 = new Account();
		
		account1.displayAccountDetails();
	
	}
	
	
}
