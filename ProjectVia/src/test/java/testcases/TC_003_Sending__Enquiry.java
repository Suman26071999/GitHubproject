package testcases;

import org.automation.ElementRepository.Holidays_Page;
import org.automation.ElementRepository.SearchEnquiry_page;
import org.automation.basePage.Base_Test;
import org.testng.annotations.Test;

public class TC_003_Sending__Enquiry extends Base_Test
{
	@Test
	public void searchFlight() {
		Holidays_Page Hp=new Holidays_Page(driver);
		Hp.getHolidaysLink();
		Hp.getDestinationTextBox().sendKeys("Ooty");
		Hp.getRoomsandGuesttextbox().click();
		Hp.getDoneButton().click();
		Hp.getSearchHolidaysButton().click();
		
		SearchEnquiry_page SP=new SearchEnquiry_page(driver);
	    SP.getSendEnquiryButton().click();
	    SP.getFirstNameTextField().sendKeys("Suman");
	    SP.getLastNameTextField().sendKeys("Mashyal");
	    SP.getEmailTextfield().sendKeys("sumanpmashyal@gmail.com");
	    SP.getMobileTextField().sendKeys("7204930533");
	    SP.getProceedButton().click();
	    SP.getOTPTextButton().sendKeys("5020");
	    SP.getSendButton().click();
	}
}

