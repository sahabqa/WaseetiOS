package base;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class CapsFile {

	public static IOSDriver<IOSElement> driver;

	public static IOSDriver<IOSElement> capabilities() throws IOException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

//		iOS App Path
		File appDir = new File("src");
		File app = new File(appDir, "WaseetApr20.app");

//		String device = System.getProperty("deviceName");

		capabilities.setCapability("newCommandTimeout", 100000);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone8");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.2");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
		capabilities.setCapability("clearSystemFiles", true);

		driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		return driver;
	}

}