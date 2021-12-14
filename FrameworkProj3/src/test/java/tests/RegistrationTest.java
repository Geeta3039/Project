package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.RegistrationPage;
import resources.Base;

public class RegistrationTest extends Base {
	WebDriver driver;
	
	@Test
	
	
	public void register() throws IOException {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropDown().click();
		landingPage.registerOption().click();
		
		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.FirstName().sendKeys("Dummy");
		registrationPage.LastName().sendKeys("DummyTest");
		registrationPage.Email().sendKeys("Dummy@gmail.com");
		registrationPage.MobileNo().sendKeys("2345678901");
		registrationPage.Password().sendKeys("Dummy");
		registrationPage.ConfirmPassword().sendKeys("Dummy");
		registrationPage.CheckBox().click();
		registrationPage.ContinueRegister().click();
		
		System.out.println("Registration Completed");
	}
	
	@BeforeMethod
	public void LaunchApp() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	
		
}

	