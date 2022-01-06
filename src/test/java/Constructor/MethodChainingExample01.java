package Constructor;

public class MethodChainingExample01 {

	public void test1() {
		System.out.println("test1 method...");
		test2();
	}
	
	public void test2() {
		System.out.println("test2 method...");
		test3();
	}
	
	public void test3() {
		System.out.println("test3 method...");
		test4();
	}
	
	public void test4() {
		System.out.println("test4 method...");
	}
	
	public static void main(String[] args) {
		
		MethodChainingExample01 obj = new MethodChainingExample01();
		obj.test1();
		

	}

}

//1. No output - Aakash, Stephen
//2. test1 method... test2 method... test4 method... - Deepika, Madhu, Ankita, Deepu,kapil,Preeti,Swati
//3. 2nd option with reverse order - Rutuja
//4. test1 method... test2 method... test2 method... test3 method... test3 method... - Chaitanya
