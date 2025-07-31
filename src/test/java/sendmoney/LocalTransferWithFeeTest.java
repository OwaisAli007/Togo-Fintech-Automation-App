package sendmoney;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.PageObjects;

import java.io.IOException;

public class LocalTransferWithFeeTest extends PageObjects {





    @Test(priority = 2, enabled = true)
    public void tapOnSendMoneyModule() throws IOException {

        extentReport.createTest("At Main Dashboard, Send Money button Should be Clickable", "Send Money button click");
        String result = LocalTransferWithFeePage.tapOnSendMoneyModule();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 3, enabled = true)
    public void selectAnOptionToSendMoneyHeading()  {

        extentReport.createTest("At Send Money Module, Select An Option To Local Transfer Heading Should be Visible", "Select An Option To Local Transfer Heading");
        String result = LocalTransferWithFeePage.selectAnOptionToSendMoneyHeading();
        captureScreenshot("Send Money, Local Transfer,Visibility Test");
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 4, enabled = true)
    public void LocalTransferOption()  {

        extentReport.createTest("At Send Money Module, Local Transfer Option Should be Visible to the User", "Local Transfer Option");
        String result = LocalTransferWithFeePage.LocalTransferOption();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 5, enabled = true)
    public void InternationalRemittance()  {

        extentReport.createTest("At Send Money Module, International Remittance Option Should be Visible to the User", "International Remittance Option");
        String result = LocalTransferWithFeePage.InternationalRemittance();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }


    @Test(priority = 6, enabled = true)
    public void clickOnLocalTransactionOption()  {

        extentReport.createTest("At Send Money Module,  Local Transfer Option Should be clickable", " Local Transfer Option");
        String result = LocalTransferWithFeePage.clickOnLocalTransactionOption();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 7, enabled = true)
    public void recentTab()  {

        extentReport.createTest("When User click to Local Transaction Module,  Recent Tab Should be Available", " Recent Tab Option ");
        String result = LocalTransferWithFeePage.recentTab();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }

    @Test(priority = 8, enabled = true)
    public void allContacts()  {

        extentReport.createTest("When User click to Local Transaction Module,  All Contacts Tab Should be Available", " All Contacts Tab ");
        String result = LocalTransferWithFeePage.allContacts();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }


//    @Test(priority = 9, enabled = true)
//    public void videoPlayIcon()  {
//
//        extentReport.createTest("When User click to Local Transaction Module, Video Play Icon Should be Available", " All Contacts Tab ");
//        String result = LocalTransferWithFeePage.videoPlayIcon();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//    @Test(priority = 10, enabled = true)
//    public void audioIcon () {
//
//        extentReport.createTest("When user click to Local Transaction Module, Audio Icon Should be visible to the user", "Audio Icon");
//        String result = LocalTransferWithFeePage.audioIcon();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//    @Test (priority = 11, enabled = true)
//    public void favIcon () {
//        extentReport.createTest("When user click to Local Transaction Module, Fav Icon Should be visible to the user", "Fav Icon");
//        String result = LocalTransferWithFeePage.favIcon();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }


    @Test (priority = 12, enabled = true)
    public void beneficiaryNumberField () {
        extentReport.createTest("When user click to Local Transaction Module, Beneficiary Number Field Should be visible to the user", " Beneficiary Number Field");
        String result = LocalTransferWithFeePage.beneficiaryNumberField();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));

    }

    @Test (priority = 13, enabled = true)
    public void tapOnBeneficiaryNumberField () {
        extentReport.createTest("When user click to Local Transaction Module, Tap On Beneficiary Number Field Should be visible to the user", " Beneficiary Number Field");
        String result = LocalTransferWithFeePage.tapOnBeneficiaryNumberField();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));

    }

    @Test (priority = 14, enabled = true)

    public void enterBeneficiaryNumber() {
        extentReport.createTest("When user click to Local Transaction Module, User should be able to insert the Beneficiary Number", " Beneficiary Number Field");
        String result = LocalTransferWithFeePage.enterBeneficiaryNumber();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));

    }

    @Test (priority = 15, enabled = true)
    public void nextButton() {
        extentReport.createTest("When user Insert the Beneficiary Number, Next button Should be visible to the user", " Beneficiary Number Field");
        String result = LocalTransferWithFeePage.nextButton();
        captureScreenshot("Insertion of Beneficiary Number, Insertion Test");
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));

    }

    @Test (priority = 16, enabled = true)
    public void tapOnNextButton() throws IOException {
        extentReport.createTest("When user Insert the Beneficiary Number, Next button Should be Clickable", " Beneficiary Number Field");
        String result = LocalTransferWithFeePage.tapOnNextButton();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }


