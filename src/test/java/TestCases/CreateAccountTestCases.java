/**
 * 
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
	
	//Creation of method
	public void OpenUrl()
	{
	 driver.get("https://jobs.economist.com/");	
	}
	
	
	@Test
	public void VerifySignInLink() throws InterruptedException
	{
		OpenUrl();
		createAccountPageObj = PageFactory.initElements(driver, CreateAccountPage.class);
		createAccountPageObj.clickCreateAccount();
		//Verify user is navigated to expected url passed as second parameter below
		Assert.assertEquals(driver.getCurrentUrl(), "https://jobs.economist.com/register/");
//		Thread.sleep(5000);
	}
	

	@Test
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
		createAccountPageObj.registerNotRobot();
		
		//Register user with above details
		createAccountPageObj.clickCreateAccount();
		
		//Verify user is successfully registered with above values in respective fields
		Assert.assertEquals(createAccountPageObj.userSignedIn.getText(), "Pallavi Patil");
		
//		Thread.sleep(3000);
	}

}
