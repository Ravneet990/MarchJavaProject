package abstraction;

public class RBC implements NBankInterface{

	@Override
	public void interestOnSaving() {
		// TODO Auto-generated method stub
		System.out.println("Interest on saving 1%");
	}

	@Override
	public void provideCheques() {
		// TODO Auto-generated method stub
		System.out.println("provide 5 cheques by default");
	}

	@Override
	public void provideLoans() {
		// TODO Auto-generated method stub
		System.out.println("provide loan at 5.2%");
	}
	
	

}
