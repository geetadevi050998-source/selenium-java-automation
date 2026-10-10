package ahotlibraryexample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


public class Ashotlibrary {
	public static void main(String[] args) throws IOException {
		
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://the-internet.herokuapp.com/large");

		        // Full page screenshot using AShot
		        Screenshot screenshot = new AShot()
		                .shootingStrategy(ShootingStrategies.viewportPasting(100))
		                .takeScreenshot(driver);

		        ImageIO.write(screenshot.getImage(), "PNG", new File("./Screenshots/FullPageChrome_AShot.png"));
		        System.out.println("Full-page screenshot captured using AShot!");
		        driver.quit();
		    }
		}

		
		