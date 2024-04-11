package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage {
	WebDriver driver;
	public checkoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By cart = By.cssSelector("img[alt='Cart']");
	By checkoutBtn = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	//By applyBtn = By.cssSelector(".promoBtn");
	By placeOrderBtn = By.xpath("//button[contains(text(),'Place Order')]");
	By promoCodetxt = By.cssSelector("input[placeholder='Enter promo code']");
	By prodname = By.cssSelector(".product-name");
	By addToCart = By.cssSelector(".product-action button");
	By increaseQuantity = By.cssSelector("a.increment");
	
	public void CheckoutItems() throws InterruptedException
	{
		driver.findElement(cart).click();
		driver.findElement(checkoutBtn).click();
		Thread.sleep(2000);
	}
	
	/*public boolean verifyPromoBtn()
	{
		return driver.findElement(applyBtn).isDisplayed();
	}*/
	
	public boolean verifyPlaceOrderBtn()
	{
		return driver.findElement(placeOrderBtn).isDisplayed();
	}
	
	public String getProdName()
	{
		return driver.findElement(prodname).getText().split("-")[0].trim();
	}
	
	public void increaseQuantity(int count)
	{
		for(int i =1; i<count;i++)
		{
			driver.findElement(increaseQuantity).click();
		}
	}
	public void addToCart()
	{
		driver.findElement(addToCart).click();
	}
}
