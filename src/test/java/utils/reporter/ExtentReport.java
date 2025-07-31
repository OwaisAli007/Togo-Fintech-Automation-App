//package utils.reporter;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import io.appium.java_client.android.AndroidDriver;
//import org.apache.commons.io.IOUtils;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Base64;
//
//
//public class ExtentReport {
//
//    private static final Logger logger= LogManager.getLogger(ExtentReport.class);
//
//    private ExtentReports extentReports;
//    private ExtentSparkReporter extentSparkReporter;
//    private ExtentTest extentTest;
//
//    // Constructor
//    public ExtentReport(ThreadLocal<AndroidDriver> driver) {
//        extentReports = new ExtentReports();
//    }
//
//    // Creates the report
//    public void createReport() {
//        extentSparkReporter = new ExtentSparkReporter("src/test/resources/reports/spark.html");
//        extentReports.attachReporter(extentSparkReporter);
//    }
//
//    // Creates a new test in the report
//    public void createTest(String testName, String testDescription){
//        extentTest = extentReports.createTest(testName,testDescription);
//    }
//
//    // Logs a passed test step
//    public void testPass(String passInfo){
//        extentTest.pass(passInfo);
//    }
//
//    // Logs a failed test step
//    public void testFail(String failInfo){
//        try {
//            String screenshotPath = "src/main/resources/screenShots/screenShot.png";
//            InputStream in = new FileInputStream(screenshotPath);
//            byte[] imageBytes = IOUtils.toByteArray(in);
//            String base64 = Base64.getEncoder().encodeToString(imageBytes);
//
//            extentTest.fail(failInfo, MediaEntityBuilder.createScreenCaptureFromPath("data:image/png;base64,"+base64).build());
//        } catch (IOException e) {
//            logger.error("Error while adding screenshot for failed test", e);
//        }
//    }
//
//    // Logs a skipped test step
//    public void testSkip(String reasonToSkip){
//        extentTest.skip(reasonToSkip);
//    }
//
//    // Logs an informational message
//    public void testInfo(String testInfo){
//        extentTest.info(testInfo);
//    }
//
//    // Logs the result of a test step
//    public void logStepResult(String stepResult){
//        if (stepResult.contains("Pass")){
//            testPass(stepResult);
//        } else if (stepResult.contains("Fail")) {
//            testFail(stepResult);
//        }else {
//            testInfo(stepResult);
//        }
//    }
//
//    // Flushes the report and deletes the screenshot file
//    public void flushReport(){
//        extentReports.flush();
//        String screenshotPath = "src/main/resources/screenShots/screenShot.png";
//        // Delete the screenshot file
//        File screenshotFile = new File(screenshotPath);
//        if (screenshotFile.delete()) {
//            logger.info("Screenshot file deleted successfully.");
//        } else {
//            logger.error("Failed to delete the screenshot file.");
//        }
//
//
//    }
//}



//================================================== FINAL=======================================================




package utils.reporter;

import io.appium.java_client.android.AndroidDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.gherkin.model.And;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Given;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.gherkin.model.Then;
import com.aventstack.extentreports.gherkin.model.When;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Media;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.status.StatusListener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

import static testBase.BaseClass.driver;

public class ExtentReport {

    private ExtentReports extentReports;
//    public static ThreadLocal<AndroidDriver> driver = new ThreadLocal<>();
    private ExtentSparkReporter extentSparkReporter;
    public static ExtentTest extentTest;

    Markup mark = new Markup() {

        @Override
        public String getMarkup() {
            // TODO Auto-generated method stub
            return null;
        }
    };


    public ExtentReport(AndroidDriver driver) {
        extentReports = new ExtentReports();
        this.extentTest = extentTest;
//        extentReports = new ExtentReports();
//        extentSparkReporter = new ExtentSparkReporter("src/test/resources/reports/spark.html");
//        extentSparkReporter.config().setReportName("Automation Research.");
//        extentSparkReporter.config().setTheme(Theme.DARK);
//        extentSparkReporter.config().setDocumentTitle("Automation Research Report.");
//        extentReports.attachReporter(extentSparkReporter);
    }

