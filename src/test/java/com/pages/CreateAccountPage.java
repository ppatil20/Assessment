/**
 * 
 */
package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.baseClass;

/**
 * @author patil_pa
 * This class consists of Locators and Page methods wrt Create Account Page(POM)
 * (This can also be done using separate classes for pages and locators and importing relevant classes required)  
 */
public class CreateAccountPage extends baseClass{
	
	// The locators of CraeteAccount page UI elements
	
	@FindBy(how = How.XPATH, using = "//*[text() = 'Sign in']")
	public WebElement singInLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Create account')]")
	public WebElement createAccountLink;

	@FindBy(how = How.XPATH, using = "//input[@id='title']")
	public WebElement registerTitle;
	
	@FindBy(how = How.XPATH, using = "//input[@id='firstname']")
	public WebElement registerFirstName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='lastname']")
	public WebElement registerLastName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='emailaddress']")
	public WebElement registerEmailID;
	
	@FindBy(how = How.XPATH, using = "//input[@id='regpassword']")
	public WebElement registerPassword;
	
	@FindBy(how = How.XPATH, using = "//input[@id='confirmpassword']")
	public WebElement registerConfirmPassword;
	
	@FindBy(how = How.XPATH, using = "//input[@id='rememberme-register']")
	public WebElement keepMeSignedIn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='agreeTermsAndConds']")
	public WebElement registerTermsandConditions;
	
	@FindBy(how = How.XPATH, using = "//input[@id='recaptcha-anchor-label']")
	public WebElement registerNotRobot;
	
	@FindBy(how = How.XPATH, using = "//*[text(),'Create an account')]")
	public WebElement createAnAccountButton;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Pallavi Patil')]")
	public WebElement userSignedIn;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign out')]")
	public WebElement userSignedOut;
	
	//Constructor
	public CreateAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods using the respective locators (This can also be done using separate classes for pages and locators) 
	//Navigates to SignIn page
	public void clickSignInLink() 
	{		
		singInLink.click();				
	}
	
	//Navigates to CreateAccount/Registration page
		public void clickCreateAccount() 
		{		
			createAccountLink.click();				
		}
		
	//Enter Title of user in registration page	
		public void enterTitle(String Title)
		{
			
			registerTitle.clear();
			registerTitle.sendKeys(Title);
		}	
		
	//Enter FirstName of user in registration page
		public void enterFirstName(String FirstName)
		{
			registerFirstName.clear();
			registerFirstName.sendKeys(FirstName);
		}
	
	//Enter LastName of user in registration page
		public void enterLastName(String LastName)
		{
			registerLastName.clear();
			registerLastName.sendKeys(LastName);
		}

	//Enter Email Id of user in registration page
		public void enterRegisEmailId(String EmailId)
		{
			registerEmailID.clear();
			registerEmailID.sendKeys(EmailId);
		}		

	//Enter Password of user in registration page
		public void enterRegisPassword(String Password)
		{
			registerPassword.clear();
			registerPassword.sendKeys(Password);
		}		

	//Enter Confirm Password of user in registration page
		public void enterConfirmPassword(String ConfirmPassword)
		{
			registerConfirmPassword.clear();
			registerConfirmPassword.sendKeys(ConfirmPassword);
		}			
		
	//Selects KeepMeSignedIn check-box
		public void checkKeepMeSignedIn()
		{
			keepMeSignedIn.click();
		}	
		
	//Selects Google Re-captcha check-box
		public void checkTermsandConditions()
		{
			registerTermsandConditions.click();
		}

	//Selects Google Re-captcha check-box
		public void registerNotRobot()
		{
			// TODO Auto-generated method stub
			registerNotRobot.click();
		}
		
	//Click Create Account button
		public void createAnAccount()
		{
			createAnAccountButton.click();
		}
		
	//Click User Signed In
		public void accountCreated()
		{
			userSignedIn.getText();
		}
		
	//Click User Signed Out
	    public void userSignedOut()
		{
			userSignedOut.click();
		}		
		
		
}
