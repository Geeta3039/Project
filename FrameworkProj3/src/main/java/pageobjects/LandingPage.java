package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	//constructor of this class
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//create objects using pagefactory
	@FindBy(xpath="//a[text()='My Account']")
	WebElement myAccountDropDown;
	
	@FindBy(linkText = "Login")
	WebElement loginOption;
	
	@FindBy(linkText = "Register")
	WebElement registerOption;
	
	@FindBy(id="/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")
	WebElement Logout;
	
	public WebElement Logout() {
	return Logout;
	}
	
	public WebElement myAccountDropDown() {
		return myAccountDropDown;
	} 
	
	public WebElement loginOption() {
		return loginOption;
	}
	
	public WebElement registerOption() {
		return registerOption;
		
	}
	
}
