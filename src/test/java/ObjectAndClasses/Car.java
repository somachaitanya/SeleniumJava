package ObjectAndClasses;

public class Car {
	
//What is class and how objects are created	?
//Need of creating class and objects
	String name;
	String model;
	String color;
	int price;
	boolean isAvilable;
	boolean isAutomatic;
	
	

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "BMW";
		c1.model = "520d";
		c1.price = 75;
		c1.isAvilable = true;
		c1.isAutomatic = true;
		c1.color = "Black";
		System.out.println(c1.name + " " + c1.model + " " + c1.price + " " + c1.color);
		//BMW 520d 75 Black
		Car c2 = new Car();
		c2.isAutomatic = true;
		c2.color="White";
		System.out.println(c2.name + " " + c2.model + " " + c2.price + " " + c2.color + " " + c2.isAutomatic + " " + c2.isAvilable);
		//White
		//null null 0 White true false 
		
		
		
	}

}