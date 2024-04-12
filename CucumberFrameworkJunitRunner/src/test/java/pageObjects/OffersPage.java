package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	public WebDriver driver;
	public OffersPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By searchProd = By.id("search-field");
	By productName = By.xpath("//tbody/tr/td");
	
	
	public void searchItem(String name)
	{
		driver.findElement(searchProd).sendKeys(name);
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	
	
}

