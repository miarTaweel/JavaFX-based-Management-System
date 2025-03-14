package application;


/*
 
 Miar Taweel

 
 
 
 */

public class ToGo extends PizzaOrder {//The creation of the sub class ToGo to the superClass PizzaOrder
	  
	public ToGo() {//Creating a no argument constructor 
		
	}
	
	//Creating an argument constructor 
	public ToGo(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice) {
		
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
	}
	
	
	@Override 
	public String toString() {// overriding the toString method from the Super Class PizzaOrder
		 return super.toString()+"\nOrders Price="+this.calculateOrderPrice();
	}
	


}
