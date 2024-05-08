package abstraction;

public abstract class NationalBank {
	
	double balance;

	// Abstract class is a class which has one or more abstract methods

	public void provideLoans() {

		System.out.println("Provide loans starting from prime rate 5%");
	}

	// An abstract method does not have a body (curly braces) and ends in a
	// semicolon and abstract keyword is append to it.
	// Any class which extends a parent class of abstract method must have all the
	// abstract methods implemented in the child class as well

	public abstract void interestOnSaving();

	public abstract void provideCheques();

}
