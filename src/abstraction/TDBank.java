package abstraction;

public class TDBank  extends NationalBank{

	@Override
	public void interestOnSaving() {
	
		System.out.println("Provide 1.2% interest on saving");
		
	}
	
	public void provideLoans() {
		
		System.out.println("Provide loans starting from prime rate 5.1%");
	}

	@Override
	public void provideCheques() {
		
		System.out.println("Provide 3 cheques by default.");
		
	}
	

}
