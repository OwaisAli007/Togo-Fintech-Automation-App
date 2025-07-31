package Dashboard;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.PageObjects;
import java.io.IOException;


public class DashboardTest extends PageObjects {


//1112025423005673
    @Test(priority = 1, enabled = true)
    public void dashboardPageVisible()  {

        extentReport.createTest("After the login User should be Redirect to the Dashboard Page", "Dashboard Page");
        String result = DashboardPage.dashboardPageVisible();
        captureScreenshot("Dashboard Page,Visibility Test");
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 2, enabled = true)
    public void sendMoneyModule()  {

        extentReport.createTest("At Main Dashboard, Send Money Module Should be Visible to the user", "Send Money Module");
        String result = DashboardPage.sendMoneyModule();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 3, enabled = true)
    public void hamburgerIcon()  {

        extentReport.createTest("At Main Dashboard, Hamburger Icon should be Visible to the User", "Hamburger Icon");
        String result = DashboardPage.hamburgerIcon();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }


    @Test(priority = 5, enabled = true)
    public void notificationIcon()  {

        extentReport.createTest("At Main Dashboard, Notification Icon should be visible to the user", "Notification Icon");
        String result = DashboardPage.notificationIcon();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }
//
//    @Test(priority = 6, enabled = true)
//    public void favoriteIcon()  {
//
//        extentReport.createTest("At Main Dashboard,favorite Icon Should be Visible", "favorite Icon");
//        String result = DashboardPage.favoriteIcon();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//    @Test(priority = 7, enabled = true)
//    public void customizedDashboardIcon()  {
//
//        extentReport.createTest("At Main Dashboard, Customized Dashboard Icon Should be Visible", "Customized Dashboard Icon");
//        String result = DashboardPage.customizedDashboardIcon();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//    @Test(priority = 8, enabled = true)
//    public void welcomeModule() {
//
//        extentReport.createTest("At Main Dashboard, Welcome Module Should be Visible at Bottom Menu", "Welcome Button");
//        String result = DashboardPage.welcomeModule();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//    @Test(priority = 9, enabled = true)
//    public void appsModule() {
//
//        extentReport.createTest("At Main Dashboard, Apps Module Should be Visible at Bottom Menu", "Apps Module ");
//        String result = DashboardPage.appsModule();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//    @Test(priority = 10, enabled = true)
//    public void payModule() {
//
//        extentReport.createTest("At Main Dashboard, Pay Module Should be Visible at Bottom Menu", "pay Module ");
//        String result = DashboardPage.payModule();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//    @Test(priority = 11, enabled = true)
//    public void selfcareModule() {
//
//        extentReport.createTest("At Main Dashboard, Selfcare Module Should be Visible at Bottom Menu", "Selfcare Module ");
//        String result = DashboardPage.selfcareModule();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//    @Test(priority = 12, enabled = true)
//    public void accountModule() {
//
//        extentReport.createTest("At Main Dashboard, Account Module Should be Visible at Bottom Menu", "Account Module ");
//        String result = DashboardPage.accountModule();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//    @Test(priority = 13, enabled = true)
//    public void availableBalanceHeading() {
//
//        extentReport.createTest("At Main Dashboard, Available Balance Heading Should be Visible at Main Dashboard", "Available Balance Heading");
//        String result = DashboardPage.availableBalanceHeading();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//
//    @Test(priority = 14, enabled = true)
//    public void balanceEyeButton()  {
//
//        extentReport.createTest("At Main Dashboard, Balance Eye Button Should be Visible at Main Dashboard", "Balance Eye Button");
//        String result = DashboardPage.balanceEyeButton();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }

    @Test(priority = 15, enabled = true)
    public void tapOnHamburgerMenu() {

        extentReport.createTest("User Should be able to click on the Humburger Menu", "Hamburger Menu");
        String result = DashboardPage.tapOnHamburgerMenu();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 16, enabled = true)
    public void hamgurgerChangelanguageIcon(){

        extentReport.createTest("Hamgurger Change language Icon", "Hamgurger Change language Icon");
        String result = DashboardPage.hamgurgerChangelanguageIcon();
        captureScreenshot("Hamgurger Menu,Visibility Test");
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 17, enabled = true)
    public void hamburgerBackButton() {

        extentReport.createTest("At Humberger menu section, Back Button should be visible", "Humberger Back Button");
        String result = DashboardPage.hamburgerBackButton();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 18, enabled = true)
    public void clickOnLanguageIcon() {

        extentReport.createTest("User should be able to Click on the Humberger Back Button", "Click on Humberger Back Button");
        String result = DashboardPage.clickOnLanguageIcon();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 19, enabled = true)
    public void clickOnEnglishLanguageIcon() {

        extentReport.createTest("User should be able to Click on the Humberger Back Button", "Click on Humberger Back Button");
        String result = DashboardPage.clickOnEnglishLanguageIcon();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }
























}
