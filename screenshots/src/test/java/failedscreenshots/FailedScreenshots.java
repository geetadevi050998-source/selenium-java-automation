package failedscreenshots;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FailedScreenshots {

   public WebDriver driver;  // class-level variable

    @BeforeTest
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); // ✅ correct assignment
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void passedtests1() {
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("geetadeviadabala05@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vupadhi@1234");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.linkText("Logout")).click();
        
    }

    @Test(priority = 2)
    public void passedtests2() {
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("geetadeviadabala5@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vupadhi@123");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Test(priority = 3)
    public void failedtests() {
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("geetadeviadabala598@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vupadhi@123456");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Assert.assertTrue(
        	    driver.findElement(By.linkText("Edit your account information")).isDisplayed(),
        	    "❌ 'Edit your account information' link not found — login will fail"
        	);
    }
    
    }

