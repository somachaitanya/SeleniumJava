package ExceptionHandling;

public class ThrowAndThrows {
	
	public void test1() {
		System.out.println("test1...");
		test2();
	}
	
	public void test2()  {
		System.out.println("test2...");
		test3();
	}
	
	public void test3(){
		System.out.println("test3...");
		test4();
	}
	
	public void test4() {
		System.out.println("test4...");
		try {
			int c = 10/0;
			}catch(Exception e) {
				//System.out.println(e);
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowAndThrows obj = new ThrowAndThrows();
		obj.test1();
		
		// finally can only be used with try/catch
		/*
		 * finally { System.out.println("End of the throw program."); }
		 */
		System.out.println("End of the throw program.");
		
	}

}
