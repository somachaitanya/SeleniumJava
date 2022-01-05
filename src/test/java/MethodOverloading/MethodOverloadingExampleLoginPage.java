package MethodOverloading;

public class MethodOverloadingExampleLoginPage {

	
	//Compile Time PolyMorphism
	//Poly + Morphism => multiple Forms
	
	// method overloading:
	// within the same class :
	// we have different methods
	// with the same name
	// with different params(diff types)
	// and the diff parameter sequence
	// no impact of return type
	public void login() {
		System.out.println("default login");
	}

	public void login(long phone) {
		System.out.println("login with phone number: " + phone);
	}

	public void login(long phone, int otp) {
		System.out.println("login with phone number: " + phone + " and " + otp);
	}

//	public void login(int otp, long phone) {// 2 params
//		System.out.println("login with phone number: " + phone + " and " + otp);
//	}

	public void login(String un, String pwd) {// 2 params
		System.out.println("login with : " + un + " " + pwd);
	}

	public void login(String email, String pwd, String role) {// 3 params

	}
	

	public static void main(String[] args) {
		
		MethodOverloadingExampleLoginPage loginPage = new MethodOverloadingExampleLoginPage();
		loginPage.login("user01","pass@123");
		main(0);
		

	}
	
	public static void main(int i) {
		System.out.println("main method with int value");
	}

}

//1. nothing - 
//2. error - Rutuja, Chaitanya,Deepu, Stephen, Madhurima