//    @Test (priority = 17, enabled = true)
//    public void transactionPage() {
//        extentReport.createTest("When user Proceed with Beneficiary Number, the Transaction Page should be open", " Transaction Page");
//        String result = LocalTransferWithFeePage.transactionPage();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 18, enabled = true)
//    public void sendToHeading() {
//        extentReport.createTest("When user Redirect to the Transaction page, Send To Heading is Visibe", " Send To Heading");
//        String result = LocalTransferWithFeePage.sendToHeading();
//        captureScreenshot("Transaction Page, Visibility Test");
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 19, enabled = true)
//    public void personName() {
//        extentReport.createTest("When user Redirect to the Transaction page, The Person name should be Visibe", " Person name Title");
//        String result = LocalTransferWithFeePage.personName();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 20, enabled = true)
//    public void personNumber() {
//        extentReport.createTest("When user Redirect to the Transaction page, The Person Number should be Visibe", " Person Number");
//        String result = LocalTransferWithFeePage.personNumber();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 21, enabled = true)
//    public void mLogo() {
//        extentReport.createTest("When user Redirect to the Transaction page, The Tigo Pesa Logo should be Visibe", " Tigo Pesa Logo");
//        String result = LocalTransferWithFeePage.mLogo();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 22, enabled = true)
//    public void enterAmountToSend() {
//        extentReport.createTest("When user Redirect to the Transaction page, Enter Amount to Send Heading should be Visibe", " Enter Amount to Send Heading");
//        String result = LocalTransferWithFeePage.enterAmountToSend();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 23, enabled = true)
//    public void amountInsertField() {
//        extentReport.createTest("When user Redirect to the Transaction page, Amount Inserting field should be Visibe", " Amount Inserting field");
//        String result = LocalTransferWithFeePage.amountInsertField();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 24, enabled = true)
//    public void a1000AmountSlabs() {
//        extentReport.createTest("When user Redirect to the Transaction page, 1000 Amount button should be Visibe", " 1000 Amount Button");
//        String result = LocalTransferWithFeePage.a1000AmountSlabs();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 25, enabled = true)
//    public void a1500AmountSlabs() {
//        extentReport.createTest("When user Redirect to the Transaction page, 1500 Amount button should be Visibe", " 1500 Amount Button");
//        String result = LocalTransferWithFeePage.a1500AmountSlabs();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 26, enabled = true)
//    public void a2000AmountSlabs() {
//        extentReport.createTest("When user Redirect to the Transaction page, 2000 Amount button should be Visibe", " 2000 Amount Button");
//        String result = LocalTransferWithFeePage.a2000AmountSlabs();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 27, enabled = true)
//    public void a3000AmountSlabs() {
//        extentReport.createTest("When user Redirect to the Transaction page, 3000 Amount button should be Visibe", " 3000 Amount Button");
//        String result = LocalTransferWithFeePage.a3000AmountSlabs();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 28, enabled = true)
//    public void addANoteHeading() {
//        extentReport.createTest("When user Redirect to the Transaction page, Add a Note Heading should be Visibe", "Add a Note Heading");
//        String result = LocalTransferWithFeePage.addANoteHeading();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 29, enabled = true)
//    public void noteField() {
//        extentReport.createTest("When user Redirect to the Transaction page, Notes field should be Visibe", "Note field");
//        String result = LocalTransferWithFeePage.noteField();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 30, enabled = true)
//    public void tapOnCheckBox() {
//        extentReport.createTest("When user Redirect to the Transaction page, Check Box filed should be clickable", "Check Box Field");
//        String result = LocalTransferWithFeePage.tapOnCheckBox();
//        captureScreenshot("Tap on Check Box, Click Test");
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 31, enabled = true)
//    public void nextButtonVisible() {
//        extentReport.createTest("When user Redirect to the Transaction page, Next Button should be Visible", "Next button");
//        String result = LocalTransferWithFeePage.nextButtonVisible();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 32, enabled = true)
//    public void sendAsGiftMoneyButton() {
//        extentReport.createTest("When user Redirect to the Transaction page, Send as gift money Button should be Visible", "Send as gift money button");
//        String result = LocalTransferWithFeePage.sendAsGiftMoneyButton();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
    @Test (priority = 33, enabled = true)
    public void tapOnTheEnterAmountField() {
        extentReport.createTest("When user Redirect to the Transaction page, User should be able to click on the Enter Amount Field", "Send as gift money button should be clickable");
        String result = LocalTransferWithFeePage.tapOnTheEnterAmountField();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));

    }

    @Test (priority = 34, enabled = true)
    public void enterAmountForSend() {
        extentReport.createTest("When user Redirect to the Transaction page,User should be Able to insert the Amount at the Amount Field", "Enter the Amount");
        String result = LocalTransferWithFeePage.enterAmountForSend();
        captureScreenshot("Insertion of Amount, Insertion Test");
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));

    }

