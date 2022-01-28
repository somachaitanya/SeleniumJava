package SeleniumBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassesConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		BrowserUtils br = new BrowserUtils();

		driver = br.launchBrowser("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		
		Thread.sleep(3000);
/*		
		Actions act = new Actions(driver);
		
		WebElement srcElement = driver.findElement(By.xpath("//a[text()='Components']"));
		
		act.moveToElement(srcElement).perform();
		
		Thread.sleep(2000);
		WebElement monitor = driver.findElement(By.partialLinkText("Monitors"));
		//WebElement monitor = driver.findElement(By.linkText("Monitors (2)"));
		monitor.click();
*/
		By components = By.xpath("//a[text()='Components']");
		By monitors = By.partialLinkText("Monitors");
		
		
	//	doMoveToElement(components);
	//	getElement(monitors).click();
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doMoveToElement(By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).perform();
	}
	
//1. will work- 
//2. won't work- Swati, Preeti, Madhurima, Deepika, Bhavna, Chaitanya, Stephen, Naresh
//3. Not sure - Rutuja, Nikhil, 	

}
