package SeleniumBrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup(); //98 - 98.exe
		
		//input from the user which browser they're using and then I have to call the get method
		
		//webdrivermanager
		//top casting
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		System.out.println("user is using Google Chrome.");//
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		
		driver.close();

	}

}
