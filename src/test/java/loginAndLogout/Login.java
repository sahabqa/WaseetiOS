package loginAndLogout;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import base.CustomSteps;
import org.testng.annotations.Test;

import base.CapsFile;
import screensObjects.CountrySelectionScreen;
import screensObjects.HomeScreen;
import screensObjects.LoginScreen;
import screensObjects.MoreScreen;

public class Login extends CapsFile {

	@Test
	public void LoginWithValidCredentials() throws IOException, InterruptedException {

		CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
		HomeScreen HomePage = new HomeScreen(driver);
		MoreScreen More = new MoreScreen(driver);
		LoginScreen Login = new LoginScreen(driver);
		CustomSteps cs = new CustomSteps();

		CountrySelection.Allow.click();
		CountrySelection.AllCities.click();
		HomePage.MoreButton.click();
		More.LoginButton.click();
		Login.LoginButton.click();
		Login.CountryPickerWheel.sendKeys(cs.dataReader("Jordan"));
		Login.PhoneNumberField.sendKeys(cs.dataReader("PhoneNumber"));
		Login.PasswordField.sendKeys(cs.dataReader("Password"));
		Login.LoginButton2.click();

	}

	@Test(enabled = false)
	public void LoginWithInvalidCredentials() throws IOException, InterruptedException {

		FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
		Properties p = new Properties();
		p.load(reader);

		CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
		HomeScreen HomePage = new HomeScreen(driver);
		MoreScreen More = new MoreScreen(driver);
		LoginScreen Login = new LoginScreen(driver);

		CountrySelection.Allow.click();
		CountrySelection.AllCities.click();
		HomePage.MoreButton.click();
		More.LoginButton.click();
		Login.LoginButton.click();
		Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
		Login.PhoneNumberField.sendKeys(p.getProperty("PhoneNumber"));
		Login.PasswordField.sendKeys("1234556");
		Login.LoginButton2.click();

	}

}