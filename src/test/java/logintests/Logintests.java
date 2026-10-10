package logintests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Logintests {
	WebDriver driver;
	@AfterMethod
	public void teardown()
		{
		driver.quit();
}
	@BeforeMethod()
	//Set up for lunching the Browser
	public void loginsetup()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}
@Test
	public void loginpass()
		{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Assert.assertTrue(driver.getCurrentUrl().contains("Secure Area"));
		Assert.assertTrue(driver.getPageSource().contains("Secure Area"));
		System.out.println("This test will be passed");
		driver.findElement(By.linkText("Logout")).click();
		//driver.findElement(By.linkText(" Logout")).click();
	}
@Test(dependsOnMethods = "loginpass")
public void loginfailed()
{
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Super");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println("This test will be failed");
	Assert.assertTrue(false);
}
@Test(dependsOnMethods = "loginfailed")
public void loginskip()
{
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
	//driver.findElement(By.xpath("submit")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println("This test will be skipped");

}
}




