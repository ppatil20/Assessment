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
import com.pages.LoginPage;

public class LoginTestCases extends baseClass{

LoginPage LoginPageObj;
	
	//Creation of method
	public void OpenUrl()
	{
	 driver.get("https://jobs.economist.com/");	
	}
	
	
	@Test
	public void LoginwithValidData() throws InterruptedException
	{
		OpenUrl();
		LoginPageObj = PageFactory.initElements(driver, LoginPage.class);
		LoginPageObj.clickSignInLink();
		Assert.assertEquals(driver.getCurrentUrl(), "https://jobs.economist.com/logon/");
//		Thread.sleep(5000);
	}
	
	@Test
	public void CreateAccountwithValidData() throws InterruptedException
	{
		OpenUrl();
		//Enter actual values in palce of attributes/parameters 
		LoginPageObj = PageFactory.initElements(driver, LoginPage.class);
		LoginPageObj.clickSignInLink();
		LoginPageObj.enterEmailId("palsangayaansh@gmail.com");
		LoginPageObj.enterPassword("Password@1234");
		
		//Sign in with above valid credentials
		LoginPageObj.clickSignInbutton();
		
		//Verify user is successfully registered with above values in respective fields
		Thread.sleep(5000);
		Assert.assertEquals(LoginPageObj.userSignedIn.getText(), "Ayaansh Patil");
		
		LoginPageObj.userSignedOut();
		Thread.sleep(5000);
	}
}
