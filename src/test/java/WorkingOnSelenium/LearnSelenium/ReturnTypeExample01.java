package WorkingOnSelenium.LearnSelenium;

public class ReturnTypeExample01 {

	public static void main(String[] args) {
		
		System.out.println("Hey Return Type Example");
		
		// a program which should return any integer value
		int total = sumOfNums(120, 100);		
		// deducting 5 from the result
		
		int actualOutput = total-5;
		
		System.out.println("The desired output is :"+actualOutput);
		
	}
	
	public static int sumOfNums(int x, int y) {
		//write the exp
		int c = x+y;
		return c;
	}

}

//output - 
