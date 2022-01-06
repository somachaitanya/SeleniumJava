package Inheritance;

public class BMW extends Car {

	@Override
	public void start() {
		System.out.println("BMW started...");
	}
	
	public void autoParking() {
		System.out.println("BMW autoparked...");
	}
	
	public void wheels(int i) {
		System.out.println("Number of wheels in BMW: "+i);
	}
	
	public void horn() {
		System.out.println("Horn in BMW :");
	}
	

	public void headLamps(int i, String str) {
		System.out.println("BMW headlamps...");
	}
}
