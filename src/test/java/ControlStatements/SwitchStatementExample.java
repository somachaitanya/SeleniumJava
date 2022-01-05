package ControlStatements;

import java.util.Scanner;

//Check condition for different number using switch case
// and example for break statement
// keywords - some reserved words in java
public class SwitchStatementExample {
	
		  public static void main(String[] args) {

		    Scanner input = new Scanner(System.in);
		    int number = input.nextInt();
		   
		    String size;

		    // switch statement to check size
		    switch (number) {

		      case 29:
		        size = "Small";
		        break;

		      case 42:
		        size = "Medium";
		        break;

		      // match the value of week
		      case 44:
		        size = "Large";
		        break;

		      case 48:
		        size = "Extra Large";
		        break;
		      
		      default:
		        size = "Unknown";
		        break;

		    }
		    System.out.println("Size: " + size);
		  }

}
