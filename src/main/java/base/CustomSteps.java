package base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import screensObjects.PostDetailsScreen;
import screensObjects.SearchResultScreen;

public class CustomSteps extends CapsFile {

    public void idVisibilityStep(IOSElement selector, int waitDuration) {

        WebDriverWait wait = new WebDriverWait(driver, waitDuration);
        wait.withMessage("Waiting For the element " + selector + "to appear.").until(ExpectedConditions.visibilityOf(selector));

    }

    public void xpathVisibilityStep(IOSElement selector, int waitDuration) {

        WebDriverWait wait = new WebDriverWait(driver, waitDuration);
        wait.withMessage("Waiting For the element " + selector + "to appear.").until(ExpectedConditions.visibilityOf(selector));

    }

    public String randomString() {

        String s = RandomStringUtils.randomAlphanumeric(3).toUpperCase();

        return s;

    }

    public String RandomPrice() {

        ArrayList<String> list = new ArrayList<String>();
        list.add("1000");
        list.add("1500");
        list.add("2000");
        list.add("2500");
        list.add("3000");
        list.add("3500");
        list.add("4000");
        list.add("4500");
        list.add("5000");
        list.add("5500");
        list.add("6000");
        list.add("6500");
        list.add("7000");
        list.add("7500");
        list.add("8000");
        list.add("8500");
        list.add("9000");
        list.add("10000");
        list.add("10500");
        list.add("11000");
        list.add("11500");
        list.add("12000");

        String random = list.get(new Random().nextInt(list.size()));

        return random;

    }

    public String RandomColor() {

        ArrayList<String> list = new ArrayList<String>();

        list.add("أسود");
        list.add("أزرق");
        list.add("بني");
        list.add("خمري");
        list.add("ذهبي");
        list.add("رمادي");
        list.add("أخضر");
        list.add("بنفسجي");
        list.add("أحمر");
        list.add("فضي");
        list.add("أسمر");
        list.add("أزرق مخضر");
        list.add("أبيض");
        list.add("أصفر");
        list.add("لون آخر");

        String random = list.get(new Random().nextInt(list.size()));

        return random;

    }

    public String RandomCarType() {

        ArrayList<String> list = new ArrayList<String>();
        list.add("سيارة مستعملة");
        list.add("سيارة جديدة");

        String random = list.get(new Random().nextInt(list.size()));

        return random;

    }

    public String RandomYear() {

        int randomNum1 = ThreadLocalRandom.current().nextInt(1950, 2021);

        String randomNum2 = Integer.toString(randomNum1);

        return randomNum2;

    }

    public String RandomSize() {

        ArrayList<String> list = new ArrayList<String>();
        list.add("100");
        list.add("120");
        list.add("140");
        list.add("150");
        list.add("160");
        list.add("170");
        list.add("180");
        list.add("190");
        list.add("200");
        list.add("210");
        list.add("220");
        list.add("230");
        list.add("240");
        list.add("250");
        list.add("260");
        list.add("270");
        list.add("280");
        list.add("290");
        list.add("300");

        String random = list.get(new Random().nextInt(list.size()));

        return random;

    }

