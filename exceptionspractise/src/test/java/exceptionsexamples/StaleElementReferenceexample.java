package exceptionsexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceexample {
	
	@Test
	public void staleelement() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	System.out.println("check box element identified");
	driver.findElement(By.xpath("//button[@autocomplete='off']")).click();
Thread.sleep(5000);
	
	checkbox.click();
	
	
	}

}
