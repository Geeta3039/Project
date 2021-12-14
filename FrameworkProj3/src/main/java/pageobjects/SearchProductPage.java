package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage {
	WebDriver driver;
	
	public SearchProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/header/div/div/div[2]/div/input")
	WebElement SearchBox;
	
	
	@FindBy(xpath="/html/body/header/div/div/div[2]/div/span/button/i")
	WebElement ClickSearch;
	
	
	@FindBy(xpath="//*[@id=\"description\"]")
	WebElement Checkbox;
	
	
	@FindBy(xpath="//*[@id=\"button-search\"]")
	WebElement Search;
	
	public WebElement SearchBox() {
		return SearchBox;
	}
		
	public WebElement ClickSearch() {
		return ClickSearch;
		
	}
	
	public WebElement Checkbox() {
		return Checkbox;
		
	}
	
	public WebElement Search() {
		return Search;
		
	}
}
