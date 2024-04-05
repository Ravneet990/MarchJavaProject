package atm;

public class ATMMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM atm = new ATM();
		
		atm.balance = 6000;
		
		atm.amountRequired = 5000;
		
		atm.inputPin = 123;
		
		atm.savedPin = 123;
		
		atm.withdrawAmount();
		
		atm.validatePinAndWithdrawMoney();
		
		atm.validatePinWithdrawMoney();

	}

}
