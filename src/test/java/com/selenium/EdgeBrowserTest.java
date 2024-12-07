package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowserTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Initialize the edge driver using the webdriver manager
		WebDriverManager.edgedriver().setup();		
		WebDriver driver = new EdgeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Open a website
        driver.get("https://www.google.com");         
              
        // Quit the driver to end the session
        driver.quit();
	}

}
