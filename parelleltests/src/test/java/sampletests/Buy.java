package sampletests;

import org.testng.annotations.Test;

public class Buy {
	
	@Test(priority=1)
	public void buywithpayingmoney()
	{
		System.out.println("buy with paying money"+Thread.currentThread().getId());
	}
	@Test(priority=2)
	public void buywithoutpayingmoney()
	
	{
		System.out.println("buy without paying money"+Thread.currentThread().getId());
	}
	@Test(priority=3)
	
	public void paymentfailed()
	{
		System.out.println("payment failed"+Thread.currentThread().getId());
	}
	@Test(priority=4)
	public void paymentsuccess()
	{
		System.out.println("payment success"+Thread.currentThread().getId());
	}

}
