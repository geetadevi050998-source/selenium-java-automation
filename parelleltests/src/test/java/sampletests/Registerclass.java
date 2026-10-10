package sampletests;

import org.testng.annotations.Test;

public class Registerclass {

    @Test(priority = 1)
    public void Registerwithvaliddata() throws InterruptedException {
        System.out.println("Registerwithvaliddata - Thread ID: " + Thread.currentThread().getId());
        Thread.sleep(3000);  // simulate 3 seconds processing time
    }

    @Test(priority = 2)
    public void Registerwithinvaliddata() throws InterruptedException {
        System.out.println("Registerwithinvaliddata - Thread ID: " + Thread.currentThread().getId());
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void Registerwithoutenteringdata() throws InterruptedException {
        System.out.println("Registerwithoutenteringdata - Thread ID: " + Thread.currentThread().getId());
        Thread.sleep(3000);
    }
}
