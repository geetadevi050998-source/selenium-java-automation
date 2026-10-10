import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Codingchallenge {

    WebDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        // LambdaTest Desired Capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("browserVersion", "latest");

        // Enable logs and recording
        capabilities.setCapability("network", true);
        capabilities.setCapability("video", true);
        capabilities.setCapability("console", true);

        // Replace with your actual LambdaTest username and access key
        String username = "YOUR_LAMBDATEST_USERNAME";
        String accessKey = "YOUR_LAMBDATEST_ACCESS_KEY";

        String hubURL = "https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub";
        driver = new RemoteWebDriver(new URL(hubURL), capabilities);
        driver.manage().window().maximize();
    }

    @Test
    public void testSimpleFormDemo() throws IOException {
        // Step 1: Open the Selenium Playground
        driver.get("https://www.lambdatest.com/selenium-playground");

        // Step 2: Click “Simple Form Demo” (Using linkText locator)
        WebElement simpleFormDemoLink = driver.findElement(By.linkText("Simple Form Demo"));
        simpleFormDemoLink.click();

        // Step 3: Validate URL contains “simple-form-demo”
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("simple-form-demo"), "URL does not contain 'simple-form-demo'");

        // Step 4: Create a message variable
        String inputMessage = "Welcome to LambdaTest";

        // Step 5: Enter value in “Enter Message” box (ID locator)
        WebElement inputBox = driver.findElement(By.id("user-message"));
        inputBox.sendKeys(inputMessage);

        // Step 6: Click “Get Checked Value” (XPath locator)
        WebElement getCheckedValueButton = driver.findElement(By.xpath("//button[@id='showInput']"));
        getCheckedValueButton.click();

        // Step 7: Validate message in “Your Message” section (CSS Selector)
        WebElement outputMessage = driver.findElement(By.cssSelector("#message"));
        String actualMessage = outputMessage.getText();
        Assert.assertEquals(actualMessage, inputMessage, "Mismatch in displayed message.");

        // Step 8: Take screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("screenshot.png"));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }
}

