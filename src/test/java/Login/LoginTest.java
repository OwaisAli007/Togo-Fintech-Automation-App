package Login;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.PageObjects;
import pages.Login.LoginPage;

import java.io.IOException;

public class LoginTest extends PageObjects {

//    private ExtentReport report;
//    @BeforeSuite
//    public void setup() {
//        report = new ExtentReport();
//    }
//

//    public String pageMethod(String info) {
//        String result = "";
//        if (info.equalsIgnoreCase("Pass")) {
//            result = "Pass, Working.";
//        } else if (info.equalsIgnoreCase("Fail")) {
//            result = "Fail, Not Working.";
//        }
//        return result;
//    }


    @Test(priority = 1, enabled = true)
    public void tapOnContinue() throws IOException {

        extentReport.createTest("When User launched the App the continue button Should be clickable", "continue button, click Test");
        String result = login.tapOnContinue();
        captureScreenshot("Splash Icon Visibility Test");
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }


    @Test(priority = 2, enabled = true)
    public void insertNumber() throws IOException {

        extentReport.createTest("After continue button User Should enter the Country number", "Country number, click Test");
        String result = login.insertNumber();
        // Capture a screenshot after checking the Splash Icon visibility
        captureScreenshot("Country Number clickable Test");
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }


    @Test(priority = 3, enabled = true)
    public void continueButton() throws IOException {

        extentReport.createTest("After Country Number User Should click on the Continue Button", "Continue Button, click Test");
        String result = login.continueButton();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 4, enabled = true)
    public void insertPIN() throws IOException {

        extentReport.createTest("After Continue Button User Should be able to enter the insert pin", "Insert PIN, Click Test");
        String result = login.insertPIN();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 5, enabled = true)
    public void seConnecterButton() throws IOException {

        extentReport.createTest("After entering the PIN User Should click on the Continue Button", "Continue Button, ClickTest");
        String result = login.seConnecterButton();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 6, enabled = true)
    public void tapOnSauterButtton() throws IOException {

        extentReport.createTest("After Continue Button User should click on the Skip Button", "Skip Button, Click Test");
        String result = login.tapOnSauterButtton();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 7, enabled = true)
    public void dashboardVisible() throws IOException {

        extentReport.createTest("After Skip Button User Should be able to see the Dashboard", "Dashboard, Visibility Test");
        String result = login.dashboardVisible();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }





























}