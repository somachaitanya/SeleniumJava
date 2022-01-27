package SeleniumBrowserLaunch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandlingJSPopup {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		BrowserUtils br = new BrowserUtils();

		driver = br.launchBrowser("chrome");
		br.launchUrl("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String validUsernameMsg = "Please enter a valid user name.";
		
		
		//1. getText() - with alert class to get the next.
		String actualMsg = alt.getText();
		
		if(actualMsg.equals(validUsernameMsg)) {
			System.out.println("Pop up has the right message");
		}
		else
			System.out.println("this needs to be fixed");
		

		Thread.sleep(2000);
		// method to accept the popup - OK/CONFIRM/ACCEPT
		//alt.accept();
		
		//method to dismiss the popup - CANCEL/DISMISS/REJECT/DENY
		alt.accept();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("test");
	}

}

//1. no issues - Madhurima, Vaibhav, Budha, Swati, Ankita, Deepika, 
//Rutuja, Preeti, Stephen, Chaitanya, Bhavna, 
//2. error/excep - 
