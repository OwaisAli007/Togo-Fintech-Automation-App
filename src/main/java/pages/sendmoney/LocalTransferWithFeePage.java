package pages.sendmoney;

/*
 * This is just a example page class you can modify the package and class according to the your mobile app
 *
 * */

import io.appium.java_client.android.AndroidDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.commonComponents.scrollMethods.ScrollingMethods;
import utils.seleniumUtils.SeleniumUtils;

import java.io.IOException;


public class LocalTransferWithFeePage extends SeleniumUtils {

    private static final Logger logger = LogManager.getLogger(LocalTransferWithFeePage.class);

    private ScrollingMethods scrollingMethods;

    public LocalTransferWithFeePage(AndroidDriver driver) { super(driver); }


//    1st Scenario


    public String tapOnSendMoneyModule()  {
        result = "";
        By locater = By.xpath("//android.widget.ImageView[@content-desc=\"Money Transfer\"]");
        try {
            click(locater);
            result = "Pass, SendMoney Menu Button is Clickable";
        } catch (IOException e) {
            result = "Fail, SendMoney Menu Button is Not Clickable";

        }
        return result;
    }

//    2nd Scenario

    public String selectAnOptionToSendMoneyHeading() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Money Transfer\"]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Select An Option To Send Money Heading is Available";
            }
        } catch (IOException e) {
            result = "Fail, Select An Option To Send Money Heading is Not Available";

            throw new RuntimeException(e);
        }
        return result;
    }


    //    3rd Scenario

    public String LocalTransferOption() {
        result = "";
        By locater = By.xpath("//android.widget.ImageView[@content-desc=\"National Transfer\"]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Local Transfer Option is Visible";
            }
        } catch (IOException e) {
            result = "Fail, Local Transfer Option is Not Visible";

            throw new RuntimeException(e);
        }
        return result;
    }

    //    4th Scenario

    public String InternationalRemittance() {
        result = "";
        By locater = By.xpath("//android.widget.ImageView[@content-desc=\"TCash (Coupon)\"]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, International Remittancer Option is Visible";
            }
        } catch (IOException e) {
            result = "Fail, International Remittance Option is Not Visible";

            throw new RuntimeException(e);
        }
        return result;
    }

    //    5th Scenario

    public String clickOnLocalTransactionOption() {
        result = "";
        By locater = By.xpath("//android.widget.ImageView[@content-desc=\"National Transfer\"]");

        try {
            click(locater);
            result = "Pass, Local Transfer Option is clickable";
        } catch (IOException e) {
            result = "Fail,  Local Transfer Option is Not clickable";
            throw new RuntimeException(e);
        }
        return result;
    }

    //    6th Scenario

    public String recentTab() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Recents\"]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Recent Tab is Visible";
            }
        } catch (IOException e) {
            result = "Fail, Recent Tab is Not Visible";

            throw new RuntimeException(e);
        }
        return result;
    }

    //    7th Scenario

    public String allContacts() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"All Contacts\"]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, All Contacts Tab is Visible";
            }
        } catch (IOException e) {
            result = "Fail, All Contacts Tab is Not Visible";

            throw new RuntimeException(e);
        }
        return result;
    }


