package datadrivensample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovidersample {
WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "dataSupplier")
    public void loginTest(String email, String password) throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // Logout & Continue only if login is successful
        if (driver.getPageSource().contains("Logout")) {
            driver.findElement(By.linkText("Logout")).click();
            driver.findElement(By.linkText("Continue")).click();
        }
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @DataProvider
    public Object[][] dataSupplier() {
        return new Object[][] {
            {"geetadeviadabala5@gmail.com", "Vupadhi@1234"},
            {"geethadevi.a@vupadhi.com", "Ramya@2002"}
        };
    }
}
