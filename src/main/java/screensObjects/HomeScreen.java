package screensObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomeScreen {

	public HomeScreen(IOSDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	// Main Sections Buttons

	@iOSXCUITFindBy(accessibility = "أضف إعلان")
	public IOSElement AddPostButton;

	@iOSXCUITFindBy(accessibility = "المزيد")
	public IOSElement MoreButton;

	@iOSXCUITFindBy(accessibility = "إعلاناتي")
	public IOSElement MyAdsButton;
	
	@iOSXCUITFindBy(accessibility = "البحث")
	public IOSElement SearchButton;
	
	@iOSXCUITFindBy(accessibility = "الرئيسية")
	public IOSElement HomeScreenButton;

	// Categories

	@iOSXCUITFindBy(accessibility = "عقارات")
	public IOSElement RealEstatesCategory;

	@iOSXCUITFindBy(accessibility = "سيارات")
	public IOSElement CarsCategory;

	@iOSXCUITFindBy(accessibility = "خدمات")
	public IOSElement ServicesCategory;

	@iOSXCUITFindBy(accessibility = "الكل / الأحدث")
	public IOSElement RecentsCategories;

	@iOSXCUITFindBy(accessibility = "حرف ومقاولات")
	public IOSElement ContractingCraftsCategories;

}