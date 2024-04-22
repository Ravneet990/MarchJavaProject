
package banquet;

public class Banquet {

	double costOfBooking;

	double costOfFood;

	double costOfBeverages;

	double costOfTaxesOnFood;

	double costOfTaxesOnBeverage;

	double costOfTip;

	double totalBaseCost;

	double valueOfPercentage;

	double totalAfterPercentage;

	int numberOfGuests;

	double serviceCess;
	
	double totalCost;

	public double calculateBaseCost(double bookingCost, double foodCost, double beverageCost, double tipCost) {

		this.totalBaseCost = bookingCost + foodCost + beverageCost + tipCost;

		return totalBaseCost;

	}

	public Banquet() {

	}

	public double calculatetax(double toatlBaseCost, double percentageValue) {

		this.totalAfterPercentage = toatlBaseCost + (toatlBaseCost* (percentageValue/100));

		// System.out.println("The price with tax is : " + totalAfterPercentage);

		return totalAfterPercentage;

	}

	public double calculateCess(double totalBaseCost, int numOfGuest) {

		if (numOfGuest <= 40) {

			this.serviceCess = 0.04 * totalBaseCost;
		}

		else if (numOfGuest > 40 && numOfGuest <= 80) {

			this.serviceCess = 0.08 * totalBaseCost;

		} else if (numOfGuest > 80 && numOfGuest < 150) {

			this.serviceCess = 0.1 * totalBaseCost;

		} else if (numOfGuest >= 150) {

			this.serviceCess = 0.125 * totalBaseCost;
		}

		return serviceCess;

	}

	public double CalculateTotalCost(double totalAfterPercentage, double serviceCess) {
		
		this.totalCost = totalAfterPercentage + serviceCess;
		
		return totalCost;

	}

}
