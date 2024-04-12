package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.pageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefination {
	public TestContextSetup testcontextsetup;
	public String offerPageProductName;
	public LandingPage landingpage;
	//single responsibility principle
	//Factory design pattern
	
	public OfferPageStepDefination(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup = testcontextsetup;
		this.landingpage= testcontextsetup.pageObjmanager.getLandingPage();
	}
	@Then("^user searched for (.+) in offers page$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortName) throws InterruptedException 
		{
			switchToOffersPage();
			OffersPage offpage = new OffersPage(testcontextsetup.testBase.driver);
			offpage.searchItem(shortName);
			Thread.sleep(2000);
			offerPageProductName =offpage.getProductName();
			System.out.println("Product has been extracted from offer page = " + offerPageProductName);
		}
	
	public void switchToOffersPage()
	{
		
		//if(testcontextsetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
		landingpage.selectTopDealsPage();
		testcontextsetup.genericUtils.SwitchWindowToChild();
	}
	@Then("product name matches with the landing page and offer page")
	public void validateProduct()
		{
			Assert.assertEquals(testcontextsetup.landingPageProductName, offerPageProductName);
		}
}
