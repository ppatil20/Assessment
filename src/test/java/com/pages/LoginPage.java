/**
 * 
 */
package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author patil_pa
 * This class consists of Locators and Page methods wrt Login Page(POM)
 * (This can also be done using separate classes for pages and locators and importing relevant classes required)
 */
public class LoginPage {
	
	//The locators of Login page UI elements
	@FindBy(how = How.XPATH, using = "//*[text() = 'Sign in']")
	public WebElement singInLink;
	
	@FindBy(how = How.XPATH, using = "//input[@id='signinemail']")
	public WebElement signInEmailAddress;
	
	@FindBy(how = How.XPATH, using = "//input[@id='signinpassword']")
	public WebElement signInPassword;
	
	@FindBy(how = How.XPATH, using = "//form[1]/fieldset[1]/div[4]/input[1]")
	public WebElement signInButton;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Ayaansh Patil')]")
	public WebElement userSignedIn;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign out')]")
	public WebElement userSignedOut;
	
	//Constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods using the respective locators
	//Navigates to SignIn page
	public void clickSignInLink() 
	{		
		singInLink.click();				
	}
	
	//Enter Email Id of user in Sign in page
	public void enterEmailId(String EmailId)
	{
		signInEmailAddress.clear();
		signInEmailAddress.sendKeys(EmailId);
	}		

    //Enter Password of user in Sign in page
	public void enterPassword(String Password)
	{
		signInPassword.clear();
		signInPassword.sendKeys(Password);
	}
	
	//Click SignIn button
	public void clickSignInbutton() 
	{		
		signInButton.click();				
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
