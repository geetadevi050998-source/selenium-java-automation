package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	 public WebDriver driver;  // MUST be declared

	    @BeforeClass
	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.saucedemo.com/");
	    }
	    
	    @Test(priority=1)
	    public void logintest() throws InterruptedException
	    {
	    	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	    	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    	driver.findElement(By.xpath("//button[@type='button']")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	    	}
	    
	    @Test(priority=1)
	    public void logintestwithvalid() throws InterruptedException
	    {
	    	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("performance_glitch_user12414");
	    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	    	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    	driver.findElement(By.xpath("//button[@type='button']")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	    	
	    	driver.switchTo().alert().accept();
	    	
}
}

