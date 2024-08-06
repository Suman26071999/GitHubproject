package org.automation.GenericUtilities;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InitObjects implements FrameWorkConstants{

	    public static WebDriver static_driver_ref;
		public WebDriver driver;
		public InitObjects initClass; 
		public WebDriverWait explicitWait;
		public ReadTestData readData;
//		public Login_Page loginPage;
//		public Home_Page homePage;
		public String url;
		public String emailId;
		public String password;
			
		public ReadTestData getReadTestData() {
			return new ReadTestData();
		}
		
		
	}


	