//
//    @Test (priority = 35, enabled = true)
//    public void tabOnTheNotesField() {
//        extentReport.createTest("When user Redirect to the Transaction page, User should be able to click on the Notes Field Button", "Click on the Notes Field");
//        String result = LocalTransferWithFeePage.tabOnTheNotesField();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 36, enabled = true)
//    public void insertTheNotes() {
//        extentReport.createTest("When user Redirect to the Transaction page, User should be able to Insert the Notes at the Notes field", "Insert the Notes");
//        String result = LocalTransferWithFeePage.insertTheNotes();
//        captureScreenshot("Insertion of Notes, Insertion Test");
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
    @Test (priority = 37, enabled = true)
    public void tapOnTheNextButton() {
        extentReport.createTest("When user Enters the amount to transfer, User should be able to click on the Next Button", "Click on the Next button");
        String result = LocalTransferWithFeePage.tapOnTheNextButton();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));

    }


//    @Test (priority = 38, enabled = true)
//    public void transactionDetailPage() {
//        extentReport.createTest("When user Click on the Next button from Transaction page, User should be redirect to the Transaction Details page", "Transaction Details Page");
//        String result = LocalTransferWithFeePage.transactionDetailPage();
//        captureScreenshot("Transaction Page, Visibility Test");
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 39, enabled = true)
//    public void transactionDetailHeading() {
//        extentReport.createTest("When user Redirect at Transaction Details Page, The User should be able to see the Transaction Details ", "Transaction Details Heading");
//        String result = LocalTransferWithFeePage.transactionDetailHeading();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 40, enabled = true)
//    public void sendToHeadingTransactionPage() {
//        extentReport.createTest("When user Redirect at Transaction Details Page, The User should be able to see the send to Heading", "send to Heading");
//        String result = LocalTransferWithFeePage.sendToHeadingTransactionPage();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 41, enabled = true)
//    public void personNameTransactionPage() {
//        extentReport.createTest("When user Redirect at Transaction Details Page, The User should be able to see the Person Full name", "Person full name to Heading");
//        String result = LocalTransferWithFeePage.personNameTransactionPage();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 42, enabled = true)
//    public void phoneNumberTransactionPage() {
//        extentReport.createTest("When user Redirect at Transaction Details Page, The User should be able to see the phone number of User", "Phone number");
//        String result = LocalTransferWithFeePage.phoneNumberTransactionPage();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
////    @Test (priority = 44, enabled = true)
////    public void editButton_TransactionDetails() {
////        extentReport.createTest("When user Redirect at Transaction Details Page, The User should be able to see the edit button", "edit button");
////        String result = LocalTransferWithFeePage.editButton_TransactionDetails();
////        extentReport.logStepResult(result);
////
////        Assert.assertTrue(result.contains("Pass"));
////
////    }
//
//    @Test (priority = 43, enabled = true)
//    public void operatorHeading_TransactionDetails() {
//        extentReport.createTest("When user Redirect at Transaction Details Page, The User should be able to see the operator Heading", "operator Heading");
//        String result = LocalTransferWithFeePage.operatorHeading_TransactionDetails();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 44, enabled = true)
//    public void MLogo_TransactionDetails() {
//        extentReport.createTest("When user Redirect at Transaction Details Page, The User should be able to see the TigoPesa Logo", "Tigo Pesa Logo");
//        String result = LocalTransferWithFeePage.MLogo_TransactionDetails();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 45, enabled = true)
//    public void amountHeading_TransactionDetails() {
//        extentReport.createTest("When user Redirect at Transaction Details Page, The User should be able to see the Amount Heading", "Amount Heading");
//        String result = LocalTransferWithFeePage.amountHeading_TransactionDetails();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 46, enabled = true)
//    public void feeHeading_TransactionDetails() {
//        extentReport.createTest("When user Redirect at Transaction Details Page, The User should be able to see the Fee Vat Inclusive Heading", "Fee Vat Inclusive Heading");
//        String result = LocalTransferWithFeePage.feeHeading_TransactionDetails();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 47, enabled = true)
//    public void totalHeading_TransactionDetails() {
//        extentReport.createTest("When user Redirect at Transaction Details Page, The User should be able to see the Total Heading", "Total Heading");
//        String result = LocalTransferWithFeePage.totalHeading_TransactionDetails();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 48, enabled = true)
//    public void enterYourMixxPinHeading_TransactionDetails() {
//        extentReport.createTest("When user Redirect at Transaction Details Page, The User should be able to see the Enter Your TigoPesa PIN Heading", "Enter Your TigoPesa PIN Heading");
//        String result = LocalTransferWithFeePage.enterYourMixxPinHeading_TransactionDetails();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }

