package ArrayPackage;

public class ArrayExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char array & String arrays?
		char [] newCharList = new char[4];
		newCharList[0] = 'a';
		newCharList[1] = '$';
		newCharList[2] = '&';
		newCharList[3] = 'a';
		newCharList[2] = '%';
		
		for(char b : newCharList) {
			System.out.println(b);
		}
		System.out.println("======================================");
		
		for(int i =0; i <newCharList.length; i++) {
			System.out.println(newCharList[i]);
		}
	}

}
