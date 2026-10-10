package loginresultsTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginresultsTest {
	
	public static void main() throws IOException {
		// Step 1:Lunch the Set up	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Step 2: Navigate to the We site
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.xpath("//input[@id='user-name']"))	.sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.quit();
		

}
}
