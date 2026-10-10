package repositoryobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RegistrationPage {
	
	WebDriver driver;
public RegistrationPage(WebDriver driver) {
		
		this.driver=driver;
}
	
	//Locators
	
	private By firstname=By.id("input-firstname");
	private By lastname=By.id("input-lastname");
	private By emailid=By.id("input-email");
	private By telephone=By.id("input-telephone");
	private By password=By.id("input-password");
	private By confirmpwd=By.id("input-confirm");
	private By checkbox=By.name("agree");
	private By submit=By.xpath("//input[@type='submit']");
	
	

	public WebElement firstname()
	
	{
		return driver.findElement(firstname);
	}
	
	public WebElement lastname()
	{
		return driver.findElement(lastname);
		
	}
	
	public WebElement emailid()
	{
		return driver.findElement(emailid);
		
	}
	
	public WebElement telephone()
	{
		return driver.findElement(telephone);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement confirmpwd()
	{
		return driver.findElement(confirmpwd);
		
	}
	
	public WebElement checkbox()
	{
		return driver.findElement(checkbox);
		
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
		
	}
	
	
	
	
	
	}


