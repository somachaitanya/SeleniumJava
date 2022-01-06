package Inheritance;

public class CarTest {

	public static void main(String[] args) {
		
	BMW b = new BMW();
	/*	b.stop();
		b.autoParking(); 
		b.start(); // method overriding
		b.wheels(4);
		b.horn(); // Horn in BMW  */
		b.headLamps("BMW", 2);
		
		/*			
		Car c = new Car();
		c.stop();
		c.start(); // car started...
	
		//Top casting or the upper casting
		// c1 is the reference variable from the Car class and we are creating an object of the child (BMW) class
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.headLamps();
		
		// we will not be able to call this method which is there in child class but not in parent class as we can get an error "reference type check error"
		c1.autoParking();
		
				*/	
		//DownCasting 
		//BMW b1 = (BMW) new Car(); // ClassCastException
		
		
		
		//test1(7,2);
	}
	
	/*
	 * public static void test1(int x, int y) { float c =(float) x/y;
	 * System.out.println(c); }
	 */

}


// Method Overriding
//run time polymorphism
// when we have parent-child relationship 
// we have methods with same name in different classes
// same parameter