//    //    8th Scenario
//
//    public String videoPlayIcon() {
//        result = "";
//        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Video Play Icon is Visible";
//            }
//        } catch (IOException e) {
//            result = "Fail, Video Play Icon is Not Visible";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    9th Scenario
//
//    public String audioIcon() {
//        result ="";
//        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Audio Icon is visible";
//            }
//        } catch (IOException e) {
//            result = "Fail, Audio Icon is not Visible";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//
//    //    10th Scenario
//    public String favIcon () {
//        result ="";
//        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Fav Icon is Visible";
//            }
//        } catch (IOException e) {
//            result = "Fail, Fav Icon is Not Visible";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//

    //    11th Scenario
    public String beneficiaryNumberField () {
        result ="";
        By locater = By.xpath("//android.widget.EditText");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Beneficiary Number Field is Visible";
            }
        } catch (IOException e) {
            result = "Fail, Beneficiary Number Field is Not Visible";

            throw new RuntimeException(e);
        }
        return result;
    }

    //    12th Scenario
    public String tapOnBeneficiaryNumberField() {
        result = "";
        By locater = By.xpath("//android.widget.EditText");

        try {
            click(locater);
            result = "Pass, Beneficiary Number Field is clickable";
        } catch (IOException e) {
            result = "Fail, Beneficiary Number Field is Not clickable";
            throw new RuntimeException(e);
        }
        return result;
    }


        //    13th Scenario
    public String enterBeneficiaryNumber() {

        By locater = By.xpath("//android.widget.EditText");

        try {
            sendKeys(locater,"90009182");
            result = "Pass, Beneficiary Number Enter Successfully";
        } catch (IOException e) {
            result = "Fail, Beneficiary number Enter Not Successfully";
            throw new RuntimeException(e);
        }
        return result;
    }


    //    14th Scenario
    public String nextButton() {
        result = "";
        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView");

        try {
            if (isDisplayed(locater)) {
                result = "Pass, Next button is Visible";
            }
        } catch (IOException e) {
            result = "Fail, Next button is Not Visible";

            throw new RuntimeException(e);
        }
        return result;
    }

    //    15th Scenario
    public String tapOnNextButton() throws IOException {
        result = "";
        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView");

        if (isDisplayed((locater))) {
            WebElement element = driver.findElement(locater);
            element.click();
            result = "Pass, Next button is Clickable";
        }
        else {	result = "Fail, Next button is Not Clickable";
        }
        return result;
    }

