package ControlStatements;

public class BreakKeywordExample01 {

	public static void main(String[] args) {
		
		for(int i=0; i < 10; i++) {
			if(i==5) {
				System.out.println("You have reached till the break point");
				continue;
			}
			System.out.println("No is :"+i);
		}
	}

}
