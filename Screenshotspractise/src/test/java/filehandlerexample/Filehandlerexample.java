package filehandlerexample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Filehandlerexample {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		//Now Login
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Now take the screenshot by using filehandler
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(src, new File("./Screenshots/LoginARM"));
		FileHandler.copy(src, new File("./Screenshots/LoginHRM.png"));
		System.out.println("HRM login success-Required screenshot");
		
		
		driver.quit();
		
	}

}
