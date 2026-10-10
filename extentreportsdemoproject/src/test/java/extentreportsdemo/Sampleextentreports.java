package extentreportsdemo;

import java.awt.Desktop;
import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Sampleextentreports {

    public static void main(String[] args) throws Exception {
        // Step 1: Report location
        String reportPath = System.getProperty("user.dir") + "/ExtentReports/SparkReport.html";
        File reportFile = new File(reportPath);

        // Step 2: Initialize Spark reporter
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportFile);

        // Step 3: Initialize ExtentReports and attach reporter
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // Step 4: Create a test case
        ExtentTest test1 = extent.createTest("Sample Test");
        test1.pass("Test Passed Successfully!");
        
        //
        ExtentTest test2 = extent.createTest("Sample Test");
        test2.fail("Test fail Successfully!");
        
        ExtentTest test3 = extent.createTest("Sample Test");
        test3.skip("Test skip  Successfully!");

        // Step 5: Write everything to the report
        extent.flush();

        System.out.println("✅ Report created at: " + reportPath);

        // Step 6: Open the report in default browser
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(reportFile.toURI());
        } else {
            System.out.println("⚠️ Desktop not supported. Please open the report manually.");
        }
    }
}

