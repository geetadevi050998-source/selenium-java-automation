package extentreportsdemo;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class Logssample {
    public static void main(String[] args) {
        // 1. Define the report path
        String reportPath = System.getProperty("user.dir") + "/ExtentReports/SparkReport.html";
        File reportFile = new File(reportPath);
        
        // 2. Initialize Spark Reporter
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportFile);
        
        // 3. Initialize ExtentReports and attach SparkReporter
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        //now add that xml content
        // 4. Create a test and log messages of different status levels
        ExtentTest test = extent.createTest("TestOne");
       // test.log(Status.INFO, "<I>TestOne started</I>");
       /*String jsonContent="\r\n"
       		+ "{\"menu\": {\r\n"
       		+ "  \"id\": \"file\",\r\n"
       		+ "  \"value\": \"File\",\r\n"
       		+ "  \"popup\": {\r\n"
       		+ "    \"menuitem\": [\r\n"
       		+ "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
       		+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
       		+ "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n"
       		+ "    ]\r\n"
       		+ "  }\r\n"
       		+ "}}";
       
       test.info("Logging JSON content:");
       test.info(MarkupHelper.createCodeBlock(jsonContent, com.aventstack.extentreports.markuputils.CodeLanguage.JSON));
     
     // test.log(Status.INFO,(jsonContent, com.aventstack.extentreports.markuputils.CodeLanguage.JSON));

//);*/
        //test.log(Status.INFO, "Test one");
        //test.log(Status.INFO, MarkupHelper.createLabel("Test one", ExtentColor.GREEN));
        
        try
        {
        	int a=10/0;
        	
        }catch(Throwable t)
        
        {
        	//test.fail(e);
        	
        	test.fail(t);
        }

        // 5. Flush the report
        extent.flush();

        // 6. Open the report in the default browser (optional)
        try {
            Desktop.getDesktop().browse(reportFile.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
