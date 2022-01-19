package SeleniumBrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {
	
	WebDriver driver;
	
	public void launchBrowser(String browserName) {
		System.out.println("Launching the browser : "+browserName);
		
		switch(browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
			break;
			
		default:
			System.err.println("Browser is not found..."+browserName);
			break;
		}
	}


	public void launchUrl(String url) {
		if(url.isEmpty()) {
			System.out.println("This is the blank url : "+url);
			return;
		}
		driver.get(url);
	}
	
	public String getPageTitle() {
		System.out.println("The title of this page is : ");
		return driver.getTitle();
	}
	
	public String getCurrentPageUrl() {
		System.out.println("The URL for this current page is : ");
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		System.out.println("closing the browser");
		driver.close();
	}
	
	public void quitBrowser() {
		System.out.println("quiting the browser");
		driver.quit();
	}
}

//1. You have to work on this program and remove this Null Pointer exception
