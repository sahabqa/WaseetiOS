package screensObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SearchResultScreen {

	public SearchResultScreen(IOSDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell)[1]")
	public IOSElement FirstPost;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell)[2]")
	public IOSElement SecondPost;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell)[3]")
	public IOSElement ThirdPost;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell)[4]")
	public IOSElement ForthPost;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell)[5]")
	public IOSElement FifthPost;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell)[6]")
	public IOSElement SixthPost;

}