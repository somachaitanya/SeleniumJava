package TestNGConcept;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept extends BaseTest{
	
	@Test(dataProvider = "getUserDetails")
	public void userLogin(String username, String password) throws InterruptedException {
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-password")).clear();
		
		Thread.sleep(3000);
				
	}
	
	@DataProvider(name="getUserDetails")
	public Object[][] getUserDetails(){
		return new Object[][]
				{
					{"nikhil@test.com", "nikhil@123"},
					{"rutuja@test.com", "rutuja@123"},
					{"ankita@test.com", "ankita@123"},
					{"buddha@test.com", "buddha@123"}
				};
	}
	

}
