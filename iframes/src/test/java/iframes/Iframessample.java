package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframessample {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
        Thread.sleep(3000);

        // ✅ Close the notification (on main page, not inside iframe)
        driver.findElement(By.xpath("//button[contains(@class,'tox-notification__dismiss')]")).click();

        // ✅ Switch to iframe to access TinyMCE editor
        driver.switchTo().frame("mce_0_ifr");

        // ✅ Clear and type into TinyMCE editor
       //driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
       // driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("Geetha Devi");


        // Use JavaScript to clear and set content
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.innerHTML = '<p>Geetha Devi</p>';");
      
    }
}



