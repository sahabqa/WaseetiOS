package helpers;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.*;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporterNG implements IReporter {

    private ExtentReports extent;
    ExtentHtmlReporter htmlReporter;

    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

        htmlReporter = new ExtentHtmlReporter(
                System.getProperty("user.dir") + "/src/main/java/runReports/WaseetiOSRunReport.html");
        htmlReporter.loadXMLConfig(
                System.getProperty("user.dir") + "/src/main/java/helpers/extent-config.xml");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);


        // ------------------------------------------------ SparkReporter ------------------------------------------------------------

//        extent.setReportUsesManualConfiguration(true);
//
//        ExtentSparkReporter sparkReporter;
//        sparkReporter = new ExtentSparkReporter(
//                System.getProperty("user.dir") + "/src/main/java/runReports/WaseetiOSRunReport.html");
//        sparkReporter.config().setTheme(com.aventstack.extentreports.reporter.configuration.Theme.DARK);
//        sparkReporter.loadConfig("/Users/imranmoqbel/Desktop/extent-config.xml");
//        extent.attachReporter(sparkReporter);


        for (ISuite suite : suites) {
            Map<String, ISuiteResult> result = suite.getResults();

            for (ISuiteResult r : result.values()) {
                ITestContext context = r.getTestContext();

                buildTestNodes(context.getPassedTests(), Status.PASS);
                buildTestNodes(context.getFailedTests(), Status.FAIL);
                buildTestNodes(context.getSkippedTests(), Status.SKIP);
//                buildTestNodes(context.getPassedConfigurations(), Status.PASS);
//                buildTestNodes(context.getFailedConfigurations(), Status.FAIL);

            }
        }

        for (String s : Reporter.getOutput()) {
            extent.setTestRunnerOutput(s);
        }

        extent.flush();

    }

    private void buildTestNodes(IResultMap tests, Status status) {

        ExtentTest test;

        if (tests.size() > 0) {
            for (ITestResult result : tests.getAllResults()) {
                test = extent.createTest(result.getMethod().getMethodName());

                for (String group : result.getMethod().getGroups())
                    test.assignCategory(group);

                String message = "Test " + status.toString().toLowerCase() + "ed";

                if (result.getThrowable() != null)
                    message = result.getThrowable().getMessage();

                test.getModel().setStartTime(getTime(result.getStartMillis()));
                test.getModel().setEndTime(getTime(result.getEndMillis()));

                test.log(status, message);
            }
        }
    }


    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
}