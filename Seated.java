package application;

/*

Miar  Taweel



*/

public class Seated extends PizzaOrder {// The creation of the Seated subclass to the SuperClass PizzaOrder
	// Declaring the seated subclass attributes

	private double serviceCharge;
	private int numberOfPeople;
	
	
	// Creating a no argument constructor 
	public Seated() {

	}
//Creating an argument constructor 
	public Seated(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice, double serviceCharge,
			int numberOfPeople) {
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
		this.serviceCharge = serviceCharge;
		this.numberOfPeople = numberOfPeople;
	}

//overriding the toString method from the Super Class PizzaOrder
	public String toString() {
		return super.toString() + "\nServiceCharge=" + serviceCharge + "\nnumberOfPeople=" + numberOfPeople
				+ "\nOrders Price=" + this.calculateOrderPrice();
	}

//overriding the CalculateOrderPrice method from the Super Class PizzaOrder
	public double calculateOrderPrice() {
		double x = super.calculateOrderPrice() + (serviceCharge * numberOfPeople);
		return x;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

