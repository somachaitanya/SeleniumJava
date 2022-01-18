package StringBuilderConcept;

public class EcomApplication {
	
	public EcomApplication login(String uname, String pass) { 
		System.out.println("user is logged in with credentials :"+uname +" "+pass);
		return this;
	}
	
	public EcomApplication search(String product) {
		System.out.println("Product searching : "+product);
		return this;
	}
	
	public EcomApplication addToCart() {
		System.out.println("Product added to cart");
		return this;
	}
	
	public EcomApplication makePayment(String bankCard, int OTP) {
		System.out.println("Payment successfull using card :"+bankCard +" and using OTP:  "+OTP);
		return this;
	}
	
	public int orderIdGenerated() {
		System.out.println("Order generated successfully");
		return 1001;
	}
	
	public EcomApplication logout() {
		System.out.println("user logged off");
		return this;
	}

}
