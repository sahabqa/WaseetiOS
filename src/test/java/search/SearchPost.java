package search;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import base.CapsFile;
import base.CustomSteps;
import screensObjects.CountrySelectionScreen;
import screensObjects.HomeScreen;
import screensObjects.SearchResultScreen;
import screensObjects.SearchScreen;

public class SearchPost extends CapsFile {

    @Test
    public void DeletePost() throws IOException, InterruptedException {

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
        assertTrue(SearchResult.FirstPost.isDisplayed());

//		driver.resetApp();

    }

}
