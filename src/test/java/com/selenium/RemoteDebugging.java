package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoteDebugging {	
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("debuggerAddress", "127.0.0.1:9111");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Google");
	}
}
