package pageObjects;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {
public LandingPage landingpage;
public OffersPage offerspage;
public WebDriver driver;
public checkoutPage checkoutpage;

public pageObjectManager(WebDriver driver)
{
	this.driver=driver;
}

public LandingPage getLandingPage()
{
	landingpage = new LandingPage(driver);
	return landingpage;
}

public checkoutPage getCheckoutPage()
{
	checkoutpage = new checkoutPage(driver);
	return checkoutpage;
}

public OffersPage getOffersPage()
{
	offerspage = new OffersPage(driver);
	return offerspage;
}

}
