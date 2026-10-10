package usecase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	WebDriver driver;
	
	//Locators by using @FindBy
	
	@FindBy(name="search")
	private WebElement Search;
	
	@FindBy(css="btn btn-default btn-lg")
	private WebElement Searchbutton;
	
	//use public 
	public WebElement Search()
	{
		
	return Search;
	
}
	public WebElement Searchbutton()
	{
		return Searchbutton;
		
	}
}
