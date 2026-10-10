package usecase2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pf.Loginsample;
import usecase.Homepage;

public class SearchTest {
	
	@Test
	
	public void SearchTest ()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	Homepage homepage=new homepage();
	
			
	
	
	
	
	
	
	
	

}
