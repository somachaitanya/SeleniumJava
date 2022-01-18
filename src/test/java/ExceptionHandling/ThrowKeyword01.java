package ExceptionHandling;

public class ThrowKeyword01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// throw is used to catch any specific exception
		// it will be used within the method name

		int age = 0;

		if (age < 18) {
			
			throw new ArithmeticException("User is less than 18 years of age.");
		}

		/*
		 * try { int c = 100/num; }catch(Exception e) { e.printStackTrace(); }
		 */
	}

}
