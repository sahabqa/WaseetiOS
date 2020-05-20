package screensObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CountrySelectionScreen {

    public CountrySelectionScreen(IOSDriver<?> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @iOSXCUITFindBy(accessibility = "Allow")
    public IOSElement Allow;

    @iOSXCUITFindBy(accessibility = "Don’t Allow")
    public IOSElement DontAllow;

    @iOSXCUITFindBy(accessibility = "جميع المدن")
    public IOSElement AllCities;

}