package learnPolymorphism;

public class UserAccount {

	private String acctNum;

	private int pin;

	private String userName;

	private String password;
	
	private double balance;

	public UserAccount(String acctNum, int pin) {
		super();
		acctNum = acctNum;
		this.pin = pin;
		
	}

	public double getBalance() {
		return balance;
	}

	public String getUserName() {
		return userName;
	}
	

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAcctNum() {
		return acctNum;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean validateUser(String accountNum, int pinEntered) {

		if (accountNum.equals(acctNum) && (pinEntered == pin)) {

			return true;

		}
		return false;
	}

	public boolean validateUser(String userName, String password) {

		if (this.userName.equals(userName) && (this.password.equals(password))) {

			return true;

		}
		return false;
	}

}
