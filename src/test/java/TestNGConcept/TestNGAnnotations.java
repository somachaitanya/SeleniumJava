package TestNGConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	// global pre conditions // your server should be up and running
	// TC_01: pre condition --> test steps --> act vs exp --> post steps
	// TC_02: pre condition --> test steps --> act vs exp --> post steps
	// global post steps // sharing report using Jenkins
	
	@BeforeSuite
	public void createUser() {
		System.out.println("BS -- create user");
	}
	
	@BeforeTest
	public void connectWithDB() {
		System.out.println("BT -- connect With DB");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launch browser");
	}

	@BeforeMethod
	public void login() {
		System.out.println("BM -- login to app");
	}

	@Test()
	public void searchTest() {
		System.out.println("search test...");
	}
	
	@Test()
	public void addToCartTest() {
		System.out.println("add to cart test...");
	}

	@Test()
	public void paymentTest() {
		System.out.println("payment test...");
	}

	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- close browser");
	}

	@AfterTest
	public void disconnectWithDB() {
		System.out.println("AT -- disconnect With DB");
	}

	@AfterSuite
	public void deleteUser() {
		System.out.println("AS -- delete user");
	}
	

//OUTPUT
/*
 * BS -- create user
BT -- connect With DB
BC -- launch browser

BM -- login to app
add to cart test...
AM -- logout

BM -- login to app
payment test...
AM -- logout

BM -- login to app
search test...
AM -- logout

AC -- close browser
AT -- disconnect With DB
AS -- delete user
*/	


}