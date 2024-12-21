package com.selenium.waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitInSelenium {
	public static void main(String[] args) {
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String eTitle = "Demo Guru99 Page";
		String aTitle = "";
		
		// launch Chrome and redirect it to the Base URL		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		// Maximizes the browser window
		driver.manage().window().maximize();
		
		// Get the actual value of the title
		aTitle=driver.getTitle();
		
		// Compare the actual title with the expected title
		if(aTitle.equals(eTitle)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		// close browser
		driver.quit();
	}
}
