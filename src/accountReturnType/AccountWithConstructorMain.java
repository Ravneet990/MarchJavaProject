package accountReturnType;

public class AccountWithConstructorMain {

	public static void main(String[] args) {

		AccountWithConstructor prabhjot = new AccountWithConstructor("Prabhjot", "123456" , 6521.03, 456987, "Savings");

		System.out.println(prabhjot.getBalance());
		
		AccountWithConstructor gian = new AccountWithConstructor("Gian", "152456" , 652.03, 45987, "Chequing");

		System.out.println(gian.getBalance());
		
		AccountWithConstructor ac = new AccountWithConstructor();
		
		System.out.println(ac.getBalance());
		
	}

}
