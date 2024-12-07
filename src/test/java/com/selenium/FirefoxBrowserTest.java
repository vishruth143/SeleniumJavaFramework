package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxBrowserTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Initialize the firefox driver using the webdriver manager
		WebDriverManager.firefoxdriver().setup();		
		WebDriver driver = new FirefoxDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Open a website
        driver.get("https://www.google.com");         
              
        // Quit the driver to end the session
        driver.quit();
	}

}
