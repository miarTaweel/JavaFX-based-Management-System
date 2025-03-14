package application;

/*

 Miar Taweel



*/

public class Delivery extends PizzaOrder {//The creation of the sub class Delivery

   //Declaring the Delivery class attributes  
	private double	tripRate;
	private  int	zone;

	public Delivery() {//Creating a no argument constructor 
		
	}
	
	//Creating an argument constructor 
	public Delivery(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice,double tripRate, int zone) {
		super(customerName, pizzaSize,  numberOfToppings, toppingPrice);
		this.tripRate = tripRate;
	     this.zone=zone;
	
	}


  
	// overriding the toString method from the Super Class PizzaOrder
	public String toString() {
		return super.toString()+"\nTrip Rate=" + tripRate + "\nZone= " + zone+"\nOrders Price="+this.calculateOrderPrice();
	}

   //Creating the required setters and getters 
	public double getTripRate() {
		return tripRate;
	}


	public void setTripRate(double tripRate) {
		this.tripRate = tripRate;
	}


	public int getZone() {
		return zone;
	}


	public void setZone(int zone) {
		this.zone = zone;
	}
	// overriding the CalculateOrderPrice method from the Super Class PizzaOrder
   public double calculateOrderPrice() {
   	double x=super.calculateOrderPrice()+((tripRate/100)*zone*super.calculateOrderPrice());
   	return x;
   }

}
