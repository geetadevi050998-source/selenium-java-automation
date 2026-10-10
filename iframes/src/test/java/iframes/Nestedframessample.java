package iframes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Nestedframessample {
public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        Thread.sleep(3000);
        //to get into parent frame first
        driver.switchTo().frame("frame-top");
        //switch to child frame
        driver.switchTo().frame("frame-left");
        //now create xpath and store the element
        String leftframe=driver.findElement(By.xpath("//body")).getText();
        System.out.println("leftframe");
        //first switch to parent frame by using new command
        
        driver.switchTo().parentFrame();
        
        //now switch to middle frame
        
        driver.switchTo().frame("frame-middle");
        
       String middleframe= driver.findElement(By.id("content")).getText();
       
       System.out.println("middleframe");
       
       //now switch to parentframe again
       
       driver.switchTo().parentFrame();
       
       //switch to child right frame
       
      driver.switchTo().frame("frame-right");
      
      String rightframe=driver.findElement(By.xpath("//body")).getText();
      System.out.println(rightframe);
      
      //defualt content-directloy to the page level
      
      driver.switchTo().defaultContent();
      
      //bottom frame
      
      
      driver.switchTo().frame("frame-bottom");
      String bottomframe=driver.findElement(By.xpath("//body")).getText();
      System.out.println(bottomframe);
      
       
      driver.quit();
        
        
	}
	
}
