package expectedExceptionsAttribute;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpectedExceptionsAttribute {
	
	public class Timeoutattributesample {
		
		@Test(expectedExceptions= {NoSuchElementException.class})
		public void sample1() {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			driver.findElement(By.linkText("Software1")).click();
			driver.quit();
			
		}

	}

}
