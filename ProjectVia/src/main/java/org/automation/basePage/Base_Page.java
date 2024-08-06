package org.automation.basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {
	
//	public WebDriver driver;
//	public String url="https://in.via.com/";
//	public String emailId="sumanm@gmail.com";
//	public String password="Suman@123";
	
	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//================Web elements or Property================
	@FindBy(linkText="SIGN UP") 
	private WebElement signupLink;
	
	@FindBy(linkText = "//div[contains(text(),'Sign In')]")
	private WebElement signInLink;
	
	@FindBy(linkText = "Flights ")
	private WebElement flightLink;
	
	@FindBy(linkText = "Hotels")
	private WebElement HotelsLink;
	
	@FindBy(linkText = "Holidays")
	private WebElement HolidaysLink;
	
	@FindBy(linkText = "Bus ")
	private WebElement BusLink;
	
	@FindBy(linkText = "Forex ")
	private WebElement ForexLink;
	
	@FindBy(linkText = "Cabs")
	private WebElement CabsLink;
	
	@FindBy(linkText = "Cruise")
	private WebElement CruiseLink;
	
	//================Getters or Public services================
    public WebElement getSignupLink() {
		return signupLink;
	}

	public WebElement getSignInLink() {
		return signInLink;
	}

	public WebElement getFlightLink() {
		return flightLink;
	}

	public WebElement getHotelsLink() {
		return HotelsLink;
	}

	public WebElement getHolidaysLink() {
		return HolidaysLink;
	}

	public WebElement getBusLink() {
		return BusLink;
	}

	public WebElement getForexLink() {
		return ForexLink;
	}

	public WebElement getCabsLink() {
		return CabsLink;
	}

	public WebElement getCruiseLink() {
		return CruiseLink;
	}
	
}
