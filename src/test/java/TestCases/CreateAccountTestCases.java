/**
 *This class mainly is created to write the test scripts for testcases related to Create Account page
 *TestNG is used for running the testcases and reporting 
 */
/**
 * @author patil_pa
 *
 */
package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.baseClass.baseClass;
import com.pages.CreateAccountPage;

public class CreateAccountTestCases extends baseClass {
	
	CreateAccountPage createAccountPageObj;
	
//	Creation of method
//	Navigation to "The Economist Jobs" page
	public void OpenUrl()
	{
	 driver.get("https://jobs.economist.com/");	
	}
	
	
	@Test
//	Testcase to verify navigation on clicking "Create Account" link
	public void VerifySignInLink() throws InterruptedException
	{
		OpenUrl();
		createAccountPageObj = PageFactory.initElements(driver, CreateAccountPage.class);
		createAccountPageObj.clickCreateAccountLink();
//		Verify user is navigated to expected url passed as second parameter below
		Assert.assertEquals(driver.getCurrentUrl(), "https://jobs.economist.com/register/");
		Thread.sleep(5000);
	}
	
	
	@Test
//	Testcase to verify navigation on clicking "The Economist" logo
	public void VerifyTheEconomist() throws InterruptedException
	{
		OpenUrl();
		createAccountPageObj = PageFactory.initElements(driver, CreateAccountPage.class);
		createAccountPageObj.clickTheEconomistLogo();
		//Verify user is navigated to expected url passed as second parameter below
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.economist.com/");
		Thread.sleep(5000);
	}
	
	
	@Test
//	Testcase to verify search on Jobs page
	public void VerifySearchJobs() throws InterruptedException
	{
		OpenUrl();
		createAccountPageObj = PageFactory.initElements(driver, CreateAccountPage.class);
		createAccountPageObj.enterSearchKeywords("Lead");
		createAccountPageObj.enterSearchLocation("India (IN)");
		createAccountPageObj.clickSearch();
		//Verify user is navigated to expected url passed as second parameter below
		Assert.assertEquals(driver.getCurrentUrl(), "https://jobs.economist.com/searchjobs/?LocationId=73&keywords=lead&radialtown=India+(IN)&radiallocation=5&countrycode=GB");
		Thread.sleep(5000);
	}
	
	
	@Test
//	Testcase to verify Create Account/Register User
	public void CreateAccountwithValidData() throws InterruptedException
	{
		OpenUrl();
		//Enter actual values in palce of attributes/parameters 
		createAccountPageObj = PageFactory.initElements(driver, CreateAccountPage.class);
		createAccountPageObj.clickSignInLink();
		createAccountPageObj.enterTitle("Mrs.");
		createAccountPageObj.enterFirstName("Pallavi");
		createAccountPageObj.enterLastName("Patil");
		createAccountPageObj.enterRegisEmailId("pallavigiddanavar@gmail.com");
		createAccountPageObj.enterRegisPassword("Password@1234");
		createAccountPageObj.enterConfirmPassword("Password@1234");
		createAccountPageObj.checkKeepMeSignedIn();
		createAccountPageObj.checkTermsandConditions();
		//Unable to automate Google Captcha for create account
		createAccountPageObj.registerNotRobot();
		Thread.sleep(7000);
		//Register user with above details
		createAccountPageObj.createAnAccount();
		Thread.sleep(5000);
		//Verify user is successfully registered with above values in respective fields
		Assert.assertEquals(createAccountPageObj.userSignedIn.getText(), "Pallavi Patil");
		createAccountPageObj.userSignedOut();
		Thread.sleep(5000);
		
	}

}
