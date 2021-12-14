package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	WebDriver driver;
	
	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[3]/div[2]/div/div[1]/a/img")
	WebElement Mobile;	
	
	
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	WebElement AddCart;
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]")
	WebElement AddedToCart;
	
	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[4]/a/span")
	WebElement ShoppingCart;	
	
	@FindBy(xpath="/html/body/div[2]/div[1]")
	WebElement CannotCheckout;	
	
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]")
	WebElement RemoveItem;
	
	
	public WebElement Mobile() {
		return Mobile;
	}
	
	public WebElement AddCart() {
		return AddCart;
	}
	
	public WebElement ShoppingCart() {
		return ShoppingCart;
	}
	
	public WebElement AddedToCart() {
		return AddedToCart;
	}
	
	public WebElement CannotCheckout() {
		return CannotCheckout;
	}
	
	public WebElement RemoveItem() {
		return RemoveItem;
	}
}
