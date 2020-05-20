package screensObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MyAdsScreen {

	public MyAdsScreen(IOSDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton)[1]")
	public IOSElement RecentPostSettingsButton;

	@iOSXCUITFindBy(accessibility = "تعديل")
	public IOSElement EditButton;

	@iOSXCUITFindBy(accessibility = "إلغاء النشر")
	public IOSElement UnpublishButton;

	@iOSXCUITFindBy(accessibility = "حذف")
	public IOSElement DeleteButton;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell)[1]")
	public IOSElement MyRecentPost;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText)[5]")
	public IOSElement MyRecentPostTitle;

}