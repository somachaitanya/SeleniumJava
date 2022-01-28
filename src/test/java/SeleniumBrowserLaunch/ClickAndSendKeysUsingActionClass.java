package SeleniumBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickAndSendKeysUsingActionClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		BrowserUtils br = new BrowserUtils();

		driver = br.launchBrowser("chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		Thread.sleep(3000);
		
		By fullName = By.xpath("//input[@name='Name']");
		By contactSales = By.linkText("CONTACT SALES"); // case-sensitive
		
		//Actions action = new Actions(driver);
		//action.sendKeys(driver.findElement(fullName), "Nikhil").perform();
		
		
		//driver.findElement(fullName).sendKeys("Nikhil");
		//action.click(driver.findElement(contactSales)).perform();
		//doActionClick(contactSales);
		doActionSendKeys(fullName, "Madhurima");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}
	
	public static void doActionSendKeys(By locator, String keys) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator),keys).perform();
	}

}
