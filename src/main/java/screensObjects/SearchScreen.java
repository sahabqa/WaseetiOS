package screensObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SearchScreen {

	public SearchScreen(IOSDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='البحث']")
	public IOSElement SearchField;

	@iOSXCUITFindBy(accessibility = "Search")
	public IOSElement SearchKeypadButton;

}