package ObjectAndClasses;

public class CarDesign {

	String name;
	int price;
	String color;
	static final int wheels = 4;  // initialization and instantiation
	
	// constant messages = User Created Successfully.
	static final String accountCreationSuccessMsg = "User Created Successfully.";

	public static void main(String[] args) {
	

		CarDesign c1 = new CarDesign();
		c1.name = "BMW";
		c1.price = 60;
		c1.color = "REd";
		//c1.wheels = 4;
		//wheels = 6;

		CarDesign c2 = new CarDesign();
		c2.name = "Audi";
		c2.price = 70;
		c2.color = "Black";
		//c2.wheels = 4;

		CarDesign c3 = new CarDesign();
		c3.name = "Honda";
		c3.price = 20;
		c3.color = "White";
		//c3.wheels =4;
		//System.out.println(c3.wheels);
		
		
		
		System.out.println(c2.name + " " + c2.price +  " " + c2.color + " " + c2.wheels);

		
		//System.out.println(c2.name + " " + c2.price +  " " + c2.color + " " + CarDesign.wheels);

	}

}
