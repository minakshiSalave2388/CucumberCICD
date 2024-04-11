package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By searchProd = By.cssSelector("[placeholder='Search for Vegetables and Fruits']");
	By productName = By.cssSelector("h4.product-name");
	By topDeals = By.cssSelector(" [href='#/offers']");
	
	public void searchItem(String name)
	{
		driver.findElement(searchProd).sendKeys(name);
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	
	public void selectTopDealsPage()
	{
		driver.findElement(topDeals).click();
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
}
