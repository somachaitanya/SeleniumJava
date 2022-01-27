package AbstractionConcept;

public class AbstractionTest extends AbstractClassConcept {

	public static void main(String[] args) {

		AbstractionTest ab = new AbstractionTest();
		testMethod2();

		//testMethod2();
		ab.testMethod();
		ab.testMethod3();

	}

	@Override
	void testMethod() {
		System.out.println("test method 1");
	}

	@Override
	void testMethod3() {
		System.out.println("test method 3");

	}

}
