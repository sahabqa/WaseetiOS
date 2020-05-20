package delete;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.CapsFile;
import base.CustomSteps;
import screensObjects.CountrySelectionScreen;
import screensObjects.HomeScreen;
import screensObjects.LoginScreen;
import screensObjects.MoreScreen;
import screensObjects.MyAdsScreen;

public class DeletePost extends CapsFile {

	CustomSteps customStep = new CustomSteps();
	String randomString = customStep.randomString();

	@Test
	public void DeleteFirstPost() throws IOException, InterruptedException {

		FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
		Properties p = new Properties();
		p.load(reader);

		HomeScreen HomePage = new HomeScreen(driver);
		MoreScreen More = new MoreScreen(driver);
		LoginScreen Login = new LoginScreen(driver);
		CustomSteps customStep = new CustomSteps();
		CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
		MyAdsScreen MyAds = new MyAdsScreen(driver);

		CountrySelection.Allow.click();
		CountrySelection.AllCities.click();

		// Login Scenario

		HomePage.MoreButton.click();
		More.LoginButton.click();
		Login.LoginButton.click();
		Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
		Login.PhoneNumberField.sendKeys(p.getProperty("PhoneNumber"));
		Login.PasswordField.sendKeys(p.getProperty("Password"));
		Login.LoginButton2.click();

		// Delete Scenario

		customStep.idVisibilityStep(HomePage.MyAdsButton, 10);
		HomePage.MyAdsButton.click();

		customStep.xpathVisibilityStep(MyAds.MyRecentPost, 10);
		String expectedTitle = MyAds.MyRecentPostTitle.getText();

		MyAds.RecentPostSettingsButton.click();
		MyAds.DeleteButton.click();

		customStep.xpathVisibilityStep(MyAds.MyRecentPost, 15);
		
		// Assertion on Strings
		
		Assert.assertNotEquals(expectedTitle, MyAds.MyRecentPostTitle.getText());

	}

}
