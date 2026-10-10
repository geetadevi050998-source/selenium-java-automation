package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Myaccount {
	
	WebDriver driver;
	
	//COnstructor
	public Myaccount(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	private By Account=By.linkText("My Account");
	
	public WebElement Account()
	{
		return driver.findElement(Account);
		
	}

}
