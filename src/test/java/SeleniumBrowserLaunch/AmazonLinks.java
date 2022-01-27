package SeleniumBrowserLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		// driver.findElement - WebElement
		// driver.findElements - ArrayList<WebElement>

		BrowserUtils br = new BrowserUtils();

		driver = br.launchBrowser("chrome");
		br.launchUrl("https://www.amazon.in/");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		List<WebElement> imageList = driver.findElements(By.tagName("img"));

		System.out.println("Total links available are : " + linksList.size());

		// print all the text of links available on amazon
		/*
		 * for(WebElement link : linksList) { String text = link.getText();
		 * if(!text.isEmpty()) System.out.println(text);
		 * 
		 * }
		 */

		// to print all the url
		/*
		 * String url = ""; for(WebElement link : linksList) { url =
		 * link.getAttribute("href");
		 * 
		 * //if(!link.get.isEmpty()) { if(url!=null && !url.isEmpty()) {
		 * System.out.println(url); } } //System.out.println(link.getText() + "--"
		 * +link.getAttribute("href")); }
		 */

		System.out.println("total images are : "+imageList.size());
		
		// print all the images url with text
		
		for(WebElement image : imageList) {
			System.out.println(image.getAttribute("alt")+"--"+image.getAttribute("src"));
			
		}
	}
//NOTE: url!=null && !url.isEmpty()
}