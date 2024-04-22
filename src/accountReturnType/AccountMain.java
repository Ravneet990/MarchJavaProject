package accountReturnType;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		// Contructor without parameter
//Account ravneetAccount = new Account();
	
		Account ravneetAccount = new Account();
	ravneetAccount.accountNumber = "12345679";
		
		ravneetAccount.nameOfAccountHolder = "Ravneet Kaur";
		
		ravneetAccount.accountType = "Chequing";
		
		ravneetAccount.balance = 789546;
		
		ravneetAccount.pin = 123456;
		
		
		String accountNumber = ravneetAccount.getAccountNumber();
		
		
//			System.out.println("Ravneet Account : " + accountNumber);
		
//		System.out.println("Ravneet Account : " + ravneetAccount.getAccountNumber());

	
	
	Account jerinAccount = new Account();
	
	jerinAccount.accountNumber = "7894564";
	
	jerinAccount.nameOfAccountHolder = "Jerin Raj";
	
	jerinAccount.accountType = "Savings";
	
	jerinAccount.balance = 4561;
	
	jerinAccount.pin = 456123;
	
	Account rajinderAccount = new Account();
	
	
	rajinderAccount.accountNumber = "7894561";
	
	rajinderAccount.nameOfAccountHolder = "Rajinder Kaur";
	
	rajinderAccount.accountType = "Chequing";
	
	rajinderAccount.balance = 78444;
	
	rajinderAccount.pin = 78945;
	
//	String[] names = {"Prabh", "Arsh",  "Mani"};
	
	Account[] accounts = {ravneetAccount , jerinAccount , rajinderAccount};
	
//	System.out.println("Balance in Jerin account is : " + accounts[1].getBalance()); // here can I use accounts[1].balance? it shows same result.

//	System.out.println("Balance of Rajiner account is : " + accounts[2].getBalance());
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter account number");
	
	String accountNumEntered = sc.next();
	
	System.out.println("Enter the pin");
	
	int pintEntered = sc.nextInt();
	
//	for (int i = 0; i<accounts.length;i++) {
//		
//		if (accounts[i].getAccountNumber().equals(accountNumEntered)) {
//			
//			boolean isPinValid = accounts[i].validatePin(pintEntered);
//			
//			if (isPinValid) {
//			
//			System.out.println("Account Holder Name : " + accounts[i].getNameOfAccountHolder());
//			
//			System.out.println("Type of Account is : " + accounts[i].getAccountType());
//			
//			System.out.println("Balance is : " +accounts[i].getBalance());
//			
//			
//			
//		}
//			else {
//				
//				System.out.println("Pin is not correct");
//			}
//		}break;
//	}
	
	boolean isAccountValidated = false;
	
//	for (int i=0; i <accounts.length; i++) {
//		
//		if (accounts[i].validateCredentials(accountNumEntered, pintEntered)) {
//			
//			System.out.println("Account Holder Name : " + accounts[i].getNameOfAccountHolder());
//	
//			System.out.println("Type of Account is : " + accounts[i].getAccountType());
//			
//			System.out.println("Balance is : " +accounts[i].getBalance());
//			
//			isAccountValidated = true;
//			
//			break;
//		}
//	}
//	if (!isAccountValidated) {
//		
//		System.out.println("Account details are not correct");
//	}
	
	
	Account ac = new Account();
	
	ac = ac.getAccountIfValidateCredentials(accountNumber, pintEntered, accounts);
	
	ac.printCredentials();

	rajinderAccount.printCredentials();
	
	Account ac1 = new Account();
	
	ac1.printCredentials();
	
	
//System.out.println("Enter pin number");
//	
//	Int accountPinEntered = sc.nextInt();
	
	
	
	
	
}
}
