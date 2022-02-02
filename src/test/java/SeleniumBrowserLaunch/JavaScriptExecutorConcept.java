package SeleniumBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptExecutorConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		BrowserUtils br = new BrowserUtils();
		driver = br.launchBrowser("chrome");

		ElementUtil el = new ElementUtil(driver);
		JavaScriptUtil js = new JavaScriptUtil(driver);

		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");

		Thread.sleep(3000);

		js.sendKeysUsingWithId("input-email", "testuser@email.com");
		//By email = By.id("input-email");
		//By pass = By.id("input-password");
		System.out.println(js.getPageInnerText());
		
		/*
		 * js.drawBorder(el.getElement(email));
		 * //js.flashWebElement(el.getElement(email)); // poc el.doSendKeys(email,
		 * "testuser@email.com");
		 * 
		 * js.drawBorder(el.getElement(pass)); el.doSendKeys(pass, "pass@123");
		 * 
		 * System.out.println(js.getTitleByJS());
		 */
		
// 1. You have to find the method in selenium to get the text of whole page.
		
		
	}

}
