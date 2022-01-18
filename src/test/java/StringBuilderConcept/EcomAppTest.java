package StringBuilderConcept;

public class EcomAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EcomApplication eStore = new EcomApplication();
		eStore.login("Chaitanya", "test@123");
		eStore.search("Macbook");
		eStore.addToCart();
		eStore.makePayment("ICICI 1004", 1234);
		eStore.orderIdGenerated();
		eStore.logout();

		// using String Builder Concept
		System.out.println("======================================================");
		EcomApplication eStore1 = new EcomApplication();
		
		eStore1
		.login("Nikhil", "user@123")
		.search("Dell")
		.addToCart()
		.makePayment("HDFC 12121", 2113)
		.logout()
		.login("Deepu", "Deepu@123")
		.makePayment("TEST 353", 0123);
	}

}
