package myFavorites;

import base.CapsFile;
import base.CustomSteps;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screensObjects.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyFavoritesCheck extends CapsFile {

	@AfterMethod
	public void resetApp() {

		driver.resetApp();

	}

	CustomSteps customStep = new CustomSteps();
	String randomString = customStep.randomString();

	@Test
	public void MyFavoritesCheck() throws IOException, InterruptedException {

		FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
		Properties p = new Properties();
		p.load(reader);

		HomeScreen HomePage = new HomeScreen(driver);
		MoreScreen More = new MoreScreen(driver);
		LoginScreen Login = new LoginScreen(driver);
		CustomSteps customStep = new CustomSteps();
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

		// Add to Favorites scenario

		customStep.idVisibilityStep(HomePage.CarsCategory, 10);
		HomePage.RecentsCategories.click();

		customStep.xpathVisibilityStep(SearchResult.FirstPost, 10);
		SearchResult.FirstPost.click();
		customStep.idVisibilityStep(PostDetails.PostCloseButton, 5);

		customStep.AddToFavoritesCheck();
		PostDetails.FavoriteButton.click();

		String expectedTitle = customStep.GetElementText(PostDetails.PostTitle);

		PostDetails.PostCloseButton.click();
		HomePage.MoreButton.click();
		More.MyFavoritesButton.click();

		customStep.xpathVisibilityStep(PostDetails.My1stFavoritePostNotesButton, 10);

		Assert.assertEquals(customStep.GetElementText(PostDetails.My1stFavoritePostTitle), expectedTitle);
	}
}