//    public String tapOnSendMoneyModule() throws IOException {
//        result = "";
//        By locater = By.xpath("//android.widget.ImageView[@content-desc=\"SVGCachedNetworkImageView\n" +
//                "Send Money \"]/android.widget.ImageView");
//
//        if (isDisplayed((locater))) {
//            WebElement element = driver.findElement(locater);
//            element.click();
//            result = "Pass,  Humburger Menu Button is Clickable";
//        }
//        else {	result = "Fail, Humburger Menu Button is Not Clickable";
//        }
//        return result;
//    }
//
//    //    16th Scenario
//    public String transactionPage() {
//        result = "";
//        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Transaction Page is Visible";
//            }
//        } catch (IOException e) {
//            result = "Fail,Transaction Page is Not Visible";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    17th Scenario
//    public String sendToHeading() {
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"Send To\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Send To Heading is Available";
//            }
//        } catch (IOException e) {
//            result = "Fail, Send To Heading is Not Available";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    18th Scenario
//    public String personName() {
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"MTMSL TIGO PESA MTMSL TIGO PESA\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Person name ( MTMSL TIGO PESA MTMSL TIGO PESA )is Available";
//            }
//        } catch (IOException e) {
//            result = "Fail, Person name ( MTMSL TIGO PESA MTMSL TIGO PESA ) is Not Available";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    19th Scenario
//    public String personNumber() {
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"0677166533\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Person name ( 0677166533 )is Available";
//            }
//        } catch (IOException e) {
//            result = "Fail, Person name ( 0677166533 ) is Not Available";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    20th Scenario
//    public String mLogo() {
//        result = "";
//        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.widget.ImageView");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Tigo Pesa Logo is Available";
//            }
//        } catch (IOException e) {
//            result = "Fail, Tigo Pesa Logo is Not Available";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    21th Scenario
//    public String enterAmountToSend() {
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"Enter amount to send\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Enter Amount to Send Heading is Available";
//            }
//        } catch (IOException e) {
//            result = "Fail, Enter Amount to Send Heading is Not Available";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    22th Scenario
//    public String amountInsertField() {
//        result = "";
//        By locater = By.xpath("(//android.widget.Button[@content-desc=\"Text Field Click\"])[1]/android.widget.Button/android.widget.EditText/android.widget.EditText");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Amount Inserting field is Available";
//            }
//        } catch (IOException e) {
//            result = "Fail, Amount Inserting field is Not Available";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    23th Scenario
//    public String a1000AmountSlabs() {
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"1,000\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, 1000 Amount button is Available";
//            }
//        } catch (IOException e) {
//            result = "Fail, 1000 Amount button is Not Available";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    24th Scenario
//    public String a1500AmountSlabs() {
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"1,500\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, 1500 Amount button is Available";
//            }
//        } catch (IOException e) {
//            result = "Fail, 1500 Amount button is Not Available";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    25th Scenario
//    public String a2000AmountSlabs() {
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"2,000\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, 2000 Amount button is Available";
//            }
//        } catch (IOException e) {
//            result = "Fail, 2000 Amount button is Not Available";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    26th Scenario
//    public String a3000AmountSlabs() {
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"3,000\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, 3000 Amount button is Available";
//            }
//        } catch (IOException e) {
//            result = "Fail, 3000 Amount button is Not Available";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    27th Scenario
//    public String addANoteHeading() {
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"Add a note (Optional)\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Add a Note Heading is Available";
//            }
//        } catch (IOException e) {
//            result = "Fail, Add a Note Heading is Not Available";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    28th Scenario
//    public String noteField() {
//        result = "";
//        By locater = By.xpath("(//android.widget.Button[@content-desc=\"Text Field Click\"])[2]/android.widget.Button/android.widget.EditText");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass,Notes field is Available";
//            }
//        } catch (IOException e) {
//            result = "Fail,Note field is Not Available";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    29th Scenario
//    public String tapOnCheckBox() {
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"Send with Cash Out Fees\"]");
//
//            try {
//                click(locater);
//                result = "Pass, Check Box is clickable ";
//            } catch (IOException e) {
//                result = "Fail, Check Box is Not Available ";
//                throw new RuntimeException(e);
//            }
//            return result;
//        }
//
//    //    30th Scenario
//    public String nextButtonVisible() {
//        result = "";
//        By locater = By.xpath("(//android.widget.Button[@content-desc=\"onboarding next button click\"])[1]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass,Next Button is Visible";
//            }
//        } catch (IOException e) {
//            result = "Fail,Next Button is Visible";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//
//    //    31th Scenario
//    public String sendAsGiftMoneyButton() {
//        result = "";
//        By locater = By.xpath("(//android.widget.Button[@content-desc=\"onboarding next button click\"])[2]/android.widget.EditText");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass,Send as gift money Button is Available";
//            }
//        } catch (IOException e) {
//            result = "Fail,Send as gift money Button is Not Available";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }


    //    32th Scenario
    public String tapOnTheEnterAmountField() {
        result = "";
        By locater = By.xpath("//android.widget.ScrollView/android.view.View[6]/android.widget.EditText");

        try {
            click(locater);
            result = "Pass, Enter Amount Field is Clickable";
        } catch (IOException e) {
            result = "Fail, Enter Amount Field is Not Clickable";
            throw new RuntimeException(e);
        }
        return result;
    }

    //    33th Scenario
    public String enterAmountForSend() {

        By locater = By.xpath("//android.widget.ScrollView/android.view.View[6]/android.widget.EditText");

        try {
            sendKeys(locater,"100");
            result = "Pass, User are able to enter the Amount";
        } catch (IOException e) {
            result = "Fail, User are not able to enter the Amount";
            throw new RuntimeException(e);
        }
        return result;
    }

    //    34th Scenario

