package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {	
	WebDriver driver;
	//String actualResult = null;
	
	@Test(dataProvider = "getLoginData")
	public void login(String email, String password, String expectedStatus) throws IOException, InterruptedException {
		
		
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropDown().click();
		landingPage.loginOption().click();
		
		Thread.sleep(3000);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailAddressField().sendKeys(email);
		loginPage.passwordField().sendKeys(password);
		loginPage.loginButton().click();
	
		AccountPage accountPage = new AccountPage(driver);
		
		 String actualResult = null;
		
		try {
			if(accountPage.editAccountInformationOption().isDisplayed()) {
			actualResult = "Successfull";
			System.out.println("Login Successfull for: " +email);
			}
		}catch(Exception e) {
			actualResult = "Failure";
			System.out.println("Login Failed for: " +email);
		}
	   
		Assert.assertEquals(actualResult, expectedStatus);
	}
	
	@BeforeMethod
	public void launchApp() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void close() {
		driver.close();
		
	}
	@DataProvider
	public Object[][] getLoginData() {
		
		Object[][] data = {{"gee@gmail.com", "gee@123", "Successfull"},{"Test@gmail.com", "test@123", "Failure"}};
		return data;
	}
}
