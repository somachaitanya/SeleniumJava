package SeleniumBrowserLaunch;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetElementsConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		// driver.findElement - WebElement
		// driver.findElements - ArrayList<WebElement>
		
		BrowserUtils br = new BrowserUtils();

		driver = br.launchBrowser("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");

		//driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		List <WebElement> linksList = driver.findElements(By.tagName("a"));
		
		//ArrayList<WebElement> links = (ArrayList<WebElement>) driver.findElements(By.xpath("test"));
		//List<WebElement> links2 = driver.findElements(By.xpath("test"));
		
		// print number of links available on this webpage
		System.out.println("Total links available are : "+linksList.size());
		
		// print all the text of the links available on the webpage
/*		for(int i =0; i < linksList.size(); i++) {
			//WebElement suggestion = linksList.get(i).getText();
			String link = linksList.get(i).getText();
			System.out.println(link);
		}
*/		
		//
		for(WebElement link : linksList) {
			String text = link.getText();
			if(!text.isEmpty())
			System.out.println(text);
		}

	}

}
