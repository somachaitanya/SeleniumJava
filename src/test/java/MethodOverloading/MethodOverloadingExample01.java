package MethodOverloading;

public class MethodOverloadingExample01 {
	
	public static void display() {
		System.out.println("display method called");
	}
	
	public static void display(int x) {
		System.out.println("display method with int value");
	}
	
	public static void display(String str) {
		System.out.println("display method with String value");
	}
	
	public static void display(String str, int x) {
		System.out.println("display method with String value and int value");
	}
	
	public static void display(String str, int x, int age) {
		System.out.println("display method with String value and int value and age of the user");
	}
	
	public static void display(int x,String str) {
		System.out.println("display method with int value and String value");
	}

	public static int display(int x, int y) {
		return x+y;
	}
	
	
	public static void main(String[] args) {
		/*
		 * display(); display(5);
		 */
		//display();
		//display("user", 1001, 28);
		int total = display(10,20);
		System.out.println(total);

	}

}
