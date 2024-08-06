package org.automation.ElementRepository;

import org.automation.basePage.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp_Page extends Base_Page {

	public SignUp_Page(WebDriver driver) {
		super(driver);
	}
	
	//==============WebElements property=============
	@FindBy(id="emailIdSignUp")
	private WebElement EmailTextBox;
	
	@FindBy(id="passwordSignUp")
	private WebElement PasswordTextBox;
	
	@FindBy(id="nameSignUp")
	private WebElement NameTextBox;
	
	@FindBy(id="mobileNoSignUp")
	private WebElement mobilenumberTextBox;
	
	@FindBy(id="signUpValidate")
	private WebElement CreateAccountButton;

	public WebElement getEmailTextBox() {
		return EmailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return PasswordTextBox;
	}

	public WebElement getNameTextBox() {
		return NameTextBox;
	}

	public WebElement getMobilenumberTextBox() {
		return mobilenumberTextBox;
	}

	public WebElement getCreateAccountButton() {
		return CreateAccountButton;
	}
    
	
}
