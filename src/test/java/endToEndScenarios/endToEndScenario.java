package endToEndScenarios;

import base.CapsFile;
import base.CustomSteps;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screensObjects.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class endToEndScenario extends CapsFile {

    CustomSteps customStep = new CustomSteps();
    String randomString = customStep.randomString();

    @AfterMethod
    public void resetApp() {

        driver.resetApp();

    }

    @Test
    public void endToEndScenario() throws IOException, InterruptedException {

        FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
        Properties p = new Properties();
        p.load(reader);

        HomeScreen HomePage = new HomeScreen(driver);
        MoreScreen More = new MoreScreen(driver);
        LoginScreen Login = new LoginScreen(driver);
        CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
        AddPostStepOneScreen AddPostStepOne = new AddPostStepOneScreen(driver);
        AddPostStepTwoScreen AddPostStepTwo = new AddPostStepTwoScreen(driver);
        ChooseSectionScreen ChooseSection = new ChooseSectionScreen(driver);
        AddImagesScreen AddImages = new AddImagesScreen(driver);
        Commons common = new Commons(driver);
        MyAdsScreen MyAds = new MyAdsScreen(driver);
        SearchResultScreen SearchResult = new SearchResultScreen(driver);
        PostDetailsScreen PostDetails = new PostDetailsScreen(driver);

		////////////////////////////////////////////////////// Login Scenario //////////////////////////////////////////////////////

        CountrySelection.Allow.click();
        CountrySelection.AllCities.click();
        HomePage.MoreButton.click();
        More.LoginButton.click();
        Login.LoginButton.click();
        Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
        Login.PhoneNumberField.sendKeys(p.getProperty("PhoneNumber"));
        Login.PasswordField.sendKeys(p.getProperty("Password"));
        Login.LoginButton2.click();

		////////////////////////////////////////////////////// Add Post //////////////////////////////////////////////////////

        customStep.idVisibilityStep(HomePage.AddPostButton, 10);
        HomePage.AddPostButton.click();
        customStep.idVisibilityStep(AddPostStepOne.NextButton, 5);
        AddPostStepOne.ChooseSectionButton.click();

        ChooseSection.Cars.click();
        ChooseSection.TheCars.click();
        ChooseSection.American.click();
        ChooseSection.GMC.click();
        ChooseSection.Safari.click();

        customStep.xpathVisibilityStep(AddImages.ImagesDrawer, 5);
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

        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicCarTitle"));
        AddPostStepOne.DoneButton.click();

        AddPostStepOne.NextButton.click();
        AddPostStepTwo.CarTypeDrop.click();
        AddPostStepTwo.CarTypePicker.sendKeys(customStep.RandomCarType());
        AddPostStepTwo.CarColorDrop.click();
        AddPostStepTwo.CarColorPicker.sendKeys(customStep.RandomColor());
        AddPostStepTwo.ManufacturingYearDrop.click();
        AddPostStepTwo.ManufacturingYearPicker.sendKeys(customStep.RandomYear());
        AddPostStepTwo.PriceField.sendKeys(customStep.RandomPrice());
        AddPostStepTwo.CountryCodeDropDown.click();
        Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
        AddPostStepTwo.PhoneNumberField.clear();
        AddPostStepTwo.PhoneNumberField.sendKeys(p.getProperty("PhoneNumber"));
        AddPostStepTwo.ContinueButton.click();

        customStep.idVisibilityStep(AddPostStepTwo.DonePostAddButton, 15);
        AddPostStepTwo.DonePostAddButton.click();

		////////////////////////////////////////////////////// Edit Post Scenario //////////////////////////////////////////////////////

        customStep.idVisibilityStep(MyAds.MyRecentPost, 15);
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

        customStep.idVisibilityStep(AddPostStepTwo.PostEditedSuccessfullyMessage, 15);

        AddPostStepTwo.DonePostAddButton.click();

        ////////////////////////////////////////////////////// Delete Post scenario //////////////////////////////////////////////////////

        customStep.xpathVisibilityStep(MyAds.MyRecentPost, 5);
        final String expectedTitle = MyAds.MyRecentPostTitle.getText();

        MyAds.RecentPostSettingsButton.click();
        MyAds.DeleteButton.click();

        Thread.sleep(10000);
        customStep.xpathVisibilityStep(MyAds.MyRecentPost, 5);

		////////////////////////////////////////////////////// Report Abuse Scenario //////////////////////////////////////////////////////

        HomePage.HomeScreenButton.click();
        HomePage.RecentsCategories.click();

        customStep.xpathVisibilityStep(SearchResult.FirstPost, 10);
        SearchResult.FirstPost.click();
        customStep.idVisibilityStep(PostDetails.PostCloseButton, 5);
        customStep.Scroll();

        customStep.ReportAbuseCheck();

        PostDetails.ReportAbuseButton.click();
        PostDetails.Reason1.click();
        PostDetails.ReportAbuseSendButton.click();
        PostDetails.PostCloseButton.click();

		////////////////////////////////////////////////////// Add to Favorites Scenario ///////////////////////////////////////////////////

		customStep.xpathVisibilityStep(SearchResult.FirstPost, 10);
		SearchResult.FirstPost.click();
		customStep.idVisibilityStep(PostDetails.FavoriteButton, 10);
		PostDetails.FavoriteButton.click();




    }

    @Test(priority = 5)
    public void SearchPostResults() throws IOException, InterruptedException {

        HomeScreen HomePage = new HomeScreen(driver);
        CustomSteps customStep = new CustomSteps();
        CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
        SearchScreen Search = new SearchScreen(driver);
        SearchResultScreen SearchResult = new SearchResultScreen(driver);

        FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
        Properties p = new Properties();
        p.load(reader);

        CountrySelection.Allow.click();
        CountrySelection.AllCities.click();

        // Search button click

        HomePage.SearchButton.click();
        Search.SearchField.click();
        Search.SearchField.sendKeys(p.getProperty("CarsSearchKey"));
        Search.SearchKeypadButton.click();

        customStep.xpathVisibilityStep(SearchResult.FirstPost, 10);
        Assert.assertTrue(SearchResult.FirstPost.isDisplayed());

    }

    @Test(priority = 7)
    public void LogoutFromApp() throws IOException, InterruptedException {

        FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
        Properties p = new Properties();
        p.load(reader);

        CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
        HomeScreen HomePage = new HomeScreen(driver);
        MoreScreen More = new MoreScreen(driver);
        LoginScreen Login = new LoginScreen(driver);

        // Login Scenario

        CountrySelection.Allow.click();
        CountrySelection.AllCities.click();
        HomePage.MoreButton.click();
        More.LoginButton.click();
        Login.LoginButton.click();
        Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
        Login.PhoneNumberField.sendKeys(p.getProperty("PhoneNumber"));
        Login.PasswordField.sendKeys(p.getProperty("Password"));
        Login.LoginButton2.click();

        // Logout Scenario

        customStep.idVisibilityStep(HomePage.AddPostButton, 10);
        HomePage.MoreButton.click();
        customStep.Scroll();

        More.LogoutButton.click();
        More.LogoutConfirmationYesButton.click();
        customStep.idVisibilityStep(More.LoginButton, 5);

        Assert.assertTrue(More.LoginButton.isDisplayed());

    }

}