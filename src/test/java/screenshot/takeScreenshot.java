package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class takeScreenshot {
	public String takeScreenshot(String testName, WebDriver driver) {

	    String path = System.getProperty("user.dir") + "/Screenshots/" + testName + ".png";

	    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File(path);

	    dest.getParentFile().mkdirs();

	    try {
	        FileUtils.copyFile(src, dest);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return path;
	}
}