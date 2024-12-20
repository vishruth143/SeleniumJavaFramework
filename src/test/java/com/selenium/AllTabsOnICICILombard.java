package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTabsOnICICILombard {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.icicilombard.com/");
		
		List<WebElement> tabs = driver.findElements(By.xpath("//ul[@class='menu-list']/li/a"));
		
		for(WebElement tab:tabs) {
			String tabName = tab.getText();			
            if (!tabName.isEmpty()) { // To ignore empty elements
            	tabName = tabName.replace("\n", " ");
                System.out.println(tabName);
            }
		}
		
		driver.quit();
	}
}
