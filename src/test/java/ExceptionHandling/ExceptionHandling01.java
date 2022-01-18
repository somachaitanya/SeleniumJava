package ExceptionHandling;

public class ExceptionHandling01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int c = 10 / 0;
			System.out.println(c);
			//you're reading some file - NullPointerException
		}catch(Throwable ex) {
			System.out.println(ex);
		}
		/*
		 * catch(NullPointerException npe) { System.out.println(npe); }
		 */
		
		finally{
			System.out.println("finally executed");
		}

		System.out.println("We have got some exception");

	}

}//final, finally