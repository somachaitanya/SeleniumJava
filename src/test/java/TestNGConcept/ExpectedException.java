package TestNGConcept;

import org.testng.annotations.Test;

public class ExpectedException {

	String name = "Tom";

	@Test(expectedExceptions = {NullPointerException.class,ArithmeticException.class})
	public void loginTest() {
		System.out.println("login to app");
		int i = 9/0;
		
		ExpectedException obj = null;
		System.out.println(obj.name);
		
		

	}

}
