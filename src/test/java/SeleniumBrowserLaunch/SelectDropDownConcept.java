package SeleniumBrowserLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		BrowserUtils br = new BrowserUtils();

		driver = br.launchBrowser("chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		Thread.sleep(5000);
		By countries = By.xpath("//select[@id='Form_submitForm_Country']");
		By states = By.xpath("//select[@id='Form_submitForm_State']");
		
		
		/*WebElement countryList = driver.findElement(countries);		
		WebElement stateList = driver.findElement(states);*/
		
		
		/*Select selectCountry = new Select(countryList);
		Select selectState = new Select(stateList);
		*/
		//select.selectByIndex(5);
		//select.selectByValue("India");
		//selectCountry.selectByVisibleText("India");
		//Thread.sleep(3000);
		
		//selectState.selectByVisibleText("Goa");
		
		/*
		 * doSelectByVisibleText(countries, "India"); Thread.sleep(3000);
		 * doSelectByVisibleText(states, "Goa");
		 */
			
		//doSelectByIndex(countries, 5);
		doSelectByVisibleText(countries, "India");
		Thread.sleep(2000);
		doSelectByValue(states, "Bihar");
		
		
		
//work - 
//won't work - Madhurima, Ankita, Vaibhav, Budha,				
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	
	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
		
	}
}
