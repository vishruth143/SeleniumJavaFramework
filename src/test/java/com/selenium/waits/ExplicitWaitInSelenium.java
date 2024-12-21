package com.selenium.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class ExplicitWaitInSelenium {
	static WebDriver driver;
	public static void main(String[] args) {		
		driver = new ChromeDriver(); 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		
		// Launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/" );
		
		//Maximizes the browser window
		driver.manage().window().maximize();
		
		//Get the actual value of the title
		aTitle = driver.getTitle();
		
		//Compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle)) {
			System.out.println( "Test Passed") ;
		}
		else {
			System.out.println( "Test Failed" );
		}
		WebElement guru99seleniumlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//i[@class='icon-wrench']")));
		guru99seleniumlink.click();
		
		driver.quit();
	}
}
