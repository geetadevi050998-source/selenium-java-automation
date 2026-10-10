package sample;

import org.testng.annotations.Test;

public class SampleB {
	

	@Test(priority=1)
	
	public void registerwithvaliddata()
	{
		System.out.println("register with validdata");
	}
	@Test(priority=2)
	
	public void registerwithinvaliddata()
	{
		System.out.println("register with invaliddata");
	}
	@Test(priority=3)
	
	public void loginwithoutenteringdata()
	{
		System.out.println("register without enteringdata");
	}
}



