package com.raghib.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/*CREATE A CLASS FOR EACH WEB PAGE*/
public class GoogleSearchPageObjects {
	
	private WebDriver webDriverObj = null;
	
	public GoogleSearchPageObjects(WebDriver webDriverObj){
		this.webDriverObj = webDriverObj;
	}
	
	//OBJECT LOCATORS
	By textBoxSearch = By.xpath("//input[@name='q']");
	By buttonSearch = By.xpath("//input[@class='gLFyf']");
	
	
	//ACTION METHODS
	public void setTextInSearchBox(String text) {
		webDriverObj.findElement(textBoxSearch).sendKeys(text);
	}
	
	public void setInSearchButton() {
		webDriverObj.findElement(buttonSearch).sendKeys(Keys.ENTER);
	}
}
