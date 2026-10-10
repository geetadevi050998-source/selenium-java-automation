package robotexample;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Robotexample {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// Now click on Js alert

		//driver.findElement(By.linkText("Click for JS Alert")).click();
		
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);

		// 1.Now take the screenshot by using File utilities (JS alert)
		try
		{
			
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("./Screenshots/jsalertfileutilities.png"));
		System.out.println("Fileutilities js alert handle");
		}
		catch (Exception e) {
			System.out.println("expection handle-alert will not handle hnadle in fileutilities");
		}

		// 2.Now take the screenshot by using File Handler (JS alert)
		
		try
		{
			
		File src2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, new File("./Screenshots/jsalertsfilehandler.png"));
		System.out.println("Filehandler-alert");
		}
		
		catch (Exception e) {
		System.out.println("expection handle-alert will not handle hnadle in filehandler");
		}

		// 3.Now take the screenshot by using Robot class (JS alert)

		// Create robot class
		
		try
		{
			
		Robot r = new Robot();

		// Rectangle screenRect=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage image = r.createScreenCapture(screenRect);
		ImageIO.write(image, "png", new File("./Screenshots/jslaertsrobot.png"));

		System.out.println("Robot-Js alert");
		}
		 catch (Exception e) {
			 System.out.println("expection handle-alert will  handle hnadle in Robot class");
		}

		// now accept the alert

		driver.switchTo().alert().accept();

		driver.quit();

	}

}
