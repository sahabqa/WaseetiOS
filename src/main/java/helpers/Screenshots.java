package helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.CapsFile;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Screenshots {

	static IOSDriver<IOSElement> SsObject = CapsFile.driver;

	public static void getScreenshot(String s) throws IOException {

		File screenShot = ((TakesScreenshot) SsObject).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File(
				System.getProperty("user.dir") + "/src/main/java/runReports/failuresScreenshots/" + s + ".jpg"));

	}

}