//    public String tabOnTheNotesField() {
//        result = "";
//        By locater = By.xpath("(//android.widget.Button[@content-desc=\"Text Field Click\"])[2]/android.widget.Button/android.widget.EditText");
//
//        try {
//            click(locater);
//            result = "Pass, Next Button is Clickable";
//        } catch (IOException e) {
//            result = "Fail, Next Button is Not Clickable";
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//
//    //    35th Scenario
//    public String insertTheNotes() {
//
//        By locater = By.xpath("(//android.widget.Button[@content-desc=\"Text Field Click\"])[2]/android.widget.Button/android.widget.EditText");
//
//        try {
//            sendKeys(locater,"Owais Ali Transaction");
//            result = "Pass, User are able to enter the Notes";
//        } catch (IOException e) {
//            result = "Fail, User are not able to enter the Notes";
//            throw new RuntimeException(e);
//        }
//        return result;
//    }

    //    36th Scenario
    public String tapOnTheNextButton() {
        result = "";
        By locater = By.xpath("//android.view.View[@index=\"15\"]");

        try {
            click(locater);
            result = "Pass, Next Button is Clickable";
        } catch (IOException e) {
            result = "Fail, Next Button is Not Clickable";
//            throw new RuntimeException(e);
        }
        return result;
    }

