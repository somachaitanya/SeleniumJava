package TestNGConcept;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgGroups {
	
	@BeforeTest
	public void launchUrl() {
		System.out.println("navigated to given url...");
	}
	
	@BeforeMethod
	public void userLogin() {
		System.out.println("user logged in successfully...");
	}
	
	@Test(groups="smoke")
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	
	@Test(groups="smoke")
	public void testMethod2() {
		System.out.println("testMethod2");
	}
	
	@Test(groups="smoke")
	public void testMethod5() {
		System.out.println("testMethod5");
	}
	
	@Test(groups="sanity")
	public void testMethod3() {
		System.out.println("testMethod3");
	}
	
	@Test(groups="sanity")
	public void testMethod4() {
		System.out.println("testMethod4");
	}
	
	@Test(groups="sanity")
	public void testMethod6() {
		System.out.println("testMethod6");
	}
	
	@AfterMethod
	public void userLoggedOut() {
		System.out.println("user logged off...");
	}
	@AfterTest
	public void closeBrowser() {
		System.out.println("Browser closed...");
	}

}
