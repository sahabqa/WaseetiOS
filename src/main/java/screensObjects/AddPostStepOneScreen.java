package screensObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddPostStepOneScreen {

	public AddPostStepOneScreen(IOSDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton)[2]")
	public IOSElement ChooseSectionButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='التالي']")
	public IOSElement NextButton;

	@iOSXCUITFindBy(accessibility = "Done")
	public IOSElement DoneButton;

	@iOSXCUITFindBy(accessibility = "الوصف")
	public IOSElement DescriptionLabel;

	@iOSXCUITFindBy(className = "XCUIElementTypeTextField")
	public IOSElement Title;

	@iOSXCUITFindBy(className = "XCUIElementTypeTextView")
	public IOSElement Description;

	@iOSXCUITFindBy(accessibility = "تم")
	public IOSElement DescriptionDone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DeleteImage']")
	public IOSElement DeleteImageButton;


}