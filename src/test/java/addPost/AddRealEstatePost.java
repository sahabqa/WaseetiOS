package addPost;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import base.CapsFile;
import base.CustomSteps;
import screensObjects.AddImagesScreen;
import screensObjects.AddPostStepOneScreen;
import screensObjects.AddPostStepTwoScreen;
import screensObjects.ChooseSectionScreen;
import screensObjects.Commons;
import screensObjects.CountrySelectionScreen;
import screensObjects.HomeScreen;
import screensObjects.LoginScreen;
import screensObjects.MoreScreen;

public class AddRealEstatePost extends CapsFile {

    @AfterMethod
    public void resetApp() {

        driver.resetApp();

    }

    CustomSteps customStep = new CustomSteps();
    String randomString = customStep.randomString();

    @Test(enabled = false)
    public void AddHouseAndVillasPostWithImages() throws IOException, InterruptedException {

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
        ChooseSectionScreen ChooseSection = new ChooseSectionScreen(driver);
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

        // Add button click

        customStep.idVisibilityStep(HomePage.AddPostButton, 10);
        HomePage.AddPostButton.click();
        customStep.idVisibilityStep(AddPostStepOne.NextButton, 5);
        AddPostStepOne.ChooseSectionButton.click();

        // Add Real Estate Post Step ONE scenario

        ChooseSection.RealEstates.click();
        ChooseSection.RealEstateForSale.click();
        ChooseSection.Residential.click();
        ChooseSection.HouseAndVillas.click();
        ChooseSection.AlAsimah.click();
        ChooseSection.AlDesmeh.click();

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
        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicRealEstateTitle"));
        AddPostStepOne.DoneButton.click();

        // Add Real Estate Post Step TWO scenario

        AddPostStepOne.NextButton.click();
        AddPostStepTwo.PriceField.sendKeys(customStep.RandomPrice());
        AddPostStepTwo.Size.sendKeys(customStep.RandomSize());
        AddPostStepTwo.CountryCodeDropDown.click();
        Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
        AddPostStepTwo.RealEstatesPostPhoneNumberField.clear();
        AddPostStepTwo.RealEstatesPostPhoneNumberField.sendKeys(p.getProperty("PhoneNumber"));
        AddPostStepTwo.ContinueButton.click();

        customStep.idVisibilityStep(AddPostStepTwo.DonePostAddButton, 15);
        assertTrue(AddPostStepTwo.PostAddedSuccessfullyMessage.isDisplayed());

//		driver.resetApp();

    }

    @Test
    public void AddHouseAndVillasPostWithoutImages() throws IOException, InterruptedException {

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
        ChooseSectionScreen ChooseSection = new ChooseSectionScreen(driver);
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

        // Add button click

        customStep.idVisibilityStep(HomePage.AddPostButton, 10);
        HomePage.AddPostButton.click();
        customStep.idVisibilityStep(AddPostStepOne.NextButton, 5);
        AddPostStepOne.ChooseSectionButton.click();

        // Add Real Estate Post Step ONE scenario

        ChooseSection.RealEstates.click();
        ChooseSection.RealEstateForSale.click();
        ChooseSection.Residential.click();
        ChooseSection.HouseAndVillas.click();
        ChooseSection.AlAsimah.click();
        ChooseSection.AlDesmeh.click();

        customStep.xpathVisibilityStep(AddImages.ImagesDrawer, 5);
        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicRealEstateTitle"));
        AddPostStepOne.DoneButton.click();

        // Add Real Estate Post Step TWO scenario

        AddPostStepOne.NextButton.click();
        AddPostStepTwo.PriceField.sendKeys(customStep.RandomPrice());
        AddPostStepTwo.Size.sendKeys(customStep.RandomSize());
        AddPostStepTwo.CountryCodeDropDown.click();
        Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
        AddPostStepTwo.RealEstatesPostPhoneNumberField.clear();
        AddPostStepTwo.RealEstatesPostPhoneNumberField.sendKeys(p.getProperty("PhoneNumber"));
        AddPostStepTwo.ContinueButton.click();

        customStep.idVisibilityStep(AddPostStepTwo.DonePostAddButton, 15);
        assertTrue(AddPostStepTwo.PostAddedSuccessfullyMessage.isDisplayed());

//		driver.resetApp();

    }

}
