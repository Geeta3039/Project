package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import pageobjects.RegistrationPage;
import pageobjects.SearchProductPage;
import resources.Base;

public class SearchProductTest extends Base{
	WebDriver driver;
	
	@Test
	public void SearchProd() throws IOException, InterruptedException {
		SearchProductPage searchProductPage = new SearchProductPage(driver);
		searchProductPage.SearchBox().sendKeys(prop.getProperty("product"));
		searchProductPage.ClickSearch().click();
		Thread.sleep(3000);
		searchProductPage.Checkbox().click();
		searchProductPage.Search().click();
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
