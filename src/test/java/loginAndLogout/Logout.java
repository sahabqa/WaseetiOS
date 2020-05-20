package loginAndLogout;

import base.CapsFile;
import base.CustomSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import screensObjects.CountrySelectionScreen;
import screensObjects.HomeScreen;
import screensObjects.LoginScreen;
import screensObjects.MoreScreen;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Logout extends CapsFile {

    CustomSteps customSteps = new CustomSteps();

    @Test
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

        customSteps.Scroll();
        More.LogoutButton.click();
        More.LogoutConfirmationYesButton.click();
        customSteps.idVisibilityStep(More.LoginButton, 5);

        Assert.assertTrue(More.LoginButton.isDisplayed());

    }

}