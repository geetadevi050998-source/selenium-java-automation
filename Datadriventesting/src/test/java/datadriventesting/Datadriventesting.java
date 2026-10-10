package datadriventesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Datadriventesting {
	
	@Test(dataProvider="datasupplier")
	public void datadriventestexample(String email,String Password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		//login with user id and password
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
	 @DataProvider(name = "datasupplier")
	    public Object[][] datasupplier() {
	        Object[][] data = {
	            {"geethadevi.a@vupadhi.com", "Vupadhi@123"},
	            {"geetadeviadabala05@gmail.com", "Vupadhi@1234"}
	        };
	        return data;
	
	}

}
