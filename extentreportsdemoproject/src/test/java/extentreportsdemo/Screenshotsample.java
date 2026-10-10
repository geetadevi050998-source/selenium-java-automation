package extentreportsdemo;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Screenshotsample {
    public static void main(String[] args) throws Exception {

 // Initialize Extent Report
        ExtentReports extent = new ExtentReports();
        File file = new File(System.getProperty("user.dir") + "\\ExtentReports\\SparkReport.html");
        //Intialize spark reporter
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
        extent.attachReporter(sparkReporter);
        WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        // Take Screenshot
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destFilepath = System.getProperty("user.dir") + "\\Screenshots\\testsample.png";
        FileUtils.copyFile(srcFile, new File(destFilepath));

        // Logging in Extent Report
        ExtentTest etest1 = extent.createTest("Testone");
        etest1.log(Status.INFO, "TestOne Execution Started");
        etest1.addScreenCaptureFromPath(destFilepath,"Home page");

        extent.flush();

        // Open report in browser
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(file.toURI());
        } else {
            System.out.println("⚠️ Desktop not supported. Please open the report manually.");
        }

        driver.quit();
    }
}
