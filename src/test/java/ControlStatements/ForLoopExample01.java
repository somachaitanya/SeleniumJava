package ControlStatements;

import java.util.Scanner;

//program to print the integer number upto user input
public class ForLoopExample01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the user input: ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.println("No is :"+i);
		}
	}
}
