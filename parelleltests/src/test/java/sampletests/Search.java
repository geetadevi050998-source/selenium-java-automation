package sampletests;

import org.testng.annotations.Test;

public class Search {
	
 @Test(priority = 1)
	    public void Searchwithvaliddata() throws InterruptedException {
	        System.out.println("Searchwithvaliddata - Thread ID: " + Thread.currentThread().getId());
	        Thread.sleep(3000); // simulate processing
	    }

	    @Test(priority = 2)
	    public void Searchwithinvaliddata() throws InterruptedException {
	        System.out.println("Searchwithinvaliddata - Thread ID: " + Thread.currentThread().getId());
	        Thread.sleep(3000);
	    }

	    @Test(priority = 3)
	    public void Searchwithoutenteringdata() throws InterruptedException {
	        System.out.println("Searchwithoutenteringdata - Thread ID: " + Thread.currentThread().getId());
	        Thread.sleep(3000);
	    }
	}



