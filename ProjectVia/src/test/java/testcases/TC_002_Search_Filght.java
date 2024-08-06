package testcases;

import org.automation.ElementRepository.Holidays_Page;
import org.automation.basePage.Base_Test;
import org.testng.annotations.Test;

public class TC_002_Search_Filght extends Base_Test{
	
	@Test
	public void searchFlight() throws InterruptedException {
		Holidays_Page Hp=new Holidays_Page(driver);
		Hp.getHolidaysLink().click();
		Thread.sleep(2000);
		Hp.getDestinationTextBox().sendKeys("Ooty");
		Hp.getRoomsandGuesttextbox().click();
		Hp.getDoneButton().click();
		Hp.getSearchHolidaysButton().click();
	}

}
