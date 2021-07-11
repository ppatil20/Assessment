// Basic setup to initiate dependencies using Maven
package com.baseClass;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	public static WebDriver driver;
	// Defining on which browser to run the test cases
	protected static String browser = "chrome";

	
	// Initiating drivers before running each test case and opening the browser to run the test case
	@BeforeClass
	public static void setUp() throws IOException, AWTException {

		String executeOnbrowser = browser;
		if (executeOnbrowser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
////	if (headlessBrowser == true) {
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200",
//	"--ignore-certificate-errors");
//	driver = new ChromeDriver(options);
//	} 

			driver = new ChromeDriver();

		} else if (executeOnbrowser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
//	if (headlessBrowser == true) {
//	FirefoxOptions options = new FirefoxOptions();
//	options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200",
//	"--ignore-certificate-errors");
//	driver = new FirefoxDriver(options);
//	} 

			driver = new FirefoxDriver();

		} else {
			WebDriverManager.chromedriver().setup();
//	if (headlessBrowser == true) {
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200",
//	"--ignore-certificate-errors");
//	driver = new ChromeDriver(options);
//	} 
			{
				driver = new ChromeDriver();
			}
		}
		if ((driver != null) && (!driver.toString().contains("(null)"))) {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.navigate().refresh();
		} else {
			System.out.println("Driver not initialized.");
			System.exit(0);
		}
	}
	
	// This is to close the browser once the test case is run
	@AfterClass
	public static void closeBrowser() throws IOException 
	{
	if ((driver != null) && (!driver.toString().contains("(null)"))) {
	driver.quit();
	}
	}
}
