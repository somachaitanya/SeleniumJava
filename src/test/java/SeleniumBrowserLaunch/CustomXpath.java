package SeleniumBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//BrowserUtils br = new BrowserUtils();
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		// id - not present 
		// id - not unique
		// provide flexibility to access different nodes
		// we can get immediate child parent-child sibling concept
		
		// Types of xpath:
		// 1. abolute xpath - it is complete xpath on any webpage
		//  xpath - /html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input
		// 2. relative xpath- it is path of a webelement to anywhere in the webpage
		// relative xpath - 
		// 1. //htmltag[@attri='value']
		
		
		//By email = By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input"); // not recommended
		By email = By.xpath("//input[@id='input-email']");
		By email1 = By.xpath("//input[@name='email']");
		By email2 = By.id("input-email");
		driver.findElement(email2).sendKeys("testemail2@gmail.com");
		
		//WebElement wb = driver.findElement(By.xpath("//input[@id='input-email']"));
		//wb.sendKeys("test");
		
		// 2. we can use 'AND' operator to find the xpath
		// //input[@class='form-control' and @id='input-email']
		
		// 3. Or operator
		
		// id = username_123, username_456, username_324
		
		// to handle any dynamic value - contain	
		String userInputLink = "Address Book";
		//getLinkElement(userInputLink).click();
		getLinkElement("btn btn-primary", "Continue").click();
	}
	
	
	// one more argument for class
	public static WebElement getLinkElement(String linkClass, String text) {
		
		String linkpath = "//a[@class='"+linkClass+"' and text()='"+text+"']";
		System.out.println(linkpath);
		
		return driver.findElement(By.xpath(linkpath));
		
	}

}
