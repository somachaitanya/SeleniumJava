package TestNGConcept;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test()
	public void launchBrowser() {
		System.out.println("browser launced...");
		int i = 90 / 0;
	}

	@Test(dependsOnMethods = "launchBrowser")
	public void launchUrl() {
		System.out.println("url launched...");
	}

	@Test(dependsOnMethods = "launchBrowser" )
	public void verifyingTitle() {
		System.out.println("title verified successfully...");
	}
}
