package com.raghib.pomwithoutpagefactory;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.raghib.pom.pages.GoogleSearchPageObjects;

/*CREATE CLASS FOR TEST CASE*/
public class GoogleSearchPageObjectsTest {

	private static WebDriver webDriverObj = null;
	
	@Test
	public static void executeTest() throws Exception {
		// Chrome Browser
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"browserdrivers"+File.separator+"chromedriver_win32"+File.separator+"chromedriver.exe");
		webDriverObj = new ChromeDriver();
		
		/*CREATE OBJECT FOR PAGE CLASS*/
		GoogleSearchPageObjects googleSearchPageObjects = new GoogleSearchPageObjects(webDriverObj);
		webDriverObj.get("https://www.google.com/");
		
		/*REFER ACTION METHODS*/
		googleSearchPageObjects.setTextInSearchBox("A B C D");
		googleSearchPageObjects.setInSearchButton();
		
		Thread.sleep(3000);
		webDriverObj.quit();
	}
}
