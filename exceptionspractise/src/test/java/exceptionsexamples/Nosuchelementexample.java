package exceptionsexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nosuchelementexample {
	
	@Test
	public void nosuchelement()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		try {
			
			driver.findElement(By.id("username")).sendKeys("tomsmith");
			
		} catch (Exception e) {
			driver.findElement(By.id("pass")).sendKeys("Vupadhi@123");
		}
		
		driver.quit();
	}

}
