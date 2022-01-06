package Constructor;

public class MethodChainingExample02 {

	public void test1() {
		System.out.println("test1 method...");
		String test2Output = test2();
		System.out.println(test2Output);
	}
	
	public String test2() {
		System.out.println("test2 method...");
		test3();
		return "test2 Output";
		
	}
	
	public void test3() {
		System.out.println("test3 method...");
		test4();
	}
	
	public void test4() {
		System.out.println("test4 method...");
	}
	
	public static void main(String[] args) {
		
		MethodChainingExample02 obj = new MethodChainingExample02();
		obj.test1();
		

	}

}
