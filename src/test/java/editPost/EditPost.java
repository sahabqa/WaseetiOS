package editPost;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import base.CapsFile;
import base.CustomSteps;
import screensObjects.AddImagesScreen;
import screensObjects.AddPostStepOneScreen;
import screensObjects.AddPostStepTwoScreen;
import screensObjects.Commons;
import screensObjects.CountrySelectionScreen;
import screensObjects.HomeScreen;
import screensObjects.LoginScreen;
import screensObjects.MoreScreen;
import screensObjects.MyAdsScreen;

public class EditPost extends CapsFile {

	CustomSteps customStep = new CustomSteps();
	String randomString = customStep.randomString();

	@Test
	public void EditCarPost() throws IOException, InterruptedException {

		FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
		Properties p = new Properties();
		p.load(reader);

		HomeScreen HomePage = new HomeScreen(driver);
		MoreScreen More = new MoreScreen(driver);
		LoginScreen Login = new LoginScreen(driver);

		CustomSteps customStep = new CustomSteps();
		CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
		AddPostStepOneScreen AddPostStepOne = new AddPostStepOneScreen(driver);
		AddPostStepTwoScreen AddPostStepTwo = new AddPostStepTwoScreen(driver);
		MyAdsScreen MyAds = new MyAdsScreen(driver);
		AddImagesScreen AddImages = new AddImagesScreen(driver);
		Commons common = new Commons(driver);

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

		customStep.idVisibilityStep(HomePage.MyAdsButton, 10);
		HomePage.MyAdsButton.click();

		customStep.xpathVisibilityStep(MyAds.MyRecentPost, 10);
		MyAds.RecentPostSettingsButton.click();
		MyAds.EditButton.click();

		customStep.xpathVisibilityStep(AddPostStepOne.DeleteImageButton, 10);
		AddPostStepOne.DeleteImageButton.click();

		AddImages.ImagesDrawer.click();
		AddImages.ImagesLibrary.click();
		customStep.idVisibilityStep(common.promptOkButton, 5);
		common.promptOkButton.click();
		AddImages.Recent.click();
		customStep.idVisibilityStep(AddImages.RecentsLabel, 5);
		AddImages.FirstImage.click();
		AddImages.SecondImage.click();
		AddImages.ThirdImage.click();
		AddImages.ImageDoneButton.click();
		AddImages.UploadButton.click();

		AddPostStepOne.Title.clear();
		AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("EditedArabicCarTitle"));
		AddPostStepOne.Description.clear();
		AddPostStepOne.Description.sendKeys(randomString + " " + p.getProperty("Description"));
		AddPostStepOne.DescriptionDone.click();
		AddPostStepOne.NextButton.click();

		AddPostStepTwo.CarTypeDrop.click();
		AddPostStepTwo.CarTypePicker.sendKeys(customStep.RandomCarType());
		AddPostStepTwo.CarColorDrop.click();
		AddPostStepTwo.CarColorPicker.sendKeys(customStep.RandomColor());
		AddPostStepTwo.ManufacturingYearDrop.click();
		AddPostStepTwo.ManufacturingYearPicker.sendKeys(customStep.RandomYear());
		AddPostStepTwo.PriceField.sendKeys(customStep.RandomPrice());

		AddPostStepTwo.ContinueButton.click();
		customStep.idVisibilityStep(AddPostStepTwo.DonePostAddButton, 15);
		AddPostStepTwo.DonePostAddButton.click();

		driver.closeApp();

	}

}
