package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//  
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	WebElement FirstName;
	
	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	WebElement LastName;
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	WebElement MobileNo;
	
	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"input-confirm\"]")
	WebElement ConfirmPassword;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/div/div/input[1]")
	WebElement CheckBox;
	
			
	@FindBy(xpath="/html/body/div[2]/div/div/form/div/div/input[2]")
	WebElement ContinueRegister;
	
	public WebElement FirstName() {
		return FirstName;
	}
	
	public WebElement LastName() {
		return LastName;
	}
	
	public WebElement Email() {
		return Email;
	}
	
	public WebElement MobileNo() {
		return MobileNo;
	}
	
	public WebElement Password() {
		return Password;
	}
	
	public WebElement ConfirmPassword() {
		return ConfirmPassword;
	}
	
	public WebElement CheckBox() {
		return CheckBox;
	}
	
	public WebElement ContinueRegister() {
		return ContinueRegister;
	}
}
