package usecase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResults {
	
	WebDriver driver;
	
	 @FindBy(linkText = "iPhone")
	    WebElement productName;
	 
	 @FindBy(xpath = "//button[@data-original-title='Add to Cart']")
	    WebElement addToCartButton;

	    @FindBy(css = ".alert-success")
	    WebElement successMessage;
	    
	    public WebElement iphone()
	    
	    {
	    	return productName;
	    	
	    }
	    
	    public WebElement  addtocartbutton()
	    {
	    	return addToCartButton;
	    	
	    }
	    
	    public WebElement successMessage()
	    {
	    	return successMessage;
	    	
	    }
	
	    
	    

}
