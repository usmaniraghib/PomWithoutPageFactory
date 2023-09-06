package com.raghib.pomwithoutpagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.raghib.pom.pages.GoogleSearchPageObjects;
import com.raghib.selenium.BaseClass;

/*CREATE CLASS FOR TEST CASE*/

public class GoogleSearchPageObjectsTest extends BaseClass {

	private static WebDriver driver = null;
	public static String browserName = "chrome";
	public static String browserVersion = "116";

	public static String url = "https://www.google.com/";

	@Test
	public static void executeTest() throws Exception {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		/* CREATE OBJECT FOR PAGE CLASS */
		GoogleSearchPageObjects googleSearchPageObjects = new GoogleSearchPageObjects(driver);
		driver.get(url);

		/* REFER ACTION METHODS */
		googleSearchPageObjects.setTextInSearchBox("A B C D");
		googleSearchPageObjects.setInSearchButton();

		Thread.sleep(3000);
		BaseClass.quitDriver();
	}
}