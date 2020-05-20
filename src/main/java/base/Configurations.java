package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import base.CapsFile;
import helpers.ServerChecker;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Configurations extends CapsFile {

	@BeforeSuite
	public void configurations() throws IOException, InterruptedException {

		ServerChecker.serverChecker();
		ServerChecker.service.start();

		IOSDriver<IOSElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void closeServer() throws IOException, InterruptedException {

		ServerChecker.service.stop();

	}

}