package StringManipulation;

public class StringAssignment01 {


	public static void main(String[] args) {

		StringAssignment01 sa = new StringAssignment01();
		String uniqueString = "esting test abc def @#$%&*23535";  

		if (sa.checkUniqueString(uniqueString))
			System.out.println("The String is unique.");
		else
			System.out.println("Not a unique String.");
		
		System.out.println("The String without spaces: "+sa.removeSpace(uniqueString));
		System.out.println("The String without spaces: "+sa.removeSpecialCharacters(uniqueString));
	}

	public boolean checkUniqueString(String str) {          //true or false

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					return false;
			}
//65 -a 91-z and then A-
		}
		return true;
	}
	
	public String removeSpace(String str) {
		
		String strWithoutSpace=str.replace(" ", "");
		return strWithoutSpace;
	}
	
	
//remove all the special characters and numbers from the string
	//we can charAt, replaceAll()
	
	public String removeSpecialCharacters(String str) {
		String strWithoutSpecialChars = str.replaceAll("[^A-Za-z@]", "");
		
		return strWithoutSpecialChars;
	}
	
}
