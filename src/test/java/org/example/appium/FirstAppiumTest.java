package org.example.appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.URI;
import java.net.URL;

public class FirstAppiumTest {
    AndroidDriver driver;

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void firstTest() {
        try {
            URL url = new URI("http://127.0.0.1:4723").toURL();

            UiAutomator2Options options = new UiAutomator2Options()
                    .setPlatformName("Android")
                    .setAppPackage("io.appium.android.apis")
                    .setAppActivity("io.appium.android.apis.ApiDemos")
                    .noReset();

            driver = new AndroidDriver(url, options);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("First test");
        driver.findElement(AppiumBy.accessibilityId("App")).click();

        Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Action Bar")).isDisplayed());
    }


}