    // Creates the report
    public void createReport() {
        extentSparkReporter = new ExtentSparkReporter("src/test/resources/reports/spark.html");
        extentSparkReporter.config().setReportName("Automation Research.");
        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setDocumentTitle("Automation Research Report.");

        //extentSparkReporter.config().setCss(".node.level-1  ul{ display:none;} .node.level-1.active ul{display:block;}  .card-panel.environment  th:first-child{ width:30%;}");
        //extentSparkReporter.config().setJs("$(window).off(\\\"keydown\\\");");
        extentReports.attachReporter(extentSparkReporter);

//		System.out.println("Template Model."+extentSparkReporter.getTemplateModel());
//		System.out.println("Document Title."+extentSparkReporter.config().getDocumentTitle());
//		System.out.println("Report Name."+extentSparkReporter.config().getReportName());
    }

    // Creates a new test in the report
    public void createTest(String testName, String testDescription) {
        //extentReports.setSystemInfo("Jazz Red.", "Android App.");
        extentTest = extentReports.createTest(testName, testDescription);


        //extentTest = extentReports.createTest(Feature.class, testName);
        extentTest = extentTest.createNode(Scenario.class, testName);
        //	extentTest = extentTest.createNode(Given.class, testName);
//		extentTest = extentTest.createNode(And.class, testName);
//		extentTest = extentTest.createNode(When.class, testName);
//		extentTest = extentTest.createNode(Then.class, testName);

    }

    // Logs a passed test step
    public void testPass(String passInfo) {
        try {
            extentTest.assignAuthor("Pass");
            extentTest.assignCategory("Pass");
            extentTest.assignDevice("Pass");
            extentTest.pass(mark);
            extentTest.log(Status.PASS,
                    MarkupHelper.createLabel("Test Case PASSED", ExtentColor.GREEN));
            extentTest.pass(passInfo);
            extentTest.pass(MarkupHelper.createCodeBlock(passInfo));
            getFailedElementScreenShot();
            String base64Image = createBase64Image();
            extentTest.pass(passInfo, MediaEntityBuilder.createScreenCaptureFromPath("data:image/png;base64," + base64Image).build());
            extentTest.pass(MediaEntityBuilder.createScreenCaptureFromPath("data:image/png;base64," + base64Image).build());
        } catch (IOException e) {

        }
    }

    // Logs a failed test step
    public void testFail(String failInfo) {

        try {
            extentTest.assignCategory("FAIL");
            extentTest.assignDevice("FAIL");
            System.out.println("Fail Started.");
            getFailedElementScreenShot();

            //1
            extentTest.log(Status.FAIL,
                    MarkupHelper.createLabel("Test case FAILED due to below issues:", ExtentColor.RED));
            //2
//            extentTest.fail(mark);
            String base64Image = createBase64Image();
            //3
            extentTest.log(Status.FAIL, "Test case FAILED due to below issues: ");
//4
//            extentTest.fail(failInfo);
            //5
//            extentTest.fail(MarkupHelper.createCodeBlock(failInfo + "\nException: " + Thread.currentThread().getStackTrace()));
            //6
            extentTest.fail(failInfo,
                    MediaEntityBuilder.createScreenCaptureFromPath("data:image/png;base64," + base64Image).build());
            System.out.println("Fail Finished.");
        } catch (IOException e) {

            //extentTest.fail(e , null);
        }
    }