    public void Scroll() {

        new TouchAction(driver).press(PointOption.point(100, 577))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(100, 207))
                .release().perform();

    }

    public void ReportAbuseCheck() {

        PostDetailsScreen PostDetails = new PostDetailsScreen(driver);
        SearchResultScreen SearchResult = new SearchResultScreen(driver);
        CustomSteps customStep = new CustomSteps();

        if (!PostDetails.ReportAbuseElement.isEmpty()) { // Check whether First post can be reported or not .. if Yes ,
            // it will go in
        } else {

            PostDetails.PostCloseButton.click();
            customStep.xpathVisibilityStep(SearchResult.SecondPost, 10);
            SearchResult.SecondPost.click();
            customStep.idVisibilityStep(PostDetails.PostTitle, 10);
            customStep.Scroll();

            if (!PostDetails.ReportAbuseElement.isEmpty()) {

            } else {

                PostDetails.PostCloseButton.click();
                customStep.xpathVisibilityStep(SearchResult.ThirdPost, 10);
                SearchResult.ThirdPost.click();
                customStep.idVisibilityStep(PostDetails.PostTitle, 10);
                customStep.Scroll();

                if (!PostDetails.ReportAbuseElement.isEmpty()) {

                } else {

                    PostDetails.PostCloseButton.click();
                    customStep.xpathVisibilityStep(SearchResult.ForthPost, 10);
                    SearchResult.ForthPost.click();
                    customStep.idVisibilityStep(PostDetails.PostTitle, 10);
                    customStep.Scroll();

                    if (!PostDetails.ReportAbuseElement.isEmpty()) {

                    } else {

                        PostDetails.PostCloseButton.click();
                        customStep.xpathVisibilityStep(SearchResult.FifthPost, 10);
                        SearchResult.FifthPost.click();
                        customStep.idVisibilityStep(PostDetails.PostTitle, 10);
                        customStep.Scroll();

                        if (!PostDetails.ReportAbuseElement.isEmpty()) {

                        } else {

                            PostDetails.PostCloseButton.click();
                            customStep.xpathVisibilityStep(SearchResult.SixthPost, 10);
                            SearchResult.SixthPost.click();
                            customStep.idVisibilityStep(PostDetails.PostTitle, 10);
                            customStep.Scroll();

                        }
                    }
                }
            }
        }

    }

    public void AddToFavoritesCheck() {

        PostDetailsScreen PostDetails = new PostDetailsScreen(driver);
        SearchResultScreen SearchResult = new SearchResultScreen(driver);
        CustomSteps customStep = new CustomSteps();

        if (!PostDetails.FavoriteElement.isEmpty()) { // Check whether First post can be reported or not .. if Yes ,
            // it will go in
        } else {

            PostDetails.PostCloseButton.click();
            customStep.xpathVisibilityStep(SearchResult.SecondPost, 10);
            SearchResult.SecondPost.click();
            customStep.idVisibilityStep(PostDetails.PostTitle, 10);

            if (!PostDetails.FavoriteElement.isEmpty()) {

            } else {

                PostDetails.PostCloseButton.click();
                customStep.xpathVisibilityStep(SearchResult.ThirdPost, 10);
                SearchResult.ThirdPost.click();
                customStep.idVisibilityStep(PostDetails.PostTitle, 10);

                if (!PostDetails.FavoriteElement.isEmpty()) {

                } else {

                    PostDetails.PostCloseButton.click();
                    customStep.xpathVisibilityStep(SearchResult.ForthPost, 10);
                    SearchResult.ForthPost.click();
                    customStep.idVisibilityStep(PostDetails.PostTitle, 10);

                    if (!PostDetails.FavoriteElement.isEmpty()) {

                    } else {

                        PostDetails.PostCloseButton.click();
                        customStep.xpathVisibilityStep(SearchResult.FifthPost, 10);
                        SearchResult.FifthPost.click();
                        customStep.idVisibilityStep(PostDetails.PostTitle, 10);

                        if (!PostDetails.FavoriteElement.isEmpty()) {

                        } else {

                            PostDetails.PostCloseButton.click();
                            customStep.xpathVisibilityStep(SearchResult.SixthPost, 10);
                            SearchResult.SixthPost.click();
                            customStep.idVisibilityStep(PostDetails.PostTitle, 10);

                        }
                    }
                }
            }
        }

    }

    public String GetElementText(IOSElement element) {

        String string = element.getText();

        return string;

    }

    public String dataReader(String value) throws IOException {

        FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
        Properties p = new Properties();
        p.load(reader);

        return p.getProperty(value);

    }

//    public void FluentWaitById(IOSElement selector, int timeOutDuration) {
//
//        Wait wait = new FluentWait(driver2)
//                .withTimeout(timeOutDuration, TimeUnit.SECONDS)
//                .pollingEvery(250, TimeUnit.MILLISECONDS)
//                .ignoring(NoSuchElementException.class)
//                .ignoring(TimeoutException.class);
//
//        wait.until(ExpectedConditions.visibilityOf(selector));
//
//    }
//
//    public void FluentWaitByXpath(IOSElement selector) {
//
//        Wait wait = new FluentWait(driver)
//                .withTimeout(10, TimeUnit.SECONDS)
//                .pollingEvery(250, TimeUnit.MILLISECONDS)
//                .ignoring(NoSuchElementException.class)
//                .ignoring(TimeoutException.class);
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.xpath(String.valueOf(selector))));
//
//    }

}