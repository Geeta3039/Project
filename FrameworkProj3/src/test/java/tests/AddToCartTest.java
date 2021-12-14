package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.AddToCartPage;
import pageobjects.SearchProductPage;
import resources.Base;

public class AddToCartTest extends Base{
	WebDriver driver;
	
	@Test
	public void AddToCart() throws InterruptedException {
		SearchProductPage searchProductPage = new SearchProductPage(driver);
		searchProductPage.SearchBox().sendKeys("Mobile");
		searchProductPage.ClickSearch().click();
		Thread.sleep(3000);
		searchProductPage.Checkbox().click();
		searchProductPage.Search().click();
		
		
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.Mobile().click();
		addToCartPage.AddCart().click();
		
		if(addToCartPage.AddedToCart().isDisplayed()) {
			System.out.println("Item is successfully added to the cart");
		}
		
		addToCartPage.ShoppingCart().click();
		
		if(addToCartPage.CannotCheckout().isDisplayed()) {
			System.out.println("Item is not available for checkout");
			addToCartPage.RemoveItem().click();
			System.out.println("Item is removed successfully as it is not available for checkout");
		}
	}
	
	@BeforeMethod
	public void LaunchApp() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}
