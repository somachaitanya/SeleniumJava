package StringManipulation;

public class StringManipulationConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1.concat
		String str1 = "Hey I enjoy working with Java.";
		String str2 = "Java 16 is quite helpful while we are working with Selenium.";
		
		String str3 = str1 + " " + str2;
		System.out.println(str3);
		String str4 = str1.concat(str2);
		System.out.println(str4);
		
		//2. Length();
		int len = str1.length(); //30
		System.out.println(len);
		
		String userName = "Ankitaa";
				
		if(userName.length() > 6) {
			System.out.println("valid username");
		}
		else {
			System.out.println("Invalid username");
		}
		
		//3. charAt()
		System.out.println(userName.charAt(2));
		//System.out.println(str1.charAt(30));
	
		
		//4. indexOf('i')
		System.out.println(str2.indexOf('i'));
		
		//5. indexOf('i', 6)
		System.out.println(str2.indexOf('i',6));
		
		System.out.println(str2.indexOf('i',str2.indexOf('i')+1));
		
		System.out.println(str2.indexOf("selenium"));
		
		String msg = "Welcome to User Page";
		
		if(msg.indexOf("Login")>0) {
			System.out.println("message verified");
		}
		else {
			System.out.println("invalid message");
		}
		
		System.out.println(str1.charAt(-1));

	}

}
