package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();		
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("vishruth.cse@gmail.com");
		String valueAttr = driver.findElement(By.id("input-email")).getDomProperty("value");		
		System.out.println(valueAttr);
		
		String placeholderVal = driver.findElement(By.id("input-email")).getDomAttribute("placeholder");
		System.out.println(placeholderVal);	
		
		String nameVal = driver.findElement(By.id("input-email")).getDomProperty("name");
		System.out.println(nameVal);	
		
		driver.quit();		
	}
}
