package discountProduct;

import java.util.Scanner;

public class DiscountProduct {

	double discount;

	String promo;

	String promo5;

	String promo10;

	String promo20;

	double price;

	double finalDiscountPrice;

	Scanner sc = new Scanner(System.in);

	Scanner sc1 = new Scanner(System.in);

	void findDiscountPrice() {

		System.out.println("Please enter Price of the Product \n");

		price = sc.nextDouble();

		System.out.println("Please enter if you have any promo code \n");

		promo = sc1.nextLine();

		if (promo.equals("promo5")) {

			discount = (55 % 100);

			System.out.println("Your discount percentage is : " + discount + "%");

			finalDiscountPrice = price-(price*discount/100);

			System.out.println("The final price after discount will be : $ " + finalDiscountPrice);

		}

		else if (promo.equals("promo10")) {

			discount = (60 % 100);

			System.out.println("Your discount percentage is : " + discount + "%");

			finalDiscountPrice = price-(price*discount/100);

			System.out.println("The final price after discount will be : $ " + finalDiscountPrice);

		}

		else if (promo.equals("promo20")) {

			discount = (70 % 100);

			System.out.println("Your discount percentage is : " + discount + "%" );

			finalDiscountPrice = price-(price*discount/100);

			System.out.println("The final price after discount will be : $ " + finalDiscountPrice);

		}

		else {

			discount = (50 % 100);

			System.out.println("Your discount percentage is : " + discount + "%");

			finalDiscountPrice = price-(price*discount/100);

			System.out.println("The final price after discount will be : $ " + finalDiscountPrice);
		}
	}

}
