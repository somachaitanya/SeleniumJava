package SeleniumBrowserLaunch;

import org.openqa.selenium.WebDriver;

public class HandlingAuthPopup {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		BrowserUtils br = new BrowserUtils();

		driver = br.launchBrowser("chrome");
		
		String username = "admin";
		String password = "admin";
		
		br.launchUrl("https://'+username+'+':'+'+password+'@the-internet.herokuapp.com/basic_auth");
		
	}
}
