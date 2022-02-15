package TestNGConcept;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	
	@Test(invocationCount = 10)
	public void loginTest() {
		System.out.println("login to app");
		int i=3/0;
	}
	
	@Test(invocationCount = 3)
	public void display() {
		System.out.println("display method ");
	}

}
