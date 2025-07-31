package pages.Login;
/*
 * This is just a example page class you can modify the package and class according to the your mobile app
 *
 * */

import io.appium.java_client.android.AndroidDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.seleniumUtils.SeleniumUtils;

import java.io.IOException;


// This class represents the example page.
public class LoginPage extends SeleniumUtils {
    private static final Logger logger = LogManager.getLogger(LoginPage.class);

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }


    /**
     * Clicks on the number nine button and returns the result.
     *
     * @return The result of the operation.
     */

    public String pageMethod(String info) {
        String result = "";
        if (info.equalsIgnoreCase("Pass")) {
            result = "Pass, Working.";
        } else if (info.equalsIgnoreCase("Fail")) {
            result = "Fail, Not Working.";
        }
        return result;
    }


    //1st Scenario
    public String tapOnContinue() throws IOException {

        By locater = By.xpath("//android.widget.ImageView[@content-desc=\"Continuer\"]");
        try {
            click(locater);
            result = "Pass, continue Button is clickable ";
        } catch (IOException e) {
            result = "Fail, continue button is Not clickable ";
        }
        return result;
    }


    //2nd Scenario
    public String insertNumber() throws IOException {
        By locater = By.xpath("//android.widget.EditText");
        try {
            sendKeys(locater, "90009082");
            result = "Pass, Enter number Successfully";
        } catch (IOException e) {
            result = "Fail, Enter number Not Successfully";
            throw new RuntimeException(e);
        }
        return result;
    }


    //3rd Scenario
    public String continueButton() throws IOException {
        By locater = By.xpath("//android.view.View[@content-desc=\"Confirmer\"]\n");
        try {
            click(locater);
            result = "Pass, Continue Button is clickable ";
        } catch (IOException e) {
            result = "Fail, Continue button is Not clickable ";
//            throw new RuntimeException(e);
        }
        return result;
    }


    //4th Scenario
    public String insertPIN() throws IOException {

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

    //5th Scenario
    public String seConnecterButton() throws IOException {
        By locater = By.xpath("//android.view.View[@content-desc=\"Se connecter\"]");
        try {
            click(locater);
            result = "Pass, Next Button is clickable ";
        } catch (IOException e) {
            result = "Fail, Next button is Not clickable ";
//            throw new RuntimeException(e);
        }
        return result;
    }


    //6th Scenario
    public String tapOnSauterButtton() throws IOException {
        By locater = By.xpath("//android.view.View[@content-desc=\"Sauter pour l'instant\"]");
        try {
            click(locater);
            result = "Pass, Skip Button is clickable ";
        } catch (IOException e) {
            result = "Fail, Skip button is Not clickable ";
//            throw new RuntimeException(e);
        }
        return result;
    }

    //7th Scenario

    public String dashboardVisible() throws IOException {
        By locater = By.xpath("//android.view.View[@content-desc=\"Solde disponible\"]");
        try {
            if (isDisplayed(locater)) {
                result = "Pass, Dashboard is visible";
            }
        } catch (IOException e) {
            result = "Fail, Dashboard is Not visible";

        }
        return result;
    }



























}
