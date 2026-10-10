package accountcreation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import repositoryobject.AccountSuccess;
import repositoryobject.RegistrationPage;

public class Registertest {
	
	@Test
	public void Register()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		//we need to call registration page by creating objects
		
		RegistrationPage registrationpage=new RegistrationPage(driver);
	
		registrationpage.firstname().sendKeys("Geetha");
		registrationpage.lastname().sendKeys("Adabala");
		registrationpage.emailid().sendKeys("geetaadabala@gmail.com");
		registrationpage.telephone().sendKeys("9876123456");
		registrationpage.password().sendKeys("Adabala@123");
		registrationpage.confirmpwd().sendKeys("Adabala@123");
		registrationpage.checkbox().click();
		registrationpage.submit().click();
		
		AccountSuccess accountsuccess=new AccountSuccess(driver);
		//accountsuccess.successmessage().isDisplayed();
		Assert.assertTrue(accountsuccess.successmessage().isDisplayed(), "Account success message is  displayed!");
		
		driver.close();
		
		
	}

}


