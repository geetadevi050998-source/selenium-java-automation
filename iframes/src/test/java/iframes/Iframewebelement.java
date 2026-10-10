package iframes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframewebelement {
	
	public static void main(String[] args) throws InterruptedException {
	        
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
	        Thread.sleep(3000);

	        WebElement iframeElement=driver.findElement(By.xpath("(//a[@title='CSS Tutorial'])[2]"));
	        
	        driver.switchTo().frame(iframeElement);
	        
	        driver.findElement(By.linkText("The iframe element")).click();
	        
	        
	        
	        
	        
	        


	        
	      
	    }
	}


