/*
 
Miar Taweel

 
 
 
 */

package application;

//importing the required libraries
import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Driver extends Application {

	public void start(Stage primaryStage) {//Entering the Primary stage 

		ArrayList<PizzaOrder> orders = new ArrayList<>();//Creating A new ArrayList of type PizzaOrder names orders

		BorderPane p = new BorderPane();//Creation of the main pain(Border Pain) to contain the program 
		p.setStyle("-fx-background-color:pink");//Setting the panes background colour to pink
		p.setPadding(new Insets(5, 10, 30, 10));//Setting the padding of the pane 
		
		VBox title = new VBox(10);//Creating a new Vbox to contain the title to place into the border pane 
		title.setAlignment(Pos.CENTER);// Setting Its Qualities
		
		//Creation of a two labels For the title and instructions 
		Label border=new Label("Pizza Parlor");
		//Setting the labels qualities 
		border.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC, 50));
		Label enter =new Label("Enter Your Orders Info :");
		
		//Putting the labels into the Vbox
		title.getChildren().addAll(border, enter);
		//Putting the Vbox into the top of the border pane p
		p.setTop(title);
        
		
		//Creation of a Vbox for the information in the Center of the borderPane 
		
		VBox Info = new VBox(50);
		
		//Setting the Vboxs qualities 
		Info.setPadding(new Insets(100, 0, 0, 0));
		Info.setAlignment(Pos.CENTER);
		GridPane info = new GridPane();
		info.setHgap(10);
		info.setVgap(20);
		info.setAlignment(Pos.CENTER);
		
		//Creating nodes for the PizzaOrder class Attributes
		
		Label Name = new Label("Name:");
		TextField name = new TextField();
		ComboBox<String> cbo = new ComboBox<String>();
		cbo.getItems().addAll("Large", "Medium", "Small");
		cbo.setValue("Small");
		
        // Creation of a GridPane to organise the Pizzas Toppings nodes 
		
		GridPane toppings = new GridPane();
		toppings.setVgap(5);
		CheckBox one = new CheckBox("Onions");
		CheckBox two = new CheckBox("Mushroom");
		CheckBox three = new CheckBox("Green Pepper");
		CheckBox four = new CheckBox("Olives");
		
		//Adding the nodes to the toppings GridPane 
		
		toppings.add(one, 0, 0);
		toppings.add(two, 1, 0);
		toppings.add(three, 0, 1);
		toppings.add(four, 1, 1);
		
        // Continuing the creation of nodes(Radio Buttons) for the PizzaOrder class Attributes
		
		RadioButton type = new RadioButton("Delivery");
		RadioButton type1 = new RadioButton("Seated");
		RadioButton type2 = new RadioButton("ToGo");

		
		type2.setSelected(true);//Setting the default value of the ToGo radioButton  to true 
		
		// Setting the radio buttons into a toggle group
        ToggleGroup g2 = new ToggleGroup();
		type.setToggleGroup(g2);
		type1.setToggleGroup(g2);
		type2.setToggleGroup(g2);
        
		//Creating an HBox to organise the radio buttons
		HBox Types = new HBox(10);
		Types.getChildren().addAll(type, type1, type2);

		//Creating an HBox to organise both the Delivery Attributes nodes and the Seated Attributes nodes
		HBox NewInfo = new HBox();
		NewInfo.setAlignment(Pos.CENTER);
		NewInfo.setPadding(new Insets(0, 0, 0, 0));

        // Creation of the Delivery Attributes nodes
		//And Creating a GridPane For them
		GridPane deli = new GridPane();

		TextField rate = new TextField("0");
		RadioButton box = new RadioButton("1");
		RadioButton box1 = new RadioButton("2");
		RadioButton box2 = new RadioButton("3");
		RadioButton box3 = new RadioButton("4");
		
		// Setting the radio buttons into a toggle group
		ToggleGroup g = new ToggleGroup();
		box.setToggleGroup(g);
		box1.setToggleGroup(g);
		box2.setToggleGroup(g);
		box3.setToggleGroup(g);
        
		//Creating an HBox to organise the radio buttons for the zone
		HBox zones = new HBox(10);
		zones.getChildren().addAll(box, box1, box2, box3);
		
        Label aa = new Label("Trip Rate");
		Label bb = new Label("Zone");
		
		// Setting The Delivery nodes to invisible as default
		aa.setVisible(false);
		bb.setVisible(false);
		rate.setVisible(false);
		zones.setVisible(false);
		
		//Setting the nodes into the GridPane
		deli.setVgap(5);
		deli.add(aa, 0, 0);
		deli.add(rate, 1, 0);
		deli.add(bb, 0, 1);
		deli.add(zones, 1, 1);
		
