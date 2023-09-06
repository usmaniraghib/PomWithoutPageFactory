package com.raghib.pomwithoutpagefactory;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.raghib.pom.pages.GoogleSearchPage;
import com.raghib.selenium.BaseClass;

public class GoogleSearchPageTest extends BaseClass {
	
	private static WebDriver driver = null;
	public static String browserName = "chrome";
	public static String browserVersion = "116";
	
	public static String url = "https://www.google.com/";
	
	@Test
	public static void executeTest() throws Exception {		
		try {
			// Chrome Browser
			driver = BaseClass.getDriver(browserName, browserVersion);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.get(url);
			GoogleSearchPage.textBoxSearch(driver).sendKeys("pom in selenium");
			GoogleSearchPage.buttonSearch(driver).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			BaseClass.quitDriver();			
		}
	}
}