//
////    public String swipeDownTestCase() {
////        By scroll = By.xpath("//android.widget.ScrollView");
////        try {
////            if (isDisplayed(scroll)) {
////                WebElement element = driver.findElement(scroll);
////                scrollingMethods.swipeDown(element);
////
////                result = "Pass, SwipeUp Working";
////            } else {
////                result = "Skip, SwipeUp not working";
////            }
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
////        return result;
////    }
//
//
//
////
////    //    37th Scenario
////    public String transactionDetailPage() {
////        result = "";
////        By locater = By.xpath("//android.view.View[@content-desc=\"Transaction Details\"]");
////
////        try {
////            if (isDisplayed(locater)) {
////                result = "Pass, Final Transaction page is Available";
////            }
////        } catch (IOException e) {
////            result = "Fail, Final Transaction page is Not Available";
////
////            throw new RuntimeException(e);
////        }
////        return result;
////    }
////
////    //    38th Scenario
////    public String transactionDetailHeading() {
////        result = "";
////        By locater = By.xpath("//android.view.View[@content-desc=\"Transaction Details\"]");
////
////        try {
////            if (isDisplayed(locater)) {
////                result = "Pass, Transaction Details Heading is Available";
////            }
////        } catch (IOException e) {
////            result = "Fail, Final Transaction Details Heading is Not Available";
////
////            throw new RuntimeException(e);
////        }
////        return result;
////    }
////
////
////    //    39th Scenario
////    public String sendToHeadingTransactionPage() {
////        result = "";
////        By locater = By.xpath("//android.view.View[@content-desc=\"Send To\"]");
////
////        try {
////            if (isDisplayed(locater)) {
////                result = "Pass, Send to Heading is Available";
////            }
////        } catch (IOException e) {
////            result = "Fail, Send to Heading is Not Available";
////
////            throw new RuntimeException(e);
////        }
////        return result;
////    }
////
////    //    40th Scenario
////    public String personNameTransactionPage() {
////        result = "";
////        By locater = By.xpath("//android.view.View[@content-desc=\"MTMSL TIGO PESA MTMSL TIGO PESA\"]");
////
////        try {
////            if (isDisplayed(locater)) {
////                result = "Pass, Person Name is Available";
////            }
////        } catch (IOException e) {
////            result = "Fail, Person Name is Not Available";
////
////            throw new RuntimeException(e);
////        }
////        return result;
////    }
////
////    //    41th Scenario
////    public String phoneNumberTransactionPage() {
////        result = "";
////        By locater = By.xpath("//android.view.View[@content-desc=\"0677166533\"]");
////
////        try {
////            if (isDisplayed(locater)) {
////                result = "Pass, Phone Number is Available";
////            }
////        } catch (IOException e) {
////            result = "Fail, Phone Number is Not Available";
////
////            throw new RuntimeException(e);
////        }
////        return result;
////    }
////
////    //    42th Scenario
//////    public String editButton_TransactionDetails() {
//////        result = "";
//////        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]");
//////
//////        try {
//////            if (isDisplayed(locater)) {
//////                result = "Pass, Edit button is Available";
//////            }
//////        } catch (IOException e) {
//////            result = "Fail, Edit button is Not Available";
//////
//////            throw new RuntimeException(e);
//////        }
//////        return result;
//////    }
////
////    //    43th Scenario
////    public String operatorHeading_TransactionDetails() {
////        result = "";
////        By locater = By.xpath("//android.view.View[@content-desc=\"Operator\"]");
////
////        try {
////            if (isDisplayed(locater)) {
////                result = "Pass, Operator Heading is Available";
////            }
////        } catch (IOException e) {
////            result = "Fail, Operator Heading is Not Available";
////
////            throw new RuntimeException(e);
////        }
////        return result;
////    }
////
////    //    44th Scenario
////    public String MLogo_TransactionDetails() {
////        result = "";
////        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]");
////
////        try {
////            if (isDisplayed(locater)) {
////                result = "Pass, M logo is Available";
////            }
////        } catch (IOException e) {
////            result = "Fail, M Logo is Not Available";
////
////            throw new RuntimeException(e);
////        }
////        return result;
////    }
////
////    //    45th Scenario
////    public String amountHeading_TransactionDetails() {
////        result = "";
////        By locater = By.xpath("//android.view.View[@content-desc=\"Amount\"]");
////
////        try {
////            if (isDisplayed(locater)) {
////                result = "Pass, Amount Heading logo is Available";
////            }
////        } catch (IOException e) {
////            result = "Fail, Amount Heading is Not Available";
////
////            throw new RuntimeException(e);
////        }
////        return result;
////    }
////
////    //    46th Scenario
////    public String feeHeading_TransactionDetails() {
////        result = "";
////        By locater = By.xpath("//android.view.View[@content-desc=\"Fee (VAT Inclusive)\"]");
////
////        try {
////            if (isDisplayed(locater)) {
////                result = "Pass,  Fee Vat Inclusive Heading is Available";
////            }
////        } catch (IOException e) {
////            result = "Fail, Fee Vat Inclusive Heading is Not Available";
////
////            throw new RuntimeException(e);
////        }
////        return result;
////    }
////
////    //    47th Scenario
////    public String totalHeading_TransactionDetails() {
////        result = "";
////        By locater = By.xpath("//android.view.View[@content-desc=\"Total\"]");
////
////        try {
////            if (isDisplayed(locater)) {
////                result = "Pass,  Total Heading is Available";
////            }
////        } catch (IOException e) {
////            result = "Fail, Total Heading is Not Available";
////
////            throw new RuntimeException(e);
////        }
////        return result;
////    }
////
////    //    48th Scenario
////    public String enterYourMixxPinHeading_TransactionDetails() {
////        result = "";
////        By locater = By.xpath("//android.view.View[@content-desc=\"Enter your Mixx PIN\"]");
////
////        try {
////            if (isDisplayed(locater)) {
////                result = "Pass,  Enter Your TigoPesa PIN Heading is Available";
////            }
////        } catch (IOException e) {
////            result = "Fail, Enter Your TigoPesa PIN Heading is Not Available";
////
////            throw new RuntimeException(e);
////        }
////        return result;
////    }
////
////
//    //    49th Scenario
//    public String confirmedButton_TransactionDetails() {
//        result = "";
//        By locater = By.xpath("//android.widget.Button[@content-desc=\"onboarding next button click\"]/android.widget.ImageView");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass,  CONFIRM button is Visible";
//            }
//        } catch (IOException e) {
//            result = "Fail, CONFIRM button is Not Visible";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }


    //    50th Scenario
    public String clickOnConfirmedButton_TransactionDetails() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Confirm\"]");

        try {
            click(locater);
                result = "Pass, CONFIRM button is Clickable";

        } catch (IOException e) {
            result = "Fail, CONFIRM button is Not Clickable";

            throw new RuntimeException(e);
        }
        return result;
    }


    //4th Scenario
    public String sendMoneyInsertPIN()throws IOException {

        By locater = By.xpath("//android.widget.EditText");
        try {
            sendKeys(locater, "6510");
            result = "Pass, Enter number Successfully";
        } catch (IOException e) {
            result = "Fail, Enter number Not Successfully";
            throw new RuntimeException(e);
        }
        return result;
    }





    public String transactionReceipt_TransactionDetails() {
        result = "";
        By locater = By.xpath("//android.view.View[@content-desc=\"Successful transfer of\"]");

        try {
            if (isDisplayed(locater)) {
                result = "Pass,  Transaction Receipt is Visible";
            }
        } catch (IOException e) {
            result = "Fail, Transaction Receipt is Not Visible";

            throw new RuntimeException(e);
        }
        return result;
    }
