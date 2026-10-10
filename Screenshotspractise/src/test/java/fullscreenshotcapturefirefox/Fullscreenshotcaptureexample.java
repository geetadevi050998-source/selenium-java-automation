package fullscreenshotcapturefirefox;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fullscreenshotcaptureexample {

	public static void main(String[] args) throws IOException {

		

		// WebDriver driver=new FirefoxDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/large");

		// Take full page screenshot

		//File src = driver.getFullPageScreenshotAs(OutputType.FILE);

		//FileUtils.copyFile(src, new File("./Screenshots/FullPageFirefox.png"));

		System.out.println("Full-page screenshot captured!");
		driver.quit();

	}

}
