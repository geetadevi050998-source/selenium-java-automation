package pack;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;
import objectrepository.Myaccount;

public class Logintest {
	//WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test
	public void login()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//WebDriver driver=new ChromeDriver(); this driver is accessible till site opening then  LoginPage loginpage=new LoginPage(driver); 
	//	Myaccount myaccount=new Myaccount(driver); 
		//then for this two pages in that classes we need to call the constructor 
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.emailid().sendKeys("geeta98@gmail.com");
		loginpage.Password().sendKeys("Vupadhi@123");
		loginpage.submit().click();
		
		
		Myaccount myaccount=new Myaccount(driver);
		Assert.assertTrue(myaccount.Account().isDisplayed()); //pass
		
		driver.close();
	}
	
	
}


