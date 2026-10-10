package samplelisteners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Samplelisteners implements ITestListener {

	@Override
    public void onTestStart(ITestResult result) {
        String testname = result.getName();
        System.out.println(testname + " started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        String testname = result.getName();
        System.out.println(testname + " Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String testname = result.getName();
        System.out.println(testname + " failed");

      WebDriver driver=null;
      try {
          // Access driver from test class using reflection
          WebDriver driver1 = (WebDriver) result.getTestClass()
              .getRealClass()
              .getDeclaredField("driver")
              .get(result.getInstance());

          takeScreenshot(driver1, testname);	

      } catch (Exception e) {
          System.err.println("⚠️ Could not capture screenshot");
          e.printStackTrace();
      }
    }

	private void takeScreenshot(WebDriver driver1, String testname) {
		// TODO Auto-generated method stub
		
	}
}
