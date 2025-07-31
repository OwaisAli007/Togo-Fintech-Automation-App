package testBase;

import com.google.common.io.Files;
import io.appium.java_client.android.AndroidDriver;

import io.qameta.allure.Allure;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.imgscalr.Scalr;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import utils.email.EmailSender;
import utils.reporter.ExtentReport;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Map;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.ByteArrayInputStream;




// This class sets up and tears down the test environment before and after each suite.
public class BaseClass {


    public static final ThreadLocal<AndroidDriver> driver = new ThreadLocal<>();
    public String deviceName;
    public ExtentReport extentReport;
    private EmailSender emailSender;
    private static final Logger logger = LogManager.getLogger(BaseClass.class);


    private long classStartTime;
    private long classEndTime;

    // This method sets up the test environment before each suite.
    @BeforeClass
    public void setUp(ITestContext context) throws IOException {
        classStartTime = System.nanoTime(); // Start stopwatch

        LocalDateTime start = LocalDateTime.now();
        String readableStart = start.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Allure.addAttachment("📍 Test Suite Start Time", readableStart);


        logger.info("Setting up test suite...");

        // Retrieve test parameters from the TestNG XML file
        Map<String, String> testParams = context.getCurrentXmlTest().getAllParameters();

        // Extract the deviceName parameter
        deviceName = testParams.get("deviceName");

        // Set up the AndroidDriver using the DriverManager class
        driver.set(DriverManager.getDriver(deviceName));
        context.setAttribute("driver", driver);

        extentReport = new ExtentReport(driver.get());
        emailSender = new EmailSender(driver);
        extentReport.createReport();

        // Set the implicit wait timeout to 10 seconds
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        logger.info("Test suite setup complete.");


    }

    // This method tears down the test environment after each suite.
    @AfterSuite
    public void tearDown() throws MalformedURLException, FileNotFoundException {
        classEndTime = System.nanoTime(); // Stop stopwatch
        long totalDurationMillis = (classEndTime - classStartTime) / 1_000_000;
        String totalTime = "Total Execution Time for the Class: " + totalDurationMillis + " ms";
        logger.info(totalTime);
        Allure.addAttachment("Execution Duration (Stopwatch)", totalTime);





        LocalDateTime end = LocalDateTime.now();
        String readableEnd = end.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Allure.addAttachment("✅ Test Suite End Time", readableEnd);

        String startTime = "Start Time (ms): " + classStartTime;
        String endTime = "End Time (ms): " + classEndTime;

        logger.info(startTime);
        logger.info(endTime);
        logger.info(totalTime);

        // 🔽 Add to Allure report
        Allure.addAttachment("Start Time", startTime);
        Allure.addAttachment("End Time", endTime);
        Allure.addAttachment("Execution Duration", totalTime);

        extentReport.logStepResult(totalTime); // Optional: for ExtentReports



        // Finalize and generate the extent report by flushing any pending logs and resources.
        extentReport.flushReport();

        /* *********************
         * Uncomment the below code when you need to send the extent report via email
         * */

        File reportPath = new File("src/test/resources/reports/spark.html");
        emailSender.sendEmail(
                "Automation Test Report",
                "Please find the attach spark.html file in attachments"
                , reportPath);


        // Close the application and terminate the driver session
        DriverManager.getDriver(deviceName).quit();
        logger.info("Test suite teardown complete.");
    }

    public void captureScreenshot(String name) {
        try {
            AndroidDriver driverInstance = driver.get();
            byte[] screenshot = ((TakesScreenshot) driverInstance).getScreenshotAs(OutputType.BYTES);

            // Resize the screenshot
            BufferedImage originalImage = ImageIO.read(new ByteArrayInputStream(screenshot));
            BufferedImage resizedImage = Scalr.resize(originalImage, 300); // Resize to width of 800 pixels

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(resizedImage, "png", baos);
            byte[] resizedScreenshot = baos.toByteArray();

            Allure.addAttachment(name, "image/png", new ByteArrayInputStream(resizedScreenshot), "png");
        } catch (IOException e) {
            logger.error("Failed to capture screenshot: " + e.getMessage());
        }
    }





}