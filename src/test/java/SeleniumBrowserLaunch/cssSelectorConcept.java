package SeleniumBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cssSelectorConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtils br = new BrowserUtils();
		driver= br.launchBrowser("chrome");
		
		ElementUtil el = new ElementUtil(driver);
		
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		Thread.sleep(3000);
		
		//using cssSelector
		// # --> id
		// . -- class
		By email = By.cssSelector("#input-email");
		el.doSendKeys(email, "test");
		
		
		// if there are more than one classes, we can find webelement using dot(.) operator
		//.c1.c2.c3
		
		//id --> htmltag#id
		
		// input#username
		
		// xpath - //htmltag[@attribute='value']
		// css -   htmltag[atrribute ='value']
		
		// methods in css similar to starts -with
		// xpath - //input[starts-with(@id,'user')]
		// css - input[id^='user']
		
		// method in css smilar to ends-with 
		
		// Xpath - to find direct child - use single slash (/)
		// to find the indirect and direct children - use double slash (//)
		
		// css Selector - 
		
		
	}
}
