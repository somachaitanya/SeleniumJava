package Encapsulation;

public class LoginTest {

	public static void main(String[] args) {

/*		LoginPage lp = new LoginPage();
		lp.setUserName("deepu@gmail.com");
		lp.setPassword("deepu@123");
		
		LoginPage lp1 = new LoginPage();
		lp1.setUserName("Vaibhav");
		lp1.setPassword("Vaibhav@123");
		
		
		lp.doLogin(lp.getUserName(), lp.getPassword());
*/
		
		LoginPage lp = new LoginPage("Nikhil@gmail.com","Nikhil@123");
		
		System.out.println(lp.getUserName());
		
	}

}

//1. nothing
//2. null
