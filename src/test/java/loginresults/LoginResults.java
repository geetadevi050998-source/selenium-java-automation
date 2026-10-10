package loginresults;
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
public class LoginResults {
	WebDriver driver;
	ExtentReports extent;
	@BeforeMethod
	public void configuration()
	{
		//Add Configurations before method
		//Step1:Add Extent Report
		//know the path for this by using system .get property
		String srclocation=System.getProperty("user.dir")+"\\reports\\index.html";
		//to extent report pass that path
		ExtentSparkReporter reporter=new ExtentSparkReporter(srclocation);
		reporter.config().setReportName("Login Page  Results");
		reporter.config().setReportName("Login Page Title");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	@Test
	public void testlogin()
	{
		//Step 2: Lunch browser
		ExtentTest test = extent.createTest("Login page Opened");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	extent.createTest("Login user entered");
	extent.createTest("Password entered");
	test.info("Login page started");
	test.info("User id Entered");
	test.info("Password entered");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	ExtentTest etest = extent.createTest("Testone");
	extent.createTest("Test one passed");
	}@AfterMethod
	public void teardown()
	{
		driver.close();
		extent.flush();
	}}




