package ArrayPackage;

public class ArrayExample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,3,4,5};
		for(int i : a) {
			//System.out.println(i);
		}
		
		//disadvantages of Array:
		//1. size cannot be changed - these are static in nature
		int b[] = new int[6];
		b[0]= 5;
		b[1]= 6;
		b[2]= 7;
		b[3]= 8;
		b[4]= 9;
	
		//b[67] = 7;

		//System.out.println(b[5]);
		
		int multi[][] = new int[2][2];
		multi[0][0] = 5;
		multi[0][1] = 0;
		multi[1][0] = 3;
		multi[1][1] = 6;
		
		//System.out.println(multi[0][0]);
		
/*		
		for(int i=0; i < 2; i++) {
			for(int j=0; j<=2; j++) {
				System.out.println(multi[i][j]);
			}
		}
	
*/	
		for(int firstIndex[] : multi) {
			for(int secoundIndex : firstIndex) {
				System.out.println(secoundIndex);				
			}
		}
	}

}

