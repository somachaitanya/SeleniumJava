package ArrayPackage;

import java.util.Scanner;

public class AllNamesInArray {

	public static void main(String[] args) {

		//Cntrl+Shift+O	
		System.out.println("Please enter the number of peoples");
		Scanner input = new Scanner(System.in);
		int totalPpl	= input.nextInt();
		
		String names[] = new String[totalPpl];
		System.out.println("Enter the names :");
		for(int i=0; i<totalPpl; i++) {
			names[i]=input.next();
		}
		
		System.out.println("The names are: ");
		/*
		 * for(int j=0; j<totalPpl; j++) { System.out.println(names[j]); }
		 */
		for(String name : names) {
			System.out.println(name);
		}
	}

}
