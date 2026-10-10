package invocationsample;

import org.testng.annotations.Test;

public class Invocationsample {
	
	@Test(invocationCount = 6, threadPoolSize = 3)
	public void testMethod() {
	    System.out.println("Thread ID: " + Thread.currentThread().getId());
	}
}

