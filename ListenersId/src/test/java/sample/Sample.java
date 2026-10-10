package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(listeners.Listeners.class)
public class Sample {
 public WebDriver driver;  // MUST be declared
 @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
    }
 @Test
    public void loginTest() throws InterruptedException {
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();

        // Intentionally use invalid email to trigger login failure
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("geetadeviadabala05@gmail.com"); // valid
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vupadhi@1234");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.linkText("Logout")).click();
        
        // You can add assertions here to verify login failure
    }
    @Test
    public void loginTest1() throws InterruptedException {
        driver.findElement(By.linkText("My Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Login")).click();
      // Intentionally use invalid email to trigger login failure
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("geetadeviadabdsfdsgsdglcom"); // Invalid
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vupadhi@12dgdg");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
     }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
