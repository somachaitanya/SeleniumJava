package WaitConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumBrowserLaunch.BrowserUtils;
import SeleniumBrowserLaunch.ElementUtil;
import SeleniumBrowserLaunch.JavaScriptUtil;

public class DifferentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args){
		// TODO Auto-generated method stub

		BrowserUtils br = new BrowserUtils();
		driver = br.launchBrowser("chrome");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		ElementUtil el = new ElementUtil(driver);
		JavaScriptUtil js = new JavaScriptUtil(driver);

		br.launchUrl("https://www.selenium.dev/");

		//Thread.sleep(10000); -- not recommended
		
		// implicitly wait - global wait 
		// explicitly wait - WebDriverWait
		
		By log4JLink = By.xpath("//a[text()='CVE-2021-45105 22']");
		By vulLink = By.xpath("//a[text()='Learn more at National Vulnerability Database (NVD)']");
		//el.doClick(log4JLink);
		//el.doClick(vulLink);
		
/*		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement link4j = wait.until(ExpectedConditions.presenceOfElementLocated(log4JLink));
		link4j.click();
*/
		waitForElementPresent(log4JLink, 10).click();
		
		System.out.println("element clicked");
		
		// e2.dosendkeys("adsafadsf");
		// e3.click();
		// e4
		// e5	
		
	}
	
	public static WebElement waitForElementPresent(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
}
