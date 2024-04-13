package pizzaShop;

public class PizzaShopMain {

	public static void main(String[] args) {
	
		PizzaShop ps = new PizzaShop();
		
		double price = ps.prepareFinalBill();
		
		System.out.println("The Total Price of pizza is:" + price);
		
		

	}

}
