package com.selenium.screeshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotHandle {
    static WebDriver driver;

    public static void main(String[] args) {
        // Set up the WebDriver instance
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");

        try {
            takeScreenShot("Google_HomePage");
        } catch (IOException e) {
            System.out.println("Failed to take screenshot: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }

    public static void takeScreenShot(String fileName) throws IOException {
        // 1. Take screenshot and store it as a file format
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // 2. Now copy the screenshot to the desired location using copyFile method
        FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/src/test/java/com/selenium/Screenshots/" + fileName + ".jpg"));
    }
}