//    @Test (priority = 49, enabled = true)
//    public void confirmedButton_TransactionDetails() {
//        extentReport.createTest("When user Redirect at Transaction Details Page, The User should be able to see the CONFIRM Button", "CONFIRM button visible");
//        String result = LocalTransferWithFeePage.confirmedButton_TransactionDetails();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }


    @Test (priority = 50, enabled = true)
    public void clickOnConfirmedButton_TransactionDetails() {
        extentReport.createTest("User should be able to click on CONFIRM button", "CONFIRM Button Clickable");
        String result = LocalTransferWithFeePage.clickOnConfirmedButton_TransactionDetails();
        captureScreenshot("Click on Confirm button, Click Test");
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));

    }

    @Test (priority = 51, enabled = true)
    public void sendMoneyInsertPIN()throws IOException {
        extentReport.createTest("When user Enters the amount to transfer, User should be able to click on the Next Button", "Click on the Next button");
        String result = LocalTransferWithFeePage.sendMoneyInsertPIN();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));

    }



    @Test (priority = 52, enabled = true)
    public void clickConfirmedButton_TransactionDetails() {
        extentReport.createTest("User should be able to click on CONFIRM button", "CONFIRM Button Clickable");
        String result = LocalTransferWithFeePage.clickOnConfirmedButton_TransactionDetails();
        captureScreenshot("Click on Confirm button, Click Test");
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));

    }



