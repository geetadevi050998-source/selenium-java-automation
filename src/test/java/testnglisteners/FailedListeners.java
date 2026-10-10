package testnglisteners;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.*;

import extentreport.Extentreportgenerator;
import screenshot.takeScreenshot;
public class FailedListeners extends takeScreenshot implements ITestListener {
ExtentReports report = Extentreportgenerator.getExtentReport();
    ExtentTest etest;
 public void onTestStart(ITestResult result) {

        String testName = result.getName();
        etest = report.createTest(testName);
        etest.log(Status.INFO, testName + " execution started");
    }

    public void onTestSuccess(ITestResult result) {

        String testName = result.getName();
        etest.log(Status.PASS, testName + " execution passed");
    }

    public void onTestSkipped(ITestResult result) {

        String testName = result.getName();
        etest.log(Status.SKIP, testName + " execution skipped");
    }
    public void onTestFailure(ITestResult result) {

        WebDriver driver = null;

        try {

            java.lang.reflect.Field field = result.getTestClass()
                    .getRealClass()
                    .getDeclaredField("driver");

            field.setAccessible(true);

            driver = (WebDriver) field.get(result.getInstance());

        } catch (Exception e) {
            e.printStackTrace();
        }

        String testName = result.getName();

        etest.fail(result.getThrowable());

        try {

           // String path = takeScreenshot(testName, driver);
          //  etest.addScreenCaptureFromPath(path);
            String path = takeScreenshot(testName, driver);

            etest.addScreenCaptureFromPath("../Screenshots/" + testName + ".png");

        } catch (Exception e) {

            System.out.println("Screenshot capture failed");
            e.printStackTrace();
        }
    }
    
public void onFinish(ITestContext context) {

        report.flush();
    }
}