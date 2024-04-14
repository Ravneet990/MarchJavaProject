package pizzaShopPractice;

//import pizzaShop.PizzaShop;

public class PizzaShopParcticeMain {

	public static void main(String[] args) {
	
		PizzaShopPractice ps = new PizzaShopPractice();
		
		double price = ps.prepareFinalBill();
		
		System.out.println("The Total Price of pizza is:" + price);
		
		

	}

}
