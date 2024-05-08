package learnEncapsulation;

public class AccountDetailsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountDetails swaroop = new AccountDetails("45678912", 7890, 123654);

		System.out.println("The account number for swaroop is: " + swaroop.getAccountNumber(7890));
		
	swaroop.setBalance(5000, 7890);
	
	System.out.println("The new balance is :" + swaroop.getBalance());
	
	}

}
