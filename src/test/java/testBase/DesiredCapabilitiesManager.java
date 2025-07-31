package testBase;

import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.fileReader.DeviceData;
import utils.fileReader.DeviceDataReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;


// This class sets up the DesiredCapabilities for the AndroidDriver based on the device name.
public class DesiredCapabilitiesManager {
    private static final Logger logger = LogManager.getLogger(DesiredCapabilitiesManager.class);


    // This method returns the DesiredCapabilities for the specified device name.
    public static DesiredCapabilities getDesiredCapabilities(String deviceName) throws FileNotFoundException {
        logger.info("Setting up DesiredCapabilities for device: " + deviceName);

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


        // Fetch the device data based on the deviceName parameter from DeviceDataReader
        List<DeviceData> deviceDataList = DeviceDataReader.getDeviceData();
        DeviceData.Device device = null;
        for (DeviceData deviceData : deviceDataList) {
            if (deviceData.getDevice().getDeviceName().equals(deviceName)) {
                device = deviceData.getDevice();
                break;
            }
        }

        if (device == null) {
            logger.error("Device not found: " + deviceName);
            throw new FileNotFoundException("Device not found: " + deviceName);
        }


        // Set the desired capabilities based on the device data
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, device.getAutomationName());
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, device.getPlatformName());
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, device.getPlatformVersion());
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device.getDeviceName());
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, device.getUdid());
        desiredCapabilities.setCapability("autoGrantPermissions", device.getAutoGrantPermissions());

        desiredCapabilities.setCapability(MobileCapabilityType.APP, device.getApp());
        logger.info("DesiredCapabilities set up complete.");
        return desiredCapabilities;
    }

}


