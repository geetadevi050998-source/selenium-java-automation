package sampletests;

import org.testng.annotations.Test;

public class Loginsample {

    @Test(priority = 1)
    public void loginwithvaliddata() throws InterruptedException {
        System.out.println("loginwithvaliddata - Thread ID: " + Thread.currentThread().getId());
        Thread.sleep(3000);  // simulate 3 seconds delay
    }

    @Test(priority = 2)
    public void loginwithinvaliddata() throws InterruptedException {
        System.out.println("loginwithinvaliddata - Thread ID: " + Thread.currentThread().getId());
        Thread.sleep(3000);  // simulate 3 seconds delay
    }

    @Test(priority = 3)
    public void loginwithoutenteringdata() throws InterruptedException {
        System.out.println("loginwithoutenteringdata - Thread ID: " + Thread.currentThread().getId());
        Thread.sleep(3000);  // simulate 3 seconds delay
    }
}

	
	