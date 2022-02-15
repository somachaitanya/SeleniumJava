package TestNGConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAssertions {
	
	WebDriver driver;
	
	@BeforeTest
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod
	public void launchUrl() {	
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	}
	
	@Test
	public void verifyTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Account Login 1","Expected title is not there.");
		//System.out.println(title);
		
	}
	
	@Test
	public void verifySearchBar() {
		boolean b = driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(b);
		System.out.println("This icon is displayed");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
