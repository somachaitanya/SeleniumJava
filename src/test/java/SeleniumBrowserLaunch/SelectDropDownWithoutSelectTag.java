package SeleniumBrowserLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectDropDownWithoutSelectTag {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		BrowserUtils br = new BrowserUtils();

		driver = br.launchBrowser("chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		Thread.sleep(5000);
		By countries = By.xpath("//select[@id='Form_submitForm_Country']/option");
		
		/*
		 * List<WebElement> countryList = driver.findElements(countries);
		 * 
		 * for(WebElement country : countryList) {
		 * //System.out.println(country.getText());
		 * if(country.getText().equals("India")) { country.click(); break; } }
		 */
		doSelectWithoutSelectClass(countries, "Australia");
		
	}
	
	public static void doSelectWithoutSelectClass(By locator, String value) {
		List<WebElement> optionList = driver.findElements(locator);
		for(WebElement option : optionList) {
			if(option.getText().equals(value)) {
				System.out.println("option selected is : "+option.getText());
				option.click();
				break;
			}
		}
	}
}
