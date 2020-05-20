package screensObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class RealEstatesCategoryScreen {

	public RealEstatesCategoryScreen(IOSDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	// Main

	@iOSXCUITFindBy(accessibility = "سكني واستثماري")
	public IOSElement ResidentialAndinvestment;

	@iOSXCUITFindBy(accessibility = "تجاري وصناعي")
	public IOSElement CommercialAndIndustrial;

	@iOSXCUITFindBy(accessibility = "إستراحات وشاليهات")
	public IOSElement RestHousesAndChalets;

	// American

	// European

}