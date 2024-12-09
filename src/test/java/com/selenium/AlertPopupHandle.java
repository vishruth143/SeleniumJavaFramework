package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupHandle {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message.");
		} else {
			System.out.println("Incorrect alert message.");
		}
		
		alert.accept(); //click on OK btn
		// alert.dismiss(); //click on Cancel btn
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
