package SeleniumBrowserLaunch;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptExecutorConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BrowserUtils br = new BrowserUtils();
		driver= br.launchBrowser("chrome");
		
		ElementUtil el = new ElementUtil(driver);
		
		br.launchUrl("https://www.naukri.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0, 1000)");
		

	}

}
