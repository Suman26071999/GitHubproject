package org.automation.ElementRepository;

import org.automation.basePage.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchEnquiry_page extends Base_Page{

	public SearchEnquiry_page(WebDriver driver) {
		super(driver);
	}
    
	@FindBy(xpath = "//button[.='Send Enquiry']")
	private WebElement SendEnquiryButton;
	
	@FindBy(name="fName")
	private WebElement FirstNameTextField;
	
	@FindBy(name = "lName")
	private WebElement LastNameTextField;
	
	public WebElement getSendEnquiryButton() {
		return SendEnquiryButton;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getEmailTextfield() {
		return EmailTextfield;
	}

	public WebElement getMobileTextField() {
		return MobileTextField;
	}

	public WebElement getProceedButton() {
		return ProceedButton;
	}

	public WebElement getOTPTextButton() {
		return OTPTextButton;
	}

	public WebElement getSendButton() {
		return sendButton;
	}

	@FindBy(name= "email")
	private WebElement EmailTextfield;
	
	@FindBy(id= "enqMobile")
    private WebElement MobileTextField;
	
	@FindBy(xpath="//span[text()='Proceed']")
	private WebElement ProceedButton;
	
	@FindBy(id="optreceived")
	private WebElement OTPTextButton;
	
	@FindBy(xpath="//span[text()='Send']")
	private WebElement sendButton;
	
	
}