// Creation of the Seated Attributes nodes
		
		Label A = new Label("Service Charge");
		Label B = new Label("Number Of People");
		TextField AA = new TextField("0");
		TextField BB = new TextField("0");

		// Setting The seated nodes to invisible as default
		A.setVisible(false);
		AA.setVisible(false);
		B.setVisible(false);
		BB.setVisible(false);
		
		// Setting the seated nodes into a GridPane
		GridPane seat = new GridPane();
		seat.add(A, 0, 0);
		seat.add(B, 0, 1);
		seat.add(AA, 1, 0);
		seat.add(BB, 1, 1);

		//Setting both the Delivery Attributes nodes and the Seated Attributes nodes into the HBox
		NewInfo.getChildren().addAll(deli, seat);

		TextField top = new TextField("10");

		// Setting all the Created Pizza Order class attribute nodes and panes to the gridPane info
		info.add(Name, 0, 0);
		info.add(name, 1, 0);
		info.add(new Label("Size"), 0, 1);
		info.add(cbo, 1, 1);
		info.add(new Label("Toppings"), 0, 2);
		info.add(toppings, 1, 2);
		info.add(new Label("Topping Price"), 0, 3);
		info.add(top, 1, 3);
		info.add(new Label("Type Of Order"), 0, 4);
		info.add(Types, 1, 4);
		
		//Creating an uneditable  TextField for the Order Price
		TextField orp = new TextField("0.0");
		orp.setEditable(false);
		
		//Setting the textField and the label into a HBox for organisation
		HBox orderP = new HBox(10);
		orderP.setAlignment(Pos.CENTER);
		orderP.getChildren().addAll(new Label("Order Price"), orp);

        // Creating the control buttons
		Button proccess = new Button("Process Order");
		Button print = new Button("Print Orders");
		Button reset = new Button("Reset");

		// Creating a HBox to organise the control buttons and Putting them in it
		HBox bts = new HBox(20);
		bts.setPadding(new Insets(0, 0, 0, 0));
		bts.setAlignment(Pos.CENTER);
		bts.getChildren().addAll(proccess, print, reset);
		
        //Setting all Created panes into the VBox 
		Info.getChildren().addAll(info, NewInfo, orderP);
		
		//Setting the Vbox into the Center of the main BorderPane 
		//and the Hbox for the control buttons into the Bottom of the main BorderPane 
		p.setBottom(bts);
		p.setCenter(Info);

		
		// Creating the action on the "Delivery" RadioButton
		type.setOnAction(e -> {
            //Setting the the Delivery nodes to visible and the seated nodes to Invisible
			rate.setVisible(true);
			zones.setVisible(true);
			aa.setVisible(true);
			bb.setVisible(true);
			A.setVisible(false);
			AA.setVisible(false);
			B.setVisible(false);
			BB.setVisible(false);
		});
		// Creating the action on the "Seated" RadioButton
		type1.setOnAction(e -> {
			//Setting the Delivery nodes to invisible and the seated nodes to visible
			A.setVisible(true);
			AA.setVisible(true);
			B.setVisible(true);
			BB.setVisible(true);
			rate.setVisible(false);
			zones.setVisible(false);
			aa.setVisible(false);
			bb.setVisible(false);
		});
		// Creating the action on the "ToGo" RadioButton
		type2.setOnAction(e -> {
          //Setting Both the Delivery nodes and the seated nodes to invisible 
			A.setVisible(false);
			AA.setVisible(false);
			B.setVisible(false);
			BB.setVisible(false);
			rate.setVisible(false);
			zones.setVisible(false);
			aa.setVisible(false);
			bb.setVisible(false);
		});

		// Creating the action on the "Process Order" Button
		proccess.setOnAction(e -> {
		
            int size = 0;
			int numOfTop = 0;
			int zone = 0; 
			int tprice;
			
			//Reading the PizzaOrder Attributes from the Nodes 
			if (top.getText().equals(""))
				tprice=0;
				else
			    tprice = Integer.parseInt(top.getText());
			
			if (cbo.getValue().equals("Small")) {
				size = PizzaOrder.SMALL;
			} else if (cbo.getValue().equals("Medium")) {
				size = PizzaOrder.MEDIUM;
			} else if (cbo.getValue().equals("Large")) {
				size = PizzaOrder.LARGE;
			}
			if (one.isSelected()) {
				numOfTop++;
			}
			if (two.isSelected()) {
				numOfTop++;
			}
			if (three.isSelected()) {
				numOfTop++;
			}
			if (four.isSelected()) {
				numOfTop++;
			}
            //Creating Cases for each radioButton of The Order Types 
			if (type.isSelected()) {
				//Reading the Delivery Attributes from the Nodes (zone , trip Rate)
				if (box.isSelected()) {
					zone = 1;
				} else if (box1.isSelected()) {
					zone = 2;
				} else if (box2.isSelected()) {
					zone = 3;
				} else if (box3.isSelected()) {
					zone = 4;
				}
				double trate=0;
				if (rate.getText().equals(""))
					trate=0;
				else 
				 trate = Double.parseDouble(rate.getText());
				
				//Creating An object of Type Delivery by Polymorphism 
				PizzaOrder pizza = new Delivery(name.getText(), size, numOfTop, tprice, trate, zone);
				orders.add(pizza); //Adding the created object to the Arraylist Objects
				orp.setText(pizza.calculateOrderPrice() + "");//Calculating the orders price and putting its value into the Textfield "Order Price"

				 
			} else if (type1.isSelected()) {
				//Reading the Seated Attributes from the Nodes (ServiceCharge,  NumberOfPeople)
				int numP;
				double service;
				if (BB.getText().equals(""))
					numP=0;
				else
				 numP = Integer.parseInt(BB.getText());
				if (AA.getText().equals(""))
					service=0;
				else
				 service = Double.parseDouble(AA.getText());
				//Creating An object of Type Seated by Polymorphism 
				PizzaOrder pizza1 = new Seated(name.getText(), size, numOfTop, tprice, service, numP);
				orders.add(pizza1); //Adding the created object to the Arraylist Objects
				orp.setText(pizza1.calculateOrderPrice() + "");//Calculating the orders price and putting its value into the Textfield "Order Price"

			} else if (type2.isSelected()) {
				//Creating An object of Type ToGo by Polymorphism 
				PizzaOrder pizza2 = new ToGo(name.getText(), size, numOfTop, tprice);
				orders.add(pizza2);//Adding the created object to the Arraylist Objects
				orp.setText(pizza2.calculateOrderPrice() + "");//Calculating the orders price and putting its value into the Textfield "Order Price"
			}
			
		});

		// Creation of a new stage,scene and pane for the new window
		StackPane pane2 = new StackPane();

		Stage window = new Stage();

		// Creation of a Text Area to print the required information in it
		TextArea note = new TextArea("");
		//Setting its qualities 
		note.setEditable(false);
		note.setPrefColumnCount(20);
		note.setPrefRowCount(5);
		pane2.getChildren().add(note);
		Scene scene2 = new Scene(pane2, 400, 400);//setting the pane into The scene 
		window.setScene(scene2);//setting the scene into The stage 
	    window.setTitle("All Orders");
    
		// Creating the action on the "Print" Button
		print.setOnAction(e -> {
			sortOrders(orders);//Sorting the order of the elements in the ArrayList orders based on the OrderPrice Using the overridden method sortOrders
			
			String words = "";
			//A loop to put all the names and orderPrices of the Arraylist into a string named words 
			for (int i = 0; i < orders.size(); i++) {
				words +="Name="+ orders.get(i).getCustomerName() + "      Order Price=" + orders.get(i).calculateOrderPrice() + "\n";
				
			}
			note.setText(words);// Setting the string words into the TextArea 
			window.show();// Showing the new stage"window"

		});
		// Creating the action on the "Reset" Button
		 reset.setOnAction(e -> {
			//Setting all nodes to their default values 
			name.setText("");
			cbo.setValue("Small");
			one.setSelected(false);
			two.setSelected(false);
			three.setSelected(false);
			four.setSelected(false);
			top.setText("10");
			orp.setText("0.0");
			type.setSelected(false);
			type1.setSelected(false);
			type2.setSelected(true);
			AA.setText("0");
			BB.setText("0");
			rate.setText("0");
			box.setSelected(false);
			box1.setSelected(false);
			box2.setSelected(false);
			box3.setSelected(false);
			A.setVisible(false);
			AA.setVisible(false);
			B.setVisible(false);
			BB.setVisible(false);
			rate.setVisible(false);
			zones.setVisible(false);
			aa.setVisible(false);
			bb.setVisible(false);
			// A loop to Remove all the elements from the Array List orders
			int length = orders.size();
			for (int i = length - 1, k = 0; k < length; i--, k++)
				orders.remove(i);
			
	

		});

		Scene s = new Scene(p, 500, 1000);//Setting the main Border pane into the scene and determining its size 
		primaryStage.setTitle("Project 2");//Setting the primaryStages title 
		primaryStage.setScene(s);//Setting the scene into the stage 
		primaryStage.show();// Showing the primaryStage 

	}

	// Creation of the static void method sortOrders that takes an ArrayList of type PizzaOrder
	public static void sortOrders(ArrayList<PizzaOrder> a) {

		Collections.sort(a); // A call of the method sort from the library java.util.Collections
	}

	public static void main(String[] args) {
		launch(args);
	}
}
