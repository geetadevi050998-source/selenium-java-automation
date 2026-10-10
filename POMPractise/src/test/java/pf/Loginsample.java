package pf;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Loginsample {
	
	WebDriver driver;
	
	public Loginsample(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators use of @findby
	
	@FindBy(id="username")
	
	private WebElement usernamefield;
	
	@FindBy(id="password")
	
	private WebElement passwordfield;
	
	@FindBy(id="submit")
	
	private WebElement submitbutton;
	
	@FindBy(xpath="//h1[contains(text(),'Logged In Successfully')]")
	
	private WebElement successmessage;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	
	private WebElement logout;
	
	//use public
	
	public WebElement usernamefield() {
		return usernamefield;
		
	}
	
	public WebElement passwordfield()
	{
		return passwordfield;
	}
	
	public WebElement submitbutton()
	{
		return submitbutton;
		
	}
	
	public WebElement successmessage()
	{
		return successmessage;
		
	}
	
	public WebElement logout()
	{
		return logout;
		
	}
	
	
	
	}
	
	
	
	
	
	


