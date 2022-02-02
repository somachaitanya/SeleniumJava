package SeleniumBrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameHandlerConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtils br = new BrowserUtils();
		driver= br.launchBrowser("chrome");
		
		ElementUtil el = new ElementUtil(driver);
		
		br.launchUrl("http://londonfreelance.org/courses/frames/index.html");
		Thread.sleep(3000);
		
		By title = By.xpath("//h2[text()='Title bar ']");
		By footer = By.xpath("//h2[text()='Footer ']");
		System.out.println(driver.getTitle());
		
	//	driver.switchTo().frame(1);
	//	driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='main']")));
		String titleText = el.doGetText(title);
		System.out.println(titleText);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("bot");
		String footerText = el.doGetText(footer);
		System.out.println(footerText);
		
		//noSuchElementException -
		// Steps for debugging - 1. Check the xpath
		//2. search if that webelement is not overlapped
		//3. you can also look for the waits
		//4. search for the frame and then if frame is there we can handle it.
			
		
		//how to handle multiple windows in a browser- 
		// launch naukri.com
		//then click on 'Register to get discovered'
		//a new tab opens - get the title of this page and then get the title of the main page
		
		
		
	}
}
