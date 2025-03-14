package application;

/*


Miar Taweel




*/

//importing the required libraries 
import java.util.Date;

public class PizzaOrder implements Comparable<PizzaOrder> {
	// The creation of the Super Class PizzaOrder which implements the comparable
	// interface
	// Declaring the Course class attributes
	public static final int SMALL = 1; // Declaring the required constants
	public static final int MEDIUM = 2;
	public static final int LARGE = 3;
	private String customerName;
	private Date dateOrdered;
	private int pizzaSize;
	private int numberOfToppings;
	private double toppingPrice;

	//Overriding the compareTo method from the Comparable instance 
	public int compareTo(PizzaOrder o) {
		if (this.calculateOrderPrice() > o.calculateOrderPrice())
			return 1;
		else if (this.calculateOrderPrice() < o.calculateOrderPrice())
			return -1;
		else
			return 0;
	}
	public PizzaOrder(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice) {
		super();
		this.customerName = customerName;
		this.pizzaSize = pizzaSize;
		this.numberOfToppings = numberOfToppings;
		this.toppingPrice = toppingPrice;
		dateOrdered = new Date();
	}
  //Creation of the method CalculateOrderPrice that has no parameters and returns a double quantity
	public double calculateOrderPrice() {
		
		double a = numberOfToppings * toppingPrice * pizzaSize;
		return a;
	}
	 //Creation of the void method printOrderInfo that has no parameters
	public void printOrderInfo() {
		double x = calculateOrderPrice();
		System.out.println("Name=" + customerName + "        Order Price =" + x);
	}
	//Creation of the toString method that has no parameters and returns a String representation of an object
	public String toString() {
		String x = "Customer Name=" + customerName + "\nDate Ordered=" + dateOrdered;
		if (pizzaSize == 1)
			x += "\npizza Size= Small";
		else if (pizzaSize == 2)
			x += "\npizza Size= Medium";
		else if (pizzaSize == 3)
			x += "\npizza Size= Large";

		x += "\nNumber Of Toppings=" + numberOfToppings + "\nTopping Price=" + toppingPrice;
		return x;
	}

   //Creating the required setters and getters 
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public int getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(int pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public int getNumberOfToppings() {
		return numberOfToppings;
	}

	public void setNumberOfToppings(int numberOfToppings) {
		this.numberOfToppings = numberOfToppings;
	}

	public double getToppingPrice() {
		return toppingPrice;
	}

	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
	//Creating a no argument constructor 
	public PizzaOrder() {
		dateOrdered = new Date();
	}
	//Creating an argument constructor 
	public static void main(String [] args ) {
		
	}
}
