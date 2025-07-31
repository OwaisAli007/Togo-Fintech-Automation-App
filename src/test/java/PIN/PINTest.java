package PIN;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.PageObjects;

public class PINTest extends PageObjects {

    @Test(priority = 1, enabled = true)
    public void pinPageVisible() {
        extentReport.createTest("When User Proceed with the number the OTP Page should be Visible", "OTP Page");
        String result = PINPage.pinPageVisible();
        captureScreenshot("OTP Page, Visibility Test");
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }


    @Test(priority = 2, enabled = true)
    public void pinPageLogo() {

        extentReport.createTest("When User navigate to the OTP Screen the OTP Logo Should be Visible", "OTP Page Logo");
        String result = PINPage.pinPageLogo();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }


    @Test(priority = 3, enabled = true)
    public void welcomeMixxComments() {

        extentReport.createTest("When User navigate to the OTP Screen the Welcome Mixx Comments Should be Visible", "Welcome Mixx Comments");
        String result = PINPage.welcomeMixxComments();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }


    @Test(priority = 4, enabled = true)
    public void enterYourMixxPinHeading() {

        extentReport.createTest("When User navigate to the OTP Screen Enter Your Mixx Pin Heading should be Visible", "Enter Your Mixx Pin Heading");
        String result = PINPage.enterYourMixxPinHeading();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }


    @Test(priority = 5, enabled = true)
    public void pinPasswordField() {
        extentReport.createTest("When User navigate to the OTP Screen PIN Password Field should be visible to the user", "PIN Password Field");
        String result = PINPage.pinPasswordField();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 6, enabled = true)
    public void PinLoginButton() throws InterruptedException {

        extentReport.createTest("When User navigate to the OTP Screen PIN Login button Should be Visible", "PIN Login button");
        String result = PINPage.PinLoginButton();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 7, enabled = true)
    public void forgotButton() throws InterruptedException {

        extentReport.createTest("When User navigate to the OTP Screen forgot Button Should be Visible", "forgot Button");
        String result = PINPage.forgotButton();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 8, enabled = true)
    public void loginWithBioMetricHeading() throws InterruptedException {

        extentReport.createTest("When User navigate to the OTP Screen Login With BioMetric Heading should be Visible", "Login With BioMetric Heading");
        String result = PINPage.loginWithBioMetricHeading();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 9, enabled = true)
    public void bioMetricLogo() throws InterruptedException {

        extentReport.createTest("When User navigate to the OTP Screen BioMetric Logo should be Visible", "BioMetric Logo is Not available");
        String result = PINPage.bioMetricLogo();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }


    @Test(priority = 10, enabled = true)
    public void clickOnPinPasswordField() throws InterruptedException {

        extentReport.createTest("When User be able to Click on PIN Password field", "Click on PIN Password field");
        String result = PINPage.clickOnPinPasswordField();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

//    @Test(priority = 11)
//    public void enterPinNumber() throws InterruptedException {
//
//        extentReport.createTest(" User should be able to Enter the PIN Password field", "Enter PIN Password field");
//        String result = PINPage.enterPinNumber();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }


//    @Test(priority = 12)
//    public void clickOtpLoginButton() throws InterruptedException {
//        Thread.sleep(3000);
//
//        extentReport.createTest(" OTP Login Button", "OTP Login Button");
//        result = loginOTP.clickOtpLoginButton();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }

    @Test(priority = 11, enabled = true)
    public void bioMetricSection() {

        extentReport.createTest(" BioMetric Section Should be Visible", "BioMetric Section");
        String result = PINPage.bioMetricSection();
        captureScreenshot("BIO Metric Page, Visibility Test");
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 12, enabled = true)
    public void biometricLogo() {

        extentReport.createTest(" When user navigate to the BioMetric Section the Main BioMetric Logo Should be Visible", "BioMetric Logo");
        String result = PINPage.biometricLogo();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 13, enabled = true)
    public void enableBiometricHeading() {

        extentReport.createTest("When user navigate to the BioMetric Section the Enable BioMetric Heading should be Visible", "BioMetric Logo");
        String result = PINPage.enableBiometricHeading();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 14, enabled = true)
    public void biometricCommentsHeading() {

        extentReport.createTest("When user navigate to the BioMetric Section, BioMetric Comments should be visible to the user", "BioMetric Logo");
        String result = PINPage.biometricCommentsHeading();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 15, enabled = true)
    public void enableBiometricButton()  {

        extentReport.createTest(" When user navigate to the BioMetric Section, Enable BioMetric Button should be visible to the User", "Enable BioMetric Button");
        String result = PINPage.enableBiometricButton();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 16, enabled = true)
    public void skipForNowButton()  {

        extentReport.createTest("When user navigate to the BioMetric Section, the Skip for Now Button should be visible to the user", "Skip for Now Button");
        String result = PINPage.skipForNowButton();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 17, enabled = true)
    public void CrossButton()  {

        extentReport.createTest("When user navigate to the BioMetric Section, Cross Button should be visible to the user", "Cross Button");
        String result = PINPage.CrossButton();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }


    @Test(priority = 18, enabled = true)
    public void clickOtpSkipForNowButton() {

        extentReport.createTest("User should be able tp Click on Skip for Now Button", "Click on Skip for Now Button");
        String result = PINPage.clickOtpSkipForNowButton();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

















}
