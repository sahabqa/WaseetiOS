package screensObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddPostStepTwoScreen {

	public AddPostStepTwoScreen(IOSDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@iOSXCUITFindBy(accessibility = "أضف إعلان")
	public IOSElement AddPostButton;

	@iOSXCUITFindBy(accessibility = "نوع السيارة")
	public IOSElement CarTypeDrop;

	@iOSXCUITFindBy(className = "XCUIElementTypePickerWheel")
	public IOSElement CarTypePicker;

	@iOSXCUITFindBy(accessibility = "لون السيارة")
	public IOSElement CarColorDrop;

	@iOSXCUITFindBy(className = "XCUIElementTypePickerWheel")
	public IOSElement CarColorPicker;

	@iOSXCUITFindBy(accessibility = "سنة الصنع")
	public IOSElement ManufacturingYearDrop;

	@iOSXCUITFindBy(className = "XCUIElementTypePickerWheel")
	public IOSElement ManufacturingYearPicker;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[1]")
	public IOSElement PriceField;

	@iOSXCUITFindBy(accessibility = "متابعة")
	public IOSElement ContinueButton;

	@iOSXCUITFindBy(accessibility = "تم")
	public IOSElement DonePostAddButton;

	@iOSXCUITFindBy(accessibility = "PhoneArrow")
	public IOSElement CountryCodeDropDown;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
	public IOSElement PhoneNumberField;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[3]")
	public IOSElement RealEstatesPostPhoneNumberField;

	@iOSXCUITFindBy(accessibility = "تمت إضافة الإعلان بنجاح")
	public IOSElement PostAddedSuccessfullyMessage;

	@iOSXCUITFindBy(accessibility = "تم تعديل الإعلان بنجاح")
	public IOSElement PostEditedSuccessfullyMessage;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
	public IOSElement Size;

}