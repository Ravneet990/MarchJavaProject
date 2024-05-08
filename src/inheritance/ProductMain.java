package inheritance;

public class ProductMain {

	public static void main(String[] args) {
		
		
		Appliance laptop = new Appliance("Asus laptop", "FX14563", 900);
		
		Appliance airFryer = new Appliance("AirFryer", "A123654", 500);
		
		laptop.displaySpecifications();
		
		airFryer.displaySpecifications();

	}

}
