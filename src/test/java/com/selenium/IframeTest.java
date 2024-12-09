package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeTest {
	public static void main(String[] args) {
		//Initialize the chrome driver using the webdriver manager
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();

		// Open a website
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm"); 
        
        //driver.switchTo().frame("iframeResult");
        
        WebElement elem = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(elem);
        
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();     
        
        driver.quit();
	}

}
