package utils;

import io.appium.java_client.android.AndroidDriver; // Use AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverUtils {
    private static AndroidDriver driver; // ? Use AndroidDriver

    public static void initializeDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Users\\us\\Downloads\\latest.apk");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Test_Wallet");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.wallet.crypto.trustapp");
        capabilities.setCapability("appActivity", "com.wallet.crypto.trustapp.ui.app.AppActivity");
        capabilities.setCapability("noReset", false);

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Appium server URL is invalid", e);
        }
    }

    public static AndroidDriver getDriver() { 
        if (driver == null) {
            throw new IllegalStateException("Driver not initialized. Please call initializeDriver first.");
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}