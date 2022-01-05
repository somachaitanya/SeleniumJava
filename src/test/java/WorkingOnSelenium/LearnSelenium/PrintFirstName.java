package WorkingOnSelenium.LearnSelenium;

import java.util.*;

public class PrintFirstName {

	public static void main(String[] test) {

		// input from the user 
		
		System.out.println("Enter your name please!");
		
		Scanner takesInputFromUser = new Scanner(System.in);
		String name = takesInputFromUser.next();
		
		System.out.println("hello "+name);
		
		boolean isActive = false;
		
		// Preeti, 12, 12.34
		String userName = "Aakash";
		long age = 35432523452l;
		//int percent = 78.5;
		float userPercent = 88.52423f;
		
		char firstLetter = 'A';
		
		String firtName = "test usre";
		System.out.println(isActive);
		// Object is the instance of class
		//Scanner - class, input - reference to the object, new Scanner - object System.in - parameter
		
		//what if we remove System.in, next(), System.in, which library select, String args
	
	}
	
	// return types - void, int, String, etc..
	//JVM - java virtual machine

}

//access modifiers in Java - public, private, default, protected