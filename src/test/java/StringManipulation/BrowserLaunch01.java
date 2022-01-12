package StringManipulation;

public class BrowserLaunch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//toLowerCase() 
		String browserName = "  mozilla   firefoX  ";

		if (browserName.toUpperCase().trim().equals("CHROME"))
			System.out.println("chrome launched");
		else if (browserName.toUpperCase().trim().equals("MOZILLA FIREFOX"))
			System.out.println("firefox launched");
		else if (browserName.toUpperCase().trim().equals("SAFARI"))
			System.out.println("safari launched");
		else
			System.out.println("please choose correct browser name");
		
		
		//contains
		String title = "amazon- the worLD leading e-com.";
		if(title.equals("Amazon- The world leading e-com.")) {
			System.out.println("Test pass");
		}
		else
			System.out.println("test failed");
		
		
		String companyName = "Aapna Infotech Pvt Ltd."; // output - Ltd. Pvt Infotech Aaapna
		//replace
		String dob = "12-01-1990";
		System.out.println(dob.replace('-', '/'));
		
		//split
		String s1[] = companyName.split(" ");
		
		/*
		 * for(String str: s1) { System.out.println(str); }
		 */
		
		for(int i = s1.length-1; i >=0;i--) {
			System.out.print(s1[i]);
		}
		
		String name = "Rutuja"; // ajutuR
		
		String rev="";
		int len = name.length();
		for(int i=len-1; i >=0; i--) {
			rev=rev+name.charAt(i);
		}
		
		System.out.println("==================");
		System.out.println(rev);
	
	//split
	//create user page 
	// name - , email - , Phone -, address -
	//Aakash;aakash01@abc.com;3253253534;India
	
	//String userDetail = "Aakash;aakash01@abc.com;3253253534;India";
	String userDetail = "Nikhil;aakash01@abc.com;3253253534;India";
	String userData[] = userDetail.split(";");
	
	String successMsg = "Welcome Nikhil";
		
	//name - userData[0]
	
	if(successMsg.contains(userData[0])) {
		System.out.println("Pass");
	}
	else
		System.out.println("Fail");
	
	String test = "xXIndiaxXXUKXxXUSAxX";
	String testing[] = test.split("xX");
	System.out.println("Output for the TEST string");
	System.out.println(testing[0]);
	System.out.println("End of the TEST string");

	}
}

//1. India UK USA - Buddha, Naresh
//2. IndiaXUKXUSA - , 
//3. India - Ankita, Chaitanya, Bhavna, Vaibhav
//4. USA - Rutuja
//5. xXIndia - Chaitanya
//6. null - Deepika, Swati

//contains

//Ques1. WAP to check the uniqueness of the String.

//trim() - it is used to remove the spaces from before string or after the last word in the string
//1. Please choose correct browserName - Bhavna, Ankita,Buddha, Stephen,Deepika, Vaibhav, Chaitanya, Naresh, Rutuja
//2. MOZILLA FIREFOX launched - 
//3.