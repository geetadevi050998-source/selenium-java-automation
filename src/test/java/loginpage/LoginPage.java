package loginpage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class LoginPage {
	
	public static void main() throws IOException {
	// Step 1:Lunch the Set up	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	//Step 2: Navigate to the We site
	driver.get("https://www.saucedemo.com");
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("wrong_password");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	
	//Step 3:Want to take Screenshot 
	//cast the driver with take screenshot and save it in src file 
	File srcpath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(srcpath,new File("C:\\Users\\YourUserName\\Desktop\\Loginpage.png"));
	//Step 4:Now use File Utilities to store it in our folder with file name
	//FileUtils.copyFile(srcpath,new File("\\Screenshots\\Loginpage.png"));
	FileUtils.copyFile(srcpath, new File("./Screenshots/Loginpage.png"));
	driver.quit();
	
	
	
	}

}
