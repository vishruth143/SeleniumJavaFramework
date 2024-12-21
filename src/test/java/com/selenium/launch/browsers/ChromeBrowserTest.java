package com.selenium.launch.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowserTest {
	
	public static void main(String[] args) {
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is: "+projectPath);			
		
		//Initialize the chrome driver using the webdriver manager
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();

		// Open a website
        driver.get("https://www.google.com");         
              
        // Quit the driver to end the session
        driver.quit();		
	}
}
