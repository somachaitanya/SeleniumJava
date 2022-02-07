package WaitConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumBrowserLaunch.BrowserUtils;
import SeleniumBrowserLaunch.ElementUtil;
import SeleniumBrowserLaunch.JavaScriptUtil;

public class HandleAlertsUsingWDW {
	
	
	static WebDriver driver;

	public static void main(String[] args){
		// TODO Auto-generated method stub

		BrowserUtils br = new BrowserUtils();
		driver = br.launchBrowser("chrome");

		ElementUtil el = new ElementUtil(driver);
		JavaScriptUtil js = new JavaScriptUtil(driver);

		br.launchUrl("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		
		By proceed = By.name("proceed");
		el.doClick(proceed);
		
		/*
		 * Alert alert =waitForAlertPresent(10); String text = alert.getText();
		 * if(text.equals("Please enter a valid user name")) {
		 * System.out.println("message correct!"); } else
		 * System.out.println("incorrect msg"); alert.accept();
		 */	
		
		String text = getAlertTextUsingWDW(10);
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct message!");
		}
	}
	
	public static Alert waitForAlertPresent(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);	
		return  wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getAlertTextUsingWDW(int timeout) {
		String alertText = waitForAlertPresent(timeout).getText();
		acceptAlert(timeout);
		return alertText;
	}

	public static void acceptAlert(int timeout) {
		waitForAlertPresent(timeout).accept();
	}
	
	public static void dismisAlert(int timeout) {
		waitForAlertPresent(timeout).dismiss();
	}
	
}
