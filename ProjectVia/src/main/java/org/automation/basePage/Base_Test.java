package org.automation.basePage;

import java.time.Duration;

import org.automation.GenericUtilities.InitObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;



public class Base_Test extends InitObjects {
    
	

	@BeforeClass
	public void launchURL() {
//			ChromeOptions options=new ChromeOptions();
//			options.addArguments("--headless");
		driver = new ChromeDriver();
		// driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_TIMEOUT));
		initClass = new InitObjects();
		readData = initClass.getReadTestData();
		url = readData.readDataFromPropertyFile("url");
		driver.get(url);
		// driver.findElement(By.linkText("Log in")).click();
	}

    //@BeforeMethod
//	public void loginToAppliacation() {
//        
//		WebElement mailId = driver.findElement(By.id("loginIdText"));
//		WebElement pwd = driver.findElement(By.id("passwordText"));
//
//		mailId.clear();
//		mailId.sendKeys(emilId);
//
//		pwd.clear();
//		pwd.sendKeys(pwdd);
//
//		driver.findElement(By.id("loginValidate")).click();
//	}

	// @AfterClass
	public void tearDown() {
		driver.quit();
	}

}
