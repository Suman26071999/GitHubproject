package testcases;
import org.automation.ElementRepository.SignIn_Page;
import org.automation.basePage.Base_Test;
import org.testng.annotations.Test;


public class TC_001_Login_Test extends Base_Test {
	
	@Test
	public void login(){
		SignIn_Page signIn=new SignIn_Page(driver);
//		signIn.getNothanksbutton().click();
//		signIn.getSignInLink().click();
//		signIn.getEmaiTextfiled().sendKeys(emilId);
//		signIn.getPasswordtextfield().sendKeys(pwdd);
//		signIn.getSignInbutton().click();
		System.out.println("Appliocation logged in successfully");
		driver.quit();
	}

}
