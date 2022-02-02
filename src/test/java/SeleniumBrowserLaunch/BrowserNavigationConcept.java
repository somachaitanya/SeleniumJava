package SeleniumBrowserLaunch;

import org.openqa.selenium.WebDriver;

public class BrowserNavigationConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		BrowserUtils br = new BrowserUtils();
		driver = br.launchBrowser("chrome");

		ElementUtil el = new ElementUtil(driver);
		JavaScriptUtil js = new JavaScriptUtil(driver);

		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		Thread.sleep(2000);
		br.launchUrl("https://www.naukri.com");

		Thread.sleep(3000);
		
		driver.navigate().back();
		driver.navigate().forward();
		
	}

}
