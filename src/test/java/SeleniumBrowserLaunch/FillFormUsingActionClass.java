package SeleniumBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FillFormUsingActionClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtils br = new BrowserUtils();
		driver= br.launchBrowser("chrome");
		
		ElementUtil el = new ElementUtil(driver);
		
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		Thread.sleep(3000);
		
		By register = By.xpath("//div[@class='list-group']//a[text()='Register']");
		By firstname = By.xpath("//input[@id='input-firstname']");
		
		el.doActionClick(register);
		Thread.sleep(2000);
		
		el.doActionSendKeys(firstname, "Naresh");
		

	}
	

}
