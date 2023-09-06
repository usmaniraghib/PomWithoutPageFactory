package com.raghib.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	private static WebElement webElementObj = null;
	
	public static WebElement textBoxSearch(WebDriver driver) {
		webElementObj = driver.findElement(By.xpath("//*[@id='APjFqb']"));
		return webElementObj;		
	}
	
	public static WebElement buttonSearch(WebDriver driver) {
		webElementObj = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//center//input[@class='gNO89b']"));
		return webElementObj;		
	}
}
