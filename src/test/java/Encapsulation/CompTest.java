package Encapsulation;

public class CompTest {

	public static void main(String[] args) {

		
		Company comp = new Company();
		//comp.getCompAddress();
		
		//comp.getShareInformation();
		//comp.getCompanyShareInfo();
		//comp.displayCompanyShareInfo();
		comp.setPolicy("Terms and Conditions");
		String getplicyResult = comp.getPolicy();
		System.out.println(getplicyResult);		
		
	}

}