package pfpractise;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pf.Loginsample;

public class Logintest {
	
	@Test
	
	public void Logintest()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login");
		
		//we need to create objects
		
	Loginsample loginsample=new Loginsample(driver);
	
	loginsample.usernamefield().sendKeys("student");
	loginsample.passwordfield().sendKeys("Password123");
	loginsample.submitbutton().click();
	loginsample.successmessage().isDisplayed();
	loginsample.logout().click();
	
	driver.close();
	
	
	}

}
