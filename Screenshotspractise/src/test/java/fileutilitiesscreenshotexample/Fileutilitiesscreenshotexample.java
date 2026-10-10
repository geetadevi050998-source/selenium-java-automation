package fileutilitiesscreenshotexample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileutilitiesscreenshotexample {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		//Now Login
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Now take the screenshot for login successfully by using file utilitis
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./screenshots/loginpass.png"));
		System.out.println("login screenshot captured successfully");
		
		driver.quit();
		
		
		
	}

}
