package WaitConcept;

import java.util.WeakHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumBrowserLaunch.BrowserUtils;
import SeleniumBrowserLaunch.ElementUtil;

public class PolingInWDWConcept {
	

	static WebDriver driver;

	public static void main(String[] args){
		// TODO Auto-generated method stub

		BrowserUtils br = new BrowserUtils();
		driver = br.launchBrowser("chrome");

		ElementUtil el = new ElementUtil(driver);

		br.launchUrl("https://www.selenium.dev/");
		
		driver.findElement(By.xpath("//a[text()='CVE-2021-45105']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10, 2000);
		if(wait.until(ExpectedConditions.titleContains("CDE"))) {
			System.out.println(driver.getTitle());
		}
		
		
		
	}
	

}
