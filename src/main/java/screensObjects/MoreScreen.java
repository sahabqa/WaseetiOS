package screensObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MoreScreen {

    public MoreScreen(IOSDriver<?> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @iOSXCUITFindBy(accessibility = "تسجيل الدخول")
    public IOSElement LoginButton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell)[8]")
    public IOSElement LogoutButton;

    @iOSXCUITFindBy(accessibility = "نعم")
    public IOSElement LogoutConfirmationYesButton;

    @iOSXCUITFindBy(accessibility = "لا")
    public IOSElement LogoutConfirmationNoButton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell)[3]")
    public IOSElement MyFavoritesButton;


}