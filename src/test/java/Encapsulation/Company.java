package Encapsulation;

public class Company {
	
	public String name;
	private int sharePrice;
	private String policy;
	
	//getter & setters
	public String getPolicy() {
		return policy;
	}
	
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	
	public void getCompAddress() {
		System.out.println("some comp address....");
	}
	
	public void getShareInformation() {
		getCompShareInfo();
	}
	
	private void getCompShareInfo() {
		System.out.println("comp share info....");
	}
	
	public void displayCompanyShareInfo() {
		getCompShareInfo();
	}
	
	
	public static void main(String[] args) {
		Company com = new Company();
		com.getCompShareInfo();
	}
	
	

}