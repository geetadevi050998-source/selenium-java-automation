package objectrepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage {
	
WebDriver driver;
	
	//Locators
	//private By Account=By.xpath("//a[@title='My Account']");
	//private By Login=By.linkText("Login");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	private By emailid=By.id("input-email");
	private By Password=By.id("input-password");
	private By submit=By.xpath("//input[@type='submit']");
	
	//public WebElement Account()
	//{
	//	return driver.findElement(Account);
		
	//}
	
	//public WebElement Login()
	//{
	//	return driver.findElement(Login);
	//}
	
	public WebElement emailid()
	{
		return driver.findElement(emailid);
		
	}
	
	public WebElement Password()
	{
		return driver.findElement(Password);
		
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
		
	}
	
}
