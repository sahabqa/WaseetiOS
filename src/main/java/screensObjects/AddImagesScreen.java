package screensObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddImagesScreen {

	public AddImagesScreen(IOSDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Recents']")
	public IOSElement RecentsLabel;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther)[9]")
	public IOSElement ImagesDrawer;

	@iOSXCUITFindBy(accessibility = "أخذ صورة")
	public IOSElement TakePicture;

	@iOSXCUITFindBy(accessibility = "مكتبة الصور")
	public IOSElement ImagesLibrary;

	@iOSXCUITFindBy(accessibility = "Recents")
	public IOSElement Recent;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell)[1]")
	public IOSElement FirstImage;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell)[2]")
	public IOSElement SecondImage;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell)[3]")
	public IOSElement ThirdImage;

	@iOSXCUITFindBy(accessibility = "Done")
	public IOSElement ImageDoneButton;

	@iOSXCUITFindBy(accessibility = "تحميل")
	public IOSElement UploadButton;

}