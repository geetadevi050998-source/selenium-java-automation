package extentreport;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportgenerator {

    public static ExtentReports getExtentReport() {

        ExtentReports report = new ExtentReports();

        String path = System.getProperty("user.dir") + "/ExtentReports/failedreport.html";

        ExtentSparkReporter sparkreporter = new ExtentSparkReporter(path);

        sparkreporter.config().setReportName("Automation Test Report");
        sparkreporter.config().setDocumentTitle("Selenium TestNG Report");

        report.attachReporter(sparkreporter);

        return report;
    }
}