//
//    //52 Scenario
//    public String transactionReceiptCrossButton() {
//
//        result = "";
//        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass,  Cross Button is Visible at Transaction Receipt";
//            }
//        } catch (IOException e) {
//            result = "Fail, Cross Button is Not Visible at Transaction Receipt";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //53 Scenario
//    public String mixxLogo_TransactionReciept() {
//
//        result = "";
//        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, TigoPesa Logo is Visible at Transaction Receipt";
//            }
//        } catch (IOException e) {
//            result = "Fail, TigoPesa Logo is Not Visible at Transaction Receipt";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//
//    //54 Scenario
//    public String successfulTransferHeading_TransactionReciept() {
//
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"Successful transfer of\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Successful Transfer Heading is Visible at Transaction Receipt";
//            }
//        } catch (IOException e) {
//            result = "Fail, Successful Transfer Heading is Not Visible at Transaction Receipt";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//
//    //    55th Scenario
//
//    public String senderHeading_TransactionReciept() {
//
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"Sender\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Sender Heading is Visible at Transaction Receipt";
//            }
//        } catch (IOException e) {
//            result = "Fail, Sender Heading is Not Visible at Transaction Receipt";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    56th Scenario
//
//    public String receiverHeading_TransactionReciept() {
//
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"Receiver\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Receiver Heading is Visible at Transaction Receipt";
//            }
//        } catch (IOException e) {
//            result = "Fail, Receiver Heading is Not Visible at Transaction Receipt";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    57th Scenario
//    public String NoteHeading_TransactionReciept() {
//
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"Note\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Note Heading is Visible at Transaction Receipt";
//            }
//        } catch (IOException e) {
//            result = "Fail, Note Heading is Not Visible at Transaction Receipt";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//    //    58th Scenario
//    public String downloadButton_TransactionReciept() {
//
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"Download\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Download Button is Visible at Transaction Receipt";
//            }
//        } catch (IOException e) {
//            result = "Fail, Download Button is Not Visible at Transaction Receipt";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//
//    //    59th Scenario
//    public String shareButton_TransactionReciept() {
//
//        result = "";
//        By locater = By.xpath("//android.view.View[@content-desc=\"Share\"]");
//
//        try {
//            if (isDisplayed(locater)) {
//                result = "Pass, Share Button is Visible at Transaction Receipt";
//            }
//        } catch (IOException e) {
//            result = "Fail, Share Button is Not Visible at Transaction Receipt";
//
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
//
//
//    //    60th Scenario
//
    public String clickOnCrossButton_TransactionReciept() {
        result = "";
        By locater = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]");

        try {
            click(locater);
            result = "Pass, Cross button is Clickable";

        } catch (IOException e) {
            result = "Fail, Cross button is Not Clickable";

            throw new RuntimeException(e);
        }
        return result;
    }
//
//
//
//
//
//


}
