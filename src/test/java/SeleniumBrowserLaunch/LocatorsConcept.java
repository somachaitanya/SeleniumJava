package SeleniumBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtils br = new BrowserUtils();
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		//
		//find the webElement and then we can perform action (click, sendkeys, hover)
		//find the element, we will be using locators
		//1.id
		
		/*
		 * driver.findElement(By.id("input-email")).sendKeys("chaitanya@gmail.com");
		 * driver.findElement(By.id("input-password")).sendKeys("test@123");
		 */
	
		/*2.
		 * WebElement emailId = driver.findElement(By.id("input-email")); WebElement
		 * pass = driver.findElement(By.id("input-password"));
		 * 
		 * emailId.sendKeys("Rutuja@gmail.com"); pass.sendKeys("Rut@123");
		 * 
		 * //lines of codes
		 * 
		 * emailId.sendKeys("Bhavna@gmail.com");
		 
		
		//3. OR (Object Repository)
		By email = By.id("input-email");
		By pass = By.id("input-password");
		
		By userName = By.id("username");
		/*
		 * WebElement emailId = driver.findElement(email);
		 * emailId.sendKeys("testuser@gmail.com");
		 */
		
		//4.
		/*WebElement emailId = getElement(email);
		emailId.sendKeys("test@gmail.com");
		
		WebElement password = getElement(pass);
		password.sendKeys("test@123");
		*/
		
		//5.
		//String emailId = "Nikhil@gmail.com";
		//String password = "Nikhil@3";
		
		/*By email = By.id("input-email");
		 doSendKeys(email, "Nikhil@gmail.com");*/
		 //doSendKeys(pass, "Nikhil@3");
		 * //doSendKeys(userName, "Vaibhav"); //driver.close(); br.closeBrowser();
		 */
		
		//2. name
		//driver.findElement(By.name("email")).sendKeys("Chaitanya");
		//driver.findElement(By.name("password")).sendKeys("Chaitanya@123");
		
		//By email = By.name("email");
		
		
		
	}
	
	/**
	 * Using this method we can getElement using the locator
	 * @param locator
	 * @return  It will be returning a webelement
	 */
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	/**
	 * This method performs action using the locator and passes the value
	 * @param locator - T
	 * @param value
	 */
	public static void doSendKeys(By locator, String value) {
		System.out.println("Finding the element using locator : "+locator);
		System.out.println("Sending the value : "+value);
		getElement(locator).sendKeys(value);
	}
}
//Bhavna - 5, Chaitanya- 5, Deepika-5, Stephen-5, Madhu-5, Naresh-5, Nikhil-5, Preeti-5, Swati - 5
//Vaibhav -5, Yogesh - 5, Aakash -5, Buddha- 5

