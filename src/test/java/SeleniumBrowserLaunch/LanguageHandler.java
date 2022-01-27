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
		//System.out.println("Total languages available are : "+languageList.size());
		
		//click on any specific language ( Marathi)
		
/*		for(WebElement lang : languageList) {
			String language = lang.getText();
			//System.out.println(language);
			if(language.equals("मराठी")) {
				System.out.println(language);
				lang.click();
				break;
			}
		}
		
*/		By languages = By.xpath("//div[@id='SIvCob']/a");
		doLinkClick(languages, "বাংলা");
		
// i want method which 	( locator , language) doLinkClick(By locator, String language)		
	}

	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void doLinkClick(By locator, String linkText) {
		List<WebElement> langLinks = getElements(locator);
		System.out.println("total links : "+langLinks.size());
		for(WebElement langLink:langLinks) {
			String text = langLink.getText();		
			if(text.equals(linkText)) {
				System.out.println(text);
				langLink.click();
				break;
			}
		}
	}
}
