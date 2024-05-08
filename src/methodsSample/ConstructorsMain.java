package methodsSample;

public class ConstructorsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountWithConstructor prabhAcct = new AccountWithConstructor("Prabh", "Savings", "126547", 5000, 6719);

		System.out.println(prabhAcct.getBalance());
		
		AccountWithConstructor gianAcct = new AccountWithConstructor("Gian", "Savings", "126547", 5000, 6719);

		System.out.println(gianAcct.getBalance());
		
		AccountWithConstructor account = new AccountWithConstructor();
		
//		System.out.println(account.getBalance());
//		
//		Account acct = new Account();
//		
//		acct.pin;
		
	//	System.out.println("Gian Pin number" + gianAcct.pin);
		
		
		
	}

}
