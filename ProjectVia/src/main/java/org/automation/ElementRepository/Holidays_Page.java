package org.automation.ElementRepository;

import org.automation.basePage.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Holidays_Page extends Base_Page {

	public Holidays_Page(WebDriver driver) {
		super(driver);
	}
     
	@FindBy(id="destination")
	private WebElement destinationTextBox; 
	
	@FindBy(xpath ="//span[text()='1 Room, 1 Guests']")
	private WebElement RoomsandGuesttextbox;
	
	@FindBy(xpath = "//div[text()='Done']")
	private WebElement DoneButton;
	
	@FindBy(id="search-holiday-btn")
	private WebElement SearchHolidaysButton;

	public WebElement getDestinationTextBox() {
		return destinationTextBox;
	}

	public WebElement getRoomsandGuesttextbox() {
		return RoomsandGuesttextbox;
	}

	public WebElement getDoneButton() {
		return DoneButton;
	}

	public WebElement getSearchHolidaysButton() {
		return SearchHolidaysButton;
	}
	
	
}
