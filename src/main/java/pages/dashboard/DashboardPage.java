package pages.dashboard;


import io.appium.java_client.android.AndroidDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Login.LoginPage;
import utils.commonComponents.scrollMethods.ScrollingMethods;
import utils.seleniumUtils.SeleniumUtils;

import java.io.IOException;

public class DashboardPage extends SeleniumUtils {


    private static final Logger logger = LogManager.getLogger(LoginPage.class);
    private final ScrollingMethods scrollingMethods;

    public DashboardPage(AndroidDriver driver) {
        super(driver);
        scrollingMethods = new ScrollingMethods(driver);
    }





    //    1st Scenario
    public String dashboardPageVisible() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Bienvenue !\"]/android.widget.ImageView[2]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Dashboard Page is visible";
            }
        } catch (IOException e) {
            result = "Fail, Dashboard Page is Not visible";

        }
        return result;
    }


    //    2nd Scenario
    public String sendMoneyModule() {
        result = "";
        By locater = By.xpath("//android.widget.ImageView[@content-desc=\"Transfert d'argent\"]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Send Money Module is Visible at Dashboard";
            }
        } catch (IOException e) {
            result = "Fail, Send Money Module is Not visible at Dashboard";
            
        }
        return result;
    }

    //    3rd Scenario
    public String hamburgerIcon() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Bienvenue !\"]/android.widget.ImageView[2]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Hamburger Icon is Visible at Dashboard";
            }
        } catch (IOException e) {
            result = "Fail, Hamburger Icon is Not visible at Dashboard";
            
        }
        return result;
    }




    //    5th Scenario
    public String notificationIcon() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Bienvenue !\"]/android.widget.ImageView[3]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Notification icon is Visible at Dashboard";
            }
        } catch (IOException e) {
            result = "Fail, Notification icon is Not Visible at Dashboard";

            
        }
        return result;
    }



//
//
//    //    8th Scenario
//    public String welcomeModule() {
//        result = "";
//        By locater = By.xpath("//android.widget.ImageView[@content-desc=\"Welcome\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Welcome Module is Visible at bottom Menu";
//            }
//        } catch (IOException e) {
//            result = "Fail, Welcome Module is Not Visible at bottom Menu";
//
//        }
//        return result;
//    }
//
//    //    9th Scenario
//    public String appsModule() {
//        result = "";
//        By locater = By.xpath("//android.widget.ImageView[@content-desc=\"Apps\"]");
//
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Apps Module is Visible at bottom Menu";
//            }
//        } catch (IOException e) {
//            result = "Fail, Apps Module is Not Visible at bottom Menu";
//        }
//        return result;
//    }
//
//
//    //    10th Scenario
//    public String payModule() {
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"Pay\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Apps Module is Visible at bottom Menu";
//            }
//        } catch (IOException e) {
//            result = "Fail, Apps Module is Not Visible at bottom Menu";
//
//        }
//        return result;
//    }
//
//
//    //    11th Scenario
//    public String selfcareModule() {
//        result = "";
//        By locater = By.xpath("//android.widget.ImageView[@content-desc=\"Self Care\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Selfcare Module is Visible at bottom Menu";
//            }
//        } catch (IOException e) {
//            result = "Fail, Selfcare Module is Not Visible at bottom Menu";
//
//        }
//        return result;
//    }
//
//
//    //    12th Scenario
//    public String accountModule() {
//        result = "";
//        By locater = By.xpath("//android.widget.ImageView[@content-desc=\"Account\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass,Account Module is Visible at bottom Menu";
//            }
//        } catch (IOException e) {
//            result = "Fail, Account Module is Not Visible at bottom Menu";
//
//        }
//        return result;
//    }
//
//    //    14th Scenario
//    public String availableBalanceHeading() {
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"Available Balance\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Available Balance Heading is Visible at Details Card";
//            }
//        } catch (IOException e) {
//            result = "Fail, Available Balance Heading is Not Visible at Details Card";
//
//
//        }
//        return result;
//    }
//
//
//    //    15th Scenario
//    public String balanceEyeButton() {
//        result = "";
//        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[2]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Balance Eye Button is Visible at Details Card";
//            }
//        } catch (IOException e) {
//            result = "Fail, Balance Eye Button is Not Visible at Details Card";
//
//
//        }
//        return result;
//    }


    //    16th Scenario
    public String tapOnHamburgerMenu() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Bienvenue !\"]/android.widget.ImageView[2]");

        try {
            click(locater);
            result = "Pass, Humburger Menu Button is Clickable";
        } catch (IOException e) {
            result = "Fail,  Humburger Menu Button is Not Clickable";
            
        }
        return result;
    }

    //    17th Scenario

    public String hamgurgerChangelanguageIcon() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"DT\n" +
                "Direction Tmoney\n" +
                "90 00 90 82\"]/android.view.View[1]/android.widget.ImageView[2]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Humburger Change language icon is Visible";
            }
        } catch (IOException e) {
            result = "Fail, Humburger Change language icon is Not Visible";

            
        }
        return result;
    }

    //    18th Scenario

    public String hamburgerBackButton() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"DT\n" +
                "Direction Tmoney\n" +
                "90 00 90 82\"]/android.view.View[1]/android.widget.ImageView[1]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Humburger Back button is Visible";
            }
        } catch (IOException e) {
            result = "Fail, Humburger Back button is Not Visible";

            
        }
        return result;
    }


    public String clickOnLanguageIcon() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"DT\n" +
                "Direction Tmoney\n" +
                "90 00 90 82\"]/android.view.View[1]/android.widget.ImageView[2]");

        try {
            click(locater);
            result = "Pass, Language Icon is Clickable";
        } catch (IOException e) {
            result = "Fail,  Language Icon is Not Clickable";

        }
        return result;
    }



    public String clickOnEnglishLanguageIcon() {
        result = "";
        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView[2]");

        try {
            click(locater);
            result = "Pass, Language Icon is Clickable";
        } catch (IOException e) {
            result = "Fail,  Language Icon is Not Clickable";

        }
        return result;
    }












































}
