package abstraction;

public class BankMain {

	public static void main(String[] args) {

//		NationalBank cibc = new CIBC();
//		
//		NationalBank td = new TDBank();
//		
//		cibc.interestOnSaving();
//		
//		td.interestOnSaving();

		// cannot create object of abstract class
//		NationalBank nationalBank = new NationalBank();
//		
//		nationalBank.interestOnSaving();

		// nb is referring to object of child class which is TD bank

		NationalBank nb = new TDBank();

		TDBank tdbank = new TDBank();

		tdbank.interestOnSaving();

		tdbank.provideLoans();

		tdbank.provideCheques();

		System.out.println("_______________________");

		// will call child class method - it is an abstract method in the superclass so
		// we cannot run unimplemented method in superclass but the child class has an
		// implementation that is why invoking child class method - overridden method

		nb.interestOnSaving();

		nb.provideLoans(); // It will call the child class since nb is referring to object of TD bank ,
							// run-tim epolymorphism come into picture and invoke overridden method and
							// print 5.5

	}

}
