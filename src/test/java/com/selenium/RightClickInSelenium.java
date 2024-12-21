package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RightClickInSelenium {

	public static void main(String[] args) {		
//		String projectPath=System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co = new ChromeOptions();
//		co.setBinary(projectPath+"/chrome-win64/chrome.exe");
//		WebDriver driver = new ChromeDriver(co);
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		action.contextClick(ele).perform();
		driver.findElement(By.xpath("//span[normalize-space()='Edit']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		driver.quit();
	}
}
