package com.selenium.waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitInSelenium {
	static WebDriver driver;
	public static void main(String[] args) {		
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;

		driver = new ChromeDriver();

		// Launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/" );

		//Maximizes the browser window
		driver.manage().window().maximize() ;

		//Get the actual value of the title
		aTitle = driver.getTitle();

		//Compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle)) {
			System.out.println( "Test Passed") ;
		} else {
			System.out.println( "Test Failed" );
		}
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(30)) 			
				.pollingEvery(Duration.ofSeconds(5))			
				.ignoring(NoSuchElementException.class);
		
		WebElement clickseleniumlink = wait.until(driver -> driver.findElement(By.xpath("//i[@class='icon-wrench']")));

		//Click on the selenium link
		clickseleniumlink.click();
		
		//Close browser
		driver.close() ;
	}
}
