package SeleniumBrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserChosenBrowser {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String browserName = "Edge MS";

		if (browserName.toLowerCase().equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.toLowerCase().equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else  if (browserName.toLowerCase().equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else
			System.out.println("undefined browser");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.makemytrip.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
// 1.you have to write this whole program using Switch case.
// 2.and then you have to debug the code and resolve the error.