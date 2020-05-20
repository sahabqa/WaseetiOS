package screensObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginScreen {

	public LoginScreen(IOSDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='ic arrow phone'])[2]")
	public IOSElement LoginButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel[@value='965+ الكويت']")
	public IOSElement Kuwait;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel[@value='962+ الأردن']")
	public IOSElement Jordan;

	@iOSXCUITFindBy(className = "XCUIElementTypePickerWheel")
	public IOSElement CountryPickerWheel;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='تم']")
	public IOSElement PickerDoneButton;

	@iOSXCUITFindBy(className = "XCUIElementTypeTextField")
	public IOSElement PhoneNumberField;

	@iOSXCUITFindBy(className = "XCUIElementTypeSecureTextField")
	public IOSElement PasswordField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='تسجيل الدخول']")
	public IOSElement LoginButton2;

//	(//XCUIElementTypeButton[@name='ic arrow phone'])[2]

//			findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");

}