    // Logs a skipped test step
    public void testSkip(String reasonToSkip) {
        try {
            extentTest.assignCategory("SKIP");
            extentTest.assignDevice("SKIP");
            extentTest.skip(mark);
            extentTest.log(Status.SKIP,
                    MarkupHelper.createLabel("Test Case SKIPPED", ExtentColor.ORANGE));
            extentTest.skip(reasonToSkip);
            extentTest.skip(MarkupHelper.createCodeBlock(reasonToSkip));
            getFailedElementScreenShot();
            String base64Image = createBase64Image();
            extentTest.skip(reasonToSkip, MediaEntityBuilder.createScreenCaptureFromPath("data:image/png;base64," + base64Image).build());
            extentTest.skip(MediaEntityBuilder.createScreenCaptureFromPath("data:image/png;base64," + base64Image).build());
            //extentTest.skip(result.getThrowable());
        } catch (IOException e) {

        }
    }

    // Logs an informational message
    public void testInfo(String testInfo) {
        extentTest.assignCategory("Info");
        extentTest.assignDevice("Info");
        //extentTest.log(Status.INFO, mark);
        extentTest.log(Status.INFO, MarkupHelper.createCodeBlock(testInfo));
        try {
            extentTest.info(mark);
            extentTest.log(Status.INFO,
                    MarkupHelper.createLabel("Test Case Information", ExtentColor.YELLOW));
            extentTest.info(testInfo);
            extentTest.info(MarkupHelper.createCodeBlock(testInfo));
            getFailedElementScreenShot();
            String base64Image = createBase64Image();
            extentTest.info(testInfo, MediaEntityBuilder.createScreenCaptureFromPath("data:image/png;base64," + base64Image).build());
            extentTest.info(MediaEntityBuilder.createScreenCaptureFromPath("data:image/png;base64," + base64Image).build());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Logs the result of a test step
    public void logStepResult(String stepResult) {
        if (stepResult.contains("Pass")) {
            testPass(stepResult);
        } else if (stepResult.contains("Fail")) {
            testFail(stepResult);

        } else {
            testInfo(stepResult);
        }
    }

    // Flushes the report and deletes the screenshot file
    public void flushReport() {
        extentReports.flush();
        String screenshotPath = "src/test/resources/screenShots/screenShot.png";
        // Delete the screenshot file
        File screenshotFile = new File(screenshotPath);
        if (screenshotFile.delete()) {
            System.out.println("Screenshot file deleted successfully.");
            // logger.info("Screenshot file deleted successfully.");
        } else {
            // logger.error("Failed to delete the screenshot file.");
            System.out.println("Failed to delete the screenshot file.");
        }
    }

    public String createBase64Image() throws IOException {
//        String screenshotPath = "src/test/resources/reports/spark.html.png";
        String screenshotPath = "src/test/resources/screenShots/screenShot.png";

        InputStream in = null;
        try {
            in = new FileInputStream(screenshotPath);
            System.out.println("File found first time");
        } catch (Exception e) {
            getFailedElementScreenShot();
        }
        if (in == null) {
            try {
                Thread.sleep(1000);
                in = new FileInputStream(screenshotPath);
                System.out.println("File found second time");
            } catch (Exception e) {
                System.out.println("File not found second time");
                e.printStackTrace();
            }
        }
        byte[] imageBytes;
        try {
            imageBytes = IOUtils.toByteArray(in);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Base64.getEncoder().encodeToString(imageBytes);
    }

    public void getFailedElementScreenShot() throws IOException {

//		    	  File srcFile = driver.getScreenshotAs(OutputType.FILE);
//		    	    //String filename = UUID.randomUUID().toString();
//		    	    File targetFile = new File("src/test/resources" + "/screenshots/" + "screenShot" + ".png");
//		    	    try {
//		    	        FileUtils.copyFile(srcFile, targetFile);
//		    	    } catch (IOException e) {
//		    	        e.printStackTrace();
//		    	    }


        String fileName = "screenShot.png";
        String pathToSaveFile = "src/test/resources/screenShots/" + fileName;
        try {
            var getScreenShot = (TakesScreenshot) driver.get();
            File screenShot = getScreenShot.getScreenshotAs(OutputType.FILE);
            Files.move(screenShot, new File(pathToSaveFile));
        } catch (Exception exception) {

            throw exception;
        }
    }
}
//================================================== FINAL=======================================================


