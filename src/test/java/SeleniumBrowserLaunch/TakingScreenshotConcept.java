package SeleniumBrowserLaunch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakingScreenshotConcept {
	

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		BrowserUtils br = new BrowserUtils();
		driver = br.launchBrowser("chrome");

		ElementUtil el = new ElementUtil(driver);
		JavaScriptUtil js = new JavaScriptUtil(driver);

		br.launchUrl("https://www.naukri.com");
		Thread.sleep(3000);
		
		js.scrollPageDown();
		
		TakesScreenshot tshot = (TakesScreenshot)driver;
		
/*		File naurkiScreenshot = tshot.getScreenshotAs(OutputType.FILE);
		File savedPath = new File("D:\\Selenium Sessions\\LearnSelenium\\src\\test\\java\\SeleniumBrowserLaunch\\testscreen.png");
		
		try {
			FileUtils.copyFile(naurkiScreenshot, savedPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
*/
		try {
			FileUtils.copyFile(tshot.getScreenshotAs(OutputType.FILE), new File("D:\\Selenium Sessions\\LearnSelenium\\src\\test\\java\\SeleniumBrowserLaunch\\testscreen.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
