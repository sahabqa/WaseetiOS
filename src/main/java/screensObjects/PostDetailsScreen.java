package screensObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PostDetailsScreen {

	public PostDetailsScreen(IOSDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@iOSXCUITFindBy(accessibility = "star")
	public IOSElement FavoriteButton;

	@iOSXCUITFindBy(accessibility = "star")
	public List<WebElement> FavoriteElement;

	@iOSXCUITFindBy(accessibility = "star filled")
	public IOSElement FavoritedButton;

	@iOSXCUITFindBy(accessibility = "Share")
	public IOSElement ShareButton;

	@iOSXCUITFindBy(accessibility = "التبليغ عن الإعلان")
	public List<WebElement> ReportAbuseElement;

	@iOSXCUITFindBy(accessibility = "التبليغ عن الإعلان")
	public IOSElement ReportAbuseButton;

	@iOSXCUITFindBy(accessibility = "إرسال")
	public IOSElement ReportAbuseSendButton;

	@iOSXCUITFindBy(accessibility = "إعلان مُخل بالآداب")
	public IOSElement Reason1;

	@iOSXCUITFindBy(accessibility = "إعلان مكرر")
	public IOSElement Reason2;

	@iOSXCUITFindBy(accessibility = "إعلان في القسم الخطأ")
	public IOSElement Reason3;

	@iOSXCUITFindBy(accessibility = "رقم الهاتف غير صحيح")
	public IOSElement Reason4;

	@iOSXCUITFindBy(accessibility = "غير ذلك")
	public IOSElement OtherReason;

	@iOSXCUITFindBy(accessibility = "تم التبليغ عن الإعلان مسبقاً")
	public IOSElement AlreadyReported;

	@iOSXCUITFindBy(accessibility = "إغلاق")
	public IOSElement PostCloseButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SMS']")
	public IOSElement SMSbutton;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText)[3]")
	public IOSElement PostTitle;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText)[3]")
	public IOSElement My1stFavoritePostTitle;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton)[3]")
	public IOSElement My1stFavoritePostNotesButton;

}