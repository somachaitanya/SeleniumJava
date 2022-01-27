package SeleniumBrowserLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguageHandler {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// driver.findElement - WebElement
		// driver.findElements - ArrayList<WebElement>

		BrowserUtils br = new BrowserUtils();

		driver = br.launchBrowser("chrome");
		br.launchUrl("https://www.google.co.in/");
		
		Thread.sleep(5000);
		List<WebElement> languageList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println("Total languages available are : "+languageList.size());
		
		//click on any specific language ( Marathi)
		
		for(WebElement lang : languageList) {
			String language = lang.getText();
			//System.out.println(language);
			if(language.equals("मराठी")) {
				System.out.println(language);
				lang.click();
				break;
			}
		}
		
// i want method which 	( locator , language) doLinkClick(By locator, String language)
		
		
	}
}
