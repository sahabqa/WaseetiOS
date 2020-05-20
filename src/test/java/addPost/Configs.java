package addPost;

import base.CapsFile;
import helpers.ServerChecker;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Configs extends CapsFile {

    @BeforeSuite
    public void configurations() throws IOException, InterruptedException {

        ServerChecker.serverChecker();
        ServerChecker.service.start();

        IOSDriver<IOSElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @AfterSuite
    public void closeServer() throws IOException, InterruptedException {

        ServerChecker.service.stop();

    }

}