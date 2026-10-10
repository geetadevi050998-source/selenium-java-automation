package repositoryobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountSuccess {
	
	WebDriver driver;
	
	public AccountSuccess(WebDriver driver) {
		this.driver=driver;
	}
	
	private By sucessmessage=By.linkText("Your Account Has Been Created!");
	
//public AccountSuccess(WebDriver driver2) {
		//this.driver=driver;
		
	
	

	public WebElement successmessage()
	{
	
		return driver.findElement(sucessmessage);
	}
	

}
