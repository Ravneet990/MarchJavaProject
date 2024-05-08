package abstraction;

public interface NBankInterface {

	//interface is an entity where all methods by default will be abstract
	
	String name = "National Bank";
	
	public abstract void interestOnSaving();

	public abstract void provideCheques();

	public void provideLoans();
	
}
