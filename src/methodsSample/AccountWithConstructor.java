package methodsSample;

public class AccountWithConstructor {

 public	String nameOfAccountHolder;

	private String accountNumber;

	public String accountType;

	private double balance;

 private int pin;
	
//	public AccountWithConstructor(String name, String accntType, String accntNum, double bal, int pin) {
//		
//		this.nameOfAccountHolder = name;
//		
//		this.accountNumber = accntNum;
//		
//		this.accountType= accntType;
//		
//		this.balance = bal;
//		
//		this.pin = pin;
//		
//		
//	}
//	
	
	
	

	public AccountWithConstructor(String nameOfAccountHolder, String accountNumber, String accountType, double balance,
			int pin) {
		
		super();
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
		this.pin = pin;
		
	}





	public AccountWithConstructor() {
		super();
	}

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
	
	private boolean validatePin (int pinEntered) {
		
		if (pin==pinEntered) {
			
			return true;
	
	}
	return false;

}
	
	public boolean validateCredentials( String accountNumberEntered , int pinEntered) {
		
		if (accountNumber.equals(accountNumberEntered)) {
			
			if (validatePin(pinEntered)) {
				
				return true;
			}
			
		}
		return false;
		
	}
	
	public AccountWithConstructor getAccountIfValidCredentials(String accountNumberEntered , int pinEntered, AccountWithConstructor[] accounts) {
			
		for (int i=0; i< accounts.length;i++ )
		
		if (accounts[i].getaccountNumber().equals(accountNumberEntered)) {
			
			if (accounts[i].pin==pinEntered) {
				
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
