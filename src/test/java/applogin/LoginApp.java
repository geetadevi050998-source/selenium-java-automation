package applogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginApp {
	WebDriver driver;
	ExtentReports extent;
	@BeforeMethod
	public void Configuration()
	{
		String srclocation=System.getProperty("user.dir")+"\\loginreports\\login.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(srclocation);
		reporter.config().setReportName("Login Request ");
		reporter.config().setReportName("Login page Title Request");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Windows 10", "Geetha");
		}
	@Test
public void Login()
{
		ExtentTest test = extent.createTest("Login page Request Started");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		extent.createTest("Login page Request started");
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		test.info("USer id details entered");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		test.info("Password details entered");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		test.info("Login Successful");
}@AfterMethod
public void teardown()
{
	driver.close();
	extent.flush();
}
}
	



