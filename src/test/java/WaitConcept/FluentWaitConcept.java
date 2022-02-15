package WaitConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import SeleniumBrowserLaunch.BrowserUtils;
import SeleniumBrowserLaunch.ElementUtil;

public class FluentWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args){
		// TODO Auto-generated method stub

		BrowserUtils br = new BrowserUtils();
		driver = br.launchBrowser("chrome");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		ElementUtil el = new ElementUtil(driver);

		br.launchUrl("https://www.selenium.dev/");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(20))
								.pollingEvery(Duration.ofSeconds(2))
								.ignoring(StaleElementReferenceException.class);
		
		By log4JLink = By.xpath("//a[text()='CVE-2021-45105']");
		
		WebElement linkToclick = wait.until(ExpectedConditions.presenceOfElementLocated(log4JLink));
		linkToclick.click();
		System.out.println("clicked on the link");

	}

}
