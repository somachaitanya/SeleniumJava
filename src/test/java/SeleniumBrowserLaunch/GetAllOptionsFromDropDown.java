package SeleniumBrowserLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptionsFromDropDown {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		BrowserUtils br = new BrowserUtils();

		driver = br.launchBrowser("chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		Thread.sleep(5000);
		
		By countries = By.xpath("//select[@id='Form_submitForm_Country']");
		
		Select select = new Select(driver.findElement(countries));
		List<WebElement> countryList = select.getOptions();
		
		System.out.println("total countries are : "+countryList.size());
		
		for(WebElement list : countryList) {
			System.out.println(list.getText());
		}
		
	}

	
//create a utility for accessing all the options from the dropdown	

}
