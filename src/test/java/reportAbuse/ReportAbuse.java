package reportAbuse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import base.CapsFile;
import base.CustomSteps;

import screensObjects.CountrySelectionScreen;
import screensObjects.HomeScreen;
import screensObjects.LoginScreen;
import screensObjects.MoreScreen;
import screensObjects.PostDetailsScreen;
import screensObjects.SearchResultScreen;

public class ReportAbuse extends CapsFile {

	CustomSteps customStep = new CustomSteps();
	String randomString = customStep.randomString();

	@Test
	public void PostReportAbuse() throws IOException, InterruptedException {

		FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
		Properties p = new Properties();
		p.load(reader);

		HomeScreen HomePage = new HomeScreen(driver);
		MoreScreen More = new MoreScreen(driver);
		LoginScreen Login = new LoginScreen(driver);
		CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
		PostDetailsScreen PostDetails = new PostDetailsScreen(driver);
		SearchResultScreen SearchResult = new SearchResultScreen(driver);

		CountrySelection.Allow.click();
		CountrySelection.AllCities.click();

		// Login Scenario

		HomePage.MoreButton.click();
		More.LoginButton.click();
		Login.LoginButton.click();
		Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
		Login.PhoneNumberField.sendKeys(p.getProperty("AutomationAccountPhoneNumber"));
		Login.PasswordField.sendKeys(p.getProperty("AutomationAccountPassword"));
		Login.LoginButton2.click();

		// Report Abuse scenario

		customStep.idVisibilityStep(HomePage.CarsCategory, 20);
		HomePage.RecentsCategories.click();

		customStep.xpathVisibilityStep(SearchResult.FirstPost, 10);
		SearchResult.FirstPost.click();
		customStep.idVisibilityStep(PostDetails.PostCloseButton, 5);
		customStep.Scroll();

		customStep.ReportAbuseCheck();

		PostDetails.ReportAbuseButton.click();
		PostDetails.Reason1.click();
		PostDetails.ReportAbuseSendButton.click();
		customStep.idVisibilityStep(PostDetails.PostCloseButton, 5);
		customStep.Scroll();

		customStep.idVisibilityStep(PostDetails.AlreadyReported, 5);
		assertTrue(PostDetails.AlreadyReported.isDisplayed());
	}
}