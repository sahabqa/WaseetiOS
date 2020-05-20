package screensObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CarsCategoryScreen {

	public CarsCategoryScreen(IOSDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	// Main

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='أوروبية'])[1]")
	public IOSElement European;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='أمريكية'])[1]")
	public IOSElement American;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='يابانية'])[1]")
	public IOSElement Japanese;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='كورية'])[1]")
	public IOSElement Korean;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='صينية'])[1]")
	public IOSElement Chinese;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='كلاسيكية'])[1]")
	public IOSElement Classic;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='مطلوب سيارات'])[1]")
	public IOSElement CarsWanted;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='أنواع أخرى'])[1]")
	public IOSElement OtherTypes;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='الكل / الأحدث'])[1]")
	public IOSElement RecentMain;

	@iOSXCUITFindBy(accessibility = "تعديل")
	public IOSElement EditButton;

	// American

	@iOSXCUITFindBy(accessibility = "شيفرولية")
	public IOSElement Chevrolette;

	@iOSXCUITFindBy(accessibility = "جي إم سي")
	public IOSElement GMC;

	@iOSXCUITFindBy(accessibility = "فورد")
	public IOSElement Ford;

	@iOSXCUITFindBy(accessibility = "لينكولن")
	public IOSElement Lincoln;

	@iOSXCUITFindBy(accessibility = "كاديلاك")
	public IOSElement Cadillac;

	@iOSXCUITFindBy(accessibility = "كرايزلر")
	public IOSElement Chrysler;

	@iOSXCUITFindBy(accessibility = "دودج")
	public IOSElement Dodge;

	@iOSXCUITFindBy(accessibility = "الكل / الأحدث")
	public IOSElement RecentAmerican;

	// European

	@iOSXCUITFindBy(accessibility = "مرسيدس")
	public IOSElement Mercedes;

	@iOSXCUITFindBy(accessibility = "بي إم دبليو")
	public IOSElement BMW;

	@iOSXCUITFindBy(accessibility = "بورش")
	public IOSElement Porsche;

	@iOSXCUITFindBy(accessibility = "اودي")
	public IOSElement Audi;

	@iOSXCUITFindBy(accessibility = "فولكس واجن")
	public IOSElement Volkswagen;

	@iOSXCUITFindBy(accessibility = "لاندروفر")
	public IOSElement Landrover;

	@iOSXCUITFindBy(accessibility = "رولز رويس")
	public IOSElement RollsRoyce;
	
	@iOSXCUITFindBy(accessibility = "جاكوار")
	public IOSElement Jaguar;
	
	@iOSXCUITFindBy(accessibility = "بنتلي")
	public IOSElement Bentli;
	
	@iOSXCUITFindBy(accessibility = "استون مارتن")
	public IOSElement AstonMartin;
	
	@iOSXCUITFindBy(accessibility = "لامبرجيني")
	public IOSElement Lamborghini;
	
	@iOSXCUITFindBy(accessibility = "فيراري")
	public IOSElement Ferrari;
	
	@iOSXCUITFindBy(accessibility = "مازيراتي")
	public IOSElement Mazeratti;
	
	@iOSXCUITFindBy(accessibility = "ميني")
	public IOSElement Mini;
	
	@iOSXCUITFindBy(accessibility = "رينو")
	public IOSElement Renault;

	@iOSXCUITFindBy(accessibility = "الكل / الأحدث")
	public IOSElement RecentEuropean;

}