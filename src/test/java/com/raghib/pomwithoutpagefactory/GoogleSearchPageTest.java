package com.raghib.pomwithoutpagefactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.raghib.pom.pages.GoogleSearchPage;

public class GoogleSearchPageTest {
	private static WebDriver webDriverObj = null;
	
	@Test
	public static void executeTest() throws Exception {
		
		try {
			// Chrome Browser
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"browserdrivers"+File.separator+"chromedriver_win32"+File.separator+"chromedriver.exe");
			webDriverObj = new ChromeDriver();
			webDriverObj.manage().window().maximize();
			
			webDriverObj.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
			webDriverObj.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			webDriverObj.get("https://www.google.com/");
			GoogleSearchPage.textBoxSearch(webDriverObj).sendKeys("pom in selenium");
			GoogleSearchPage.buttonSearch(webDriverObj).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			webDriverObj.quit();			
		}
	}
}