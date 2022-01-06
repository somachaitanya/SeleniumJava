package Encapsulation;

public class LoginTest {

	public static void main(String[] args) {

		
		LoginPage lp = new LoginPage();
		lp.setUserName("deepu@gmail.com");
		lp.setPassword("deepu@123");
		lp.doLogin(lp.getUserName(), lp.getPassword());
		lp.logout();
		
		LoginPage lp1 = new LoginPage("Stephen@gmail.com", "Stephen@123");
		lp1.doLogin(lp1.getUserName(), lp1.getPassword());
		lp1.logout();
	}

}