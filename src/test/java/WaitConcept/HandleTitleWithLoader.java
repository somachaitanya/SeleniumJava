package WaitConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumBrowserLaunch.BrowserUtils;
import SeleniumBrowserLaunch.ElementUtil;
import SeleniumBrowserLaunch.JavaScriptUtil;

public class HandleTitleWithLoader {
	
	static WebDriver driver;

	public static void main(String[] args){
		// TODO Auto-generated method stub

		BrowserUtils br = new BrowserUtils();
		driver = br.launchBrowser("chrome");

		ElementUtil el = new ElementUtil(driver);

		br.launchUrl("https://www.selenium.dev/");
		
		driver.findElement(By.xpath("//a[text()='CVE-2021-45105']")).click();
		
		
		/*
		 * if(wait.until(ExpectedConditions.titleContains("CVE"))) {
		 * System.out.println("navigate to correct url"); }else
		 * System.out.println("incorrect url");
		 */
		//String title = waitForTitleToLoad(10, "CVE");
		String title = waitForTitleIsToLoad(10, "CVE - CVE-2021-45105  ");
		System.out.println(title);
		
	}
	
	public static String waitForTitleContainsToLoad(int timeout, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	public static String waitForTitleIsToLoad(int timeout, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}

}
