package org.automation.ElementRepository;

import org.automation.basePage.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn_Page extends Base_Page {

	public SignIn_Page(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath =" //div[contains(text(),'Sign In')]")
	private WebElement SignInLink;
	
	@FindBy(xpath="//button[text()='No thanks!']")
	private WebElement Nothanksbutton;
	
	public WebElement getNothanksbutton() {
		return Nothanksbutton;
	}
	@FindBy(id="loginIdText")
	private WebElement EmailTextfiled;
	
	@FindBy(id="passwordText")
	private WebElement Passwordtextfield;
	
	@FindBy(id="loginValidate")
	private WebElement signInbutton;

	public WebElement getEmaiTextfiled() {
		return EmailTextfiled;
	}

	public WebElement getPasswordtextfield() {
		return Passwordtextfield;
	}

	public WebElement getSignInbutton() {
		return signInbutton;
	}

	public WebElement getSignInLink() {
		return SignInLink;
	}
	
	
	
	

}
