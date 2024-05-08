package firstDayJava;

import accountReturnType.AccountWithConstructor;

public class MainClass {
	
	 public static void main(String[] args) {
		 
		 System.out.println("Ravneet");
		
		 MobilePhone mobilePhone = new MobilePhone();
		 
		 mobilePhone.makeCalls();
		 
		 String nameOfBrand = mobilePhone.brandName;
		 System.out.println(nameOfBrand);
		 
		 AccountWithConstructor swaroopAcct = new AccountWithConstructor("Swaroop", "123654", 4785.08, 4569, "Savings");
		 
		 
		 System.out.println("Name of acct holder" + swaroopAcct.nameOfAccountHolder);
		
	}

}
