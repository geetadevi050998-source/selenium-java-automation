package iframes;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Indexsample {
public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       /* driver.get("https://the-internet.herokuapp.com/iframe");
        Thread.sleep(3000);

       // List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        //System.out.println("Number of iframes: " + frames.size());

       // driver.quit();
        
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
        driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("Geetha Devi");
        */
        
        //nested frame
        
        driver.get("https://letcode.in/frame");
        driver.switchTo().frame("firstFr");
        driver.findElement(By.name("fname")).sendKeys("Geetha Devi");
        driver.findElement(By.name("lname")).sendKeys("Adabala");
        WebElement childframe = driver.findElement(By.xpath("//iframe[@src='innerframe']"));
        driver.switchTo().frame(childframe);
        driver.findElement(By.name("email")).sendKeys("geetadeviadabala05@gmail.com");
        
    }
}



 





