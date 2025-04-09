package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://phptravels.com/");
        driver.findElement(By.partialLinkText("View Pricing")).click();
        Assert.assertTrue(driver.getTitle().equals("Phptravels Plans & Pricing | One Time Payment"));
        Thread.sleep(2000);

        driver.quit();
    }

    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://phptravels.com/");
        driver.findElement(By.partialLinkText("Try Demo")).click();
        Assert.assertTrue(driver.getTitle().equals("Book Your Free Demo Now - Phptravels"));

        driver.quit();
    }
}
