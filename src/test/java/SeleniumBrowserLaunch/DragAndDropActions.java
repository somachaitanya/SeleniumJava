package SeleniumBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		BrowserUtils br = new BrowserUtils();

		driver = br.launchBrowser("chrome");
		br.launchUrl("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(3000);
		
		WebElement srcEle = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement targetEle = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action = new Actions(driver);
		
		//action.clickAndHold(srcEle).moveToElement(targetEle).release().build().perform();
		
		//action.dragAndDrop(srcEle, targetEle).perform();
		action.dragAndDropBy(srcEle, 100, 200).perform();

	}

}
