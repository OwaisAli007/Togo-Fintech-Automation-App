package pages.pin;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.seleniumUtils.SeleniumUtils;

import java.io.IOException;

public class PINPage extends SeleniumUtils {
    public PINPage(AndroidDriver driver) {
        super(driver);
    }




    //1st Scenario

    public String pinPageVisible() {
        result = "";
        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, OTP Page is visible";
            }
        } catch (IOException e) {
            result = "Fail, OTP Page is Not visible";

            throw new RuntimeException(e);
        }
        return result;
    }


    //2nd Scenario

    public String pinPageLogo() {
        result = "";
        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, OTP Logo is visible";
            }
        } catch (IOException e) {
            result = "Fail, OTP Logo is Not visible";

            throw new RuntimeException(e);
        }
        return result;
    }


    //3rd Scenario

    public String welcomeMixxComments() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Welcome to Mixx, for the best financial services in Tanzania\n" +
                "0655116414\"]");


        try {
            if (isDisplayed(locater)) {
                result = "Pass, Welcome to Mixx Comments is visible";
            }
        } catch (IOException e) {
            result = "Fail, Welcome to Mixx Comments is Not visible";

            throw new RuntimeException(e);
        }
        return result;
    }

        //4th Scenario

    public String enterYourMixxPinHeading() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Enter your Mixx PIN\"]");


        try {
            if (isDisplayed(locater)) {
                result = "Pass, Enter Your Mixx Pin Heading is visible";
            }
        } catch (IOException e) {
            result = "Fail, Enter Your Mixx Pin Heading is Not visible";

            throw new RuntimeException(e);
        }
        return result;
    }

    //5th Scenario

    public String pinPasswordField() {
        result = "";
        By locater = By.xpath("//android.widget.EditText[@text=\"Enter your pin code here\"]/android.view.View");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, PIN Password Field is Available";
            }
        } catch (IOException e) {
            result = "Fail, PIN Password Field is Not Available";

            throw new RuntimeException(e);
        }
        return result;
    }

     //6th Scenario

    public String PinLoginButton() {
        result = "";
        By locater = By.xpath("//android.widget.Button[@content-desc=\"onboarding next button click\"]/android.widget.EditText");

        try {
            if (isDisplayed(locater)) {
                result = "Pass,  Pin Login Button is Available";
            }
        } catch (IOException e) {
            result = "Fail, Pin Login Button is Not Available";

            throw new RuntimeException(e);
        }
        return result;
    }

    //7th Scenario

    public String forgotButton() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Forgot PIN?\"]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass,  Forgot button is Available";
            }
        } catch (IOException e) {
            result = "Fail, Forgot button is Not Available";

            throw new RuntimeException(e);
        }
        return result;
    }

     //8th Scenario

    public String loginWithBioMetricHeading() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Or login with\"]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Login With BioMetric Heading is Available";
            }
        } catch (IOException e) {
            result = "Fail,  Login With BioMetric Heading is Not Available";

            throw new RuntimeException(e);
        }
        return result;
    }

    //9th Scenario

    public String bioMetricLogo() {
        result = "";
        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[15]/android.widget.ImageView");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, BioMetric Logo is Available";
            }
        } catch (IOException e) {
            result = "Fail, BioMetric Logo is Not Available";

            throw new RuntimeException(e);
        }
        return result;
    }

    // 10 Scenario

    public String clickOnPinPasswordField() {
        result = "";
        By locater = By.xpath("//android.widget.EditText[@text=\"Enter your pin code here\"]/android.view.View");

        try {
            click(locater);
            result = "Pass, PIN Password Field is Clickable";
        } catch (IOException e) {
            result = "Fail, PIN Password Field is Not Clickable";
            throw new RuntimeException(e);
        }
        return result;
    }

    // 11 Scenario

//    public String enterPinNumber() {
//        result = "";
//        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View");
//
//        try {
//            sendKeys(locater,"1133");
//            result = "Pass, Enter PIN number is Successfully";
//        } catch (IOException e) {
//            result = "Fail, Enter PIN number is Not Successfully";
//            throw new RuntimeException(e);
//        }
//        return result;
//    }



    // 12 Scenario

//    public String clickOtpLoginButton() {
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"Login\"]");
//        try {
//        click(locater);
//        result = "Pass, Click on OTP Login Button is Clickable";
//    } catch (IOException e) {
//        result = "Fail, Click on OTP Login Button is Not Clickable";
//        throw new RuntimeException(e);
//    }
//        return result;
//}



    // 13 Scenario

    public String bioMetricSection() {
        result = "";
        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[2]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, BioMetric Section is visible";
            }
        } catch (IOException e) {
            result = "Fail, BioMetric Section is Not visible";


        }
        return result;
    }


    // 14 Scenario

    public String biometricLogo() {
        result = "";
        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[2]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, BioMetric Logo is Available";
            }
        } catch (IOException e) {
            result = "Fail, BioMetric Section is Not Available";

        }
        return result;
    }


    // 15 Scenario

    public String enableBiometricHeading() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Enable Biometric\"]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Enable BioMetric Heading is Available";
            }
        } catch (IOException e) {
            result = "Fail, Enable BioMetric Heading is Not Available";

        }
        return result;
    }


    // 16 Scenario

    public String biometricCommentsHeading() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Use biometric login (Fingerprint or Face ID) - for faster and easier access\"]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, BioMetric Comments is Available";
            }
        } catch (IOException e) {
            result = "Fail, BioMetric Comments is Not Available";

        }
        return result;
    }


    // 17 Scenario

    public String enableBiometricButton() {
        result = "";
        By locater = By.xpath("//android.widget.Button[@content-desc=\"onboarding next button click\"]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Enable BioMetric Button is Available";
            }
        } catch (IOException e) {
            result = "Fail, Enable BioMetric Button is Not Available";

        }
        return result;
    }


    // 18 Scenario

    public String skipForNowButton() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Skip for Now\"]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Skip for Now Button is Available";
            }
        } catch (IOException e) {
            result = "Fail, Skip for Now Button is Not Available";

        }
        return result;
    }


    // 19 Scenario

    public String CrossButton() {
        result = "";
        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[1]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Cross Button is Available";
            }
        } catch (IOException e) {
            result = "Fail, Cross Button is Not Available";

        }
        return result;
    }

    // 20 Scenario
    public String clickOtpSkipForNowButton() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Skip for Now\"]");

        try {
            click(locater);
            result = "Pass, Bio Metric Skip for Now Button is Clickable";
        } catch (IOException e) {
            result = "Fail, Bio Metric Skip for Now Button is Not Clickable";

        }
        return result;
    }





























}
