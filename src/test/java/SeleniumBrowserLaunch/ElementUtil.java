package SeleniumBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ElementUtil {
	
	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doSendKeys(By locator, String value) {
		System.out.println("Finding the element using locator : "+locator);
		System.out.println("Sending the value : "+value);
		getElement(locator).sendKeys(value);
	}
	
	public String doGetText(By locator) {
		System.out.println("The text of the element is :");
		return getElement(locator).getText();
	}
	
	public void doClick(By locator) {
		System.out.println("Element which has to be clicked : "+locator);
		getElement(locator).click();
	}
	
	public boolean doIsDisplayed(By locator) {
		System.out.println("Element to be displayed is : "+locator);
		return getElement(locator).isDisplayed();
	}

}
