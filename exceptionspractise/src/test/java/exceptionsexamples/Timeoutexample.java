package exceptionsexamples;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Timeoutexample {
@Test
	public void timeoutexcpetion()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		//driver.findElement(By.linkText("Start")).click();

        driver.findElement(By.xpath("//div[@id='start']/button")).click();
		//try {
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
			
		//	WebElement text = wait.until(
	              //  ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4"))
	           // );
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));
			System.out.println("timeout exceptionoccured ");
			//} catch (Exception e) {
			
			//System.out.println("timeout exceptionoccured we need to handle it by time");
		
		//}
		//driver.findElement(By.id("finish"));
		driver.quit();
	}
}
