package parelleltests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Paralleltestssample {
 @Test(dataProvider = "getTestData", priority = 1)
    public void verifyloginone(String email, String password) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.quit();
    }
 @Test(dataProvider = "getTestData", priority = 2)
    public void verifylogintwo(String email, String password) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.quit();
    }
    @DataProvider(name = "getTestData", parallel = true)
    public Object[][] datasupplier() {
        return new Object[][] {
            {"geetadeviadabala05@gmail.com", "Vupadhi@1234"},
            {"geetadeviadabala5@gmail.com", "Vupadhi@123"}
        };
    }
}




