package SeleniumBrowserLaunch;

public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chrome";
		String appUrl = "https://demo.opencart.com/index.php?route=account/login";
		BrowserUtils br = new BrowserUtils();
		
		br.launchBrowser(browser);
		br.launchUrl(appUrl);
		String appTitle = br.getPageTitle();
		
		if(appTitle.contains("Login")) {
			System.out.println("Correct Title : "+appTitle);
		}else
		{
			System.out.println("Incorrect Title.");
		}
		
		br.closeBrowser();
		

	}

}
