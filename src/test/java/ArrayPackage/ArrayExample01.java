package ArrayPackage;

public class ArrayExample01 {

	public static void main(String[] args) {

		// array stores similar kind of data (similar datatypes)
		// multiple values in a single variable
		// non-primitive data type
		// size can't be changed
		// insertion in between the elements is difficult
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		//System.out.println(b);
		//100 or say 1000 varibles needs to be declared as int and assign a value
		
		
		//1. integer array:
		int z[] = new int[5];
		z[0]= 10;
		z[1]= 20;
		z[2]= 30;
		//z[3] = 50;
		z[3] = 45;
		//z[-1] = 34;
		
		//System.out.println(z[-1]);
		
		/*
		 * System.out.println(z[0]); System.out.println(z[1]); System.out.println(z[2]);
		 * System.out.println(z[3]);
		 */
		
		//Arrays - length 
		// and String - length()
		
		int x = z.length;
		
		for(int i=0; i<z.length; i++) {
			System.out.println(z[i]);
		}
		
		System.out.println("Values using diffennt for Loop");
		
		for(int i=0; i<x; i++) {
			System.out.println(z[i]);
		}
		
		System.out.println("print values using for-each loop");
		
		//for-each loop
		// when this for loop will be used - arrays, multiple object with collection
		for(int k : z) {
			System.out.println(k);
		}
		
	}

}

/*
A.)
b.)
C.) 
d.) 

*/
