package SeleniumBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementUtilTest {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtils br = new BrowserUtils();
		
		WebDriver driver = br.launchBrowser("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		
		//OR
		By email = By.id("input-email");
		By pass = By.id("input-password");
		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		By loginText = By.linkText("Your Store");
		
		
		ElementUtil el = new ElementUtil(driver);
		
		el.doSendKeys(email, "aakash01@gmail.com");
		el.doSendKeys(pass, "test@123");
		el.doClick(loginBtn);
		
		String loginTitle = br.getPageTitle();
		if(loginTitle.equals("My Account") && el.doIsDisplayed(loginText) && el.doGetText(loginText).equals("Your Store")) {
			{
			System.out.println("User is logged in.");
			}
		}
		else {
			System.out.println("Unable to login user");
		}
		
		Thread.sleep(3000);
		br.closeBrowser();
		
	}
}

//Try to automate "Account registration on https://demo.opencart.com/index.php?route=account/logout
//abstract and non-abstract (abstraction OOP)