//    @Test (priority = 33, enabled = true)
//    public void tapOnTheEnterPinField() {
//        extentReport.createTest("When user Redirect to the Transaction page, User should be able to click on the Enter Amount Field", "Send as gift money button");
//        String result = LocalTransferWithFeePage.tapOnTheEnterPinField();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }





    @Test (priority = 53, enabled = true)
    public void transactionReceipt_TransactionDetails() {
        extentReport.createTest("When user click on CONFIRM button the transaction Receipt should be visible", "Transaction Receipt Visible");
        String result = LocalTransferWithFeePage.transactionReceipt_TransactionDetails();
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));

    }
//
//    @Test (priority = 52, enabled = true)
//    public void transactionReceiptCrossButton() {
//        extentReport.createTest("At Transaction Receipt Cross button should be visible", "Cross Button");
//        String result = LocalTransferWithFeePage.transactionReceiptCrossButton();
//        captureScreenshot("Transaction Receipt, Visibility Test");
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 53, enabled = true)
//    public void mixxLogo_TransactionReciept() {
//        extentReport.createTest("At Transaction Receipt, the TigoPesa Logo should be visible", "tigoPesa Logo at Transaction Receipt");
//        String result = LocalTransferWithFeePage.mixxLogo_TransactionReciept();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//
//    }
//
//    @Test (priority = 54, enabled = true)
//    public void successfulTransferHeading_TransactionReciept() {
//        extentReport.createTest("At Transaction Receipt, the Successful Transfer Heading should be visible", "Successful Transfer Heading");
//        String result = LocalTransferWithFeePage.successfulTransferHeading_TransactionReciept();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//    @Test (priority = 55, enabled = true)
//    public void senderHeading_TransactionReciept() {
//        extentReport.createTest("Sender Heading should be visible at the Transaction receipt", "Sender Heading at Transaction receipt");
//        String result = LocalTransferWithFeePage.senderHeading_TransactionReciept();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//    @Test (priority = 56, enabled = true)
//    public void receiverHeading_TransactionReciept() {
//        extentReport.createTest("Receiver Heading should be visible at the Transaction receipt", "Receiver Heading at Transaction receipt");
//        String result = LocalTransferWithFeePage.receiverHeading_TransactionReciept();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//    @Test (priority = 57, enabled = true)
//    public void noteHeading_TransactionReciept() {
//        extentReport.createTest("Note Heading should be visible at the Transaction receipt", "Note Heading at Transaction receipt");
//        String result = LocalTransferWithFeePage.NoteHeading_TransactionReciept();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//    @Test (priority = 58, enabled = true)
//    public void downloadButton_TransactionReciept() {
//        extentReport.createTest("Download Button should be visible at the Transaction receipt", "Download Button at Transaction receipt");
//        String result = LocalTransferWithFeePage.downloadButton_TransactionReciept();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//    @Test (priority = 59, enabled = true)
//    public void shareButton_TransactionReciept() {
//        extentReport.createTest("Share Button should be visible at the Transaction receipt", "Share Button at Transaction receipt");
//        String result = LocalTransferWithFeePage.shareButton_TransactionReciept();
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
    @Test (priority = 54, enabled = true)
    public void clickOnCrossButton_TransactionReciept() {
        extentReport.createTest("At Transaction Receipt, Cross button should be visible", "Cross button");
        String result = LocalTransferWithFeePage.clickOnCrossButton_TransactionReciept();
        captureScreenshot("Click on Cross Button, Click Test");
        extentReport.logStepResult(result);

        Assert.assertTrue(result.contains("Pass"));
    }
//
//    @Test(priority = 61, enabled = true)
//    public void dashboardPageVisible()  {
//
//        extentReport.createTest("After the login User should be Redirect to the Dashboard Page", "Dashboard Page");
//        String result = DashboardPage.dashboardPageVisible();
//        captureScreenshot("Dashboard page, Visibility Test");
//        extentReport.logStepResult(result);
//
//        Assert.assertTrue(result.contains("Pass"));
//    }
//
//
//
//
//
//

}
