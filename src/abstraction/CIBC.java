package abstraction;

public  class CIBC extends NationalBank implements Brokerage, ForexTransactions{

	@Override
	public void interestOnSaving() {
		// TODO Auto-generated method stub
		
		System.out.println("Provide interest of 1%");
		
	}
	
	public void provideLoans() {
		
		System.out.println("Provide loans starting from prime rate 5.5%");
	}

	@Override
	public void sendMoneyGlobally() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveMoneyGlobally() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buyStocks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellStocks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chargeForEachTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void provideCheques() {
		// TODO Auto-generated method stub
		
	}
	

}
