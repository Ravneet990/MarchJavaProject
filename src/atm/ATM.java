package atm;

public class ATM {

	double balance;
	
	int amountRequired;
	
	int inputPin;
	
	int savedPin;
	
	boolean isPinValid;
	
	void withdrawAmount() {
		
		if(amountRequired < balance) {
			
			System.out.println("You can withdraw the Money");
			
		} else {
			
			System.out.println("There is no sufficient funds to withdraw the money");
			
		}
	}
		
		void validatePinAndWithdrawMoney(){
			
			if(inputPin==savedPin) {
				
				System.out.println("Pin is valid. Please go ahead and withdraw Money");
				
				if(amountRequired<balance) {
					
					System.out.println("You are good to withdraw the required amount");
					
				}else {
					
					System.out.println("There is no sufficient funds to withdraw the Money.");
				}
			}else {
				
				System.out.println("Incorrect Pin. Please try again.");
			}
			
		}
		
void validatePinWithdrawMoney(){
	
	isPinValid = inputPin == savedPin;
			
			if(isPinValid) {
				
				System.out.println("Pin is valid.");
				
				if(amountRequired<balance) {
					
					System.out.println("You can withdraw the money");
					
				}else {
					
					System.out.println("There is no sufficient funds to withdraw the Money.");
				}
			}else {
				
				System.out.println("Incorrect Pin. Please try again.");
			}
			
		}
	
	
	
}
