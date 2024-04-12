package stepDefinations;

import java.io.IOException;
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
import utils.TestBase;
import utils.TestContextSetup;

public class LandinPageStepDefination {

	public WebDriver driver;
	public String offerPageProductName;
	public String landingPageProductName;
	TestContextSetup testcontextsetup;
	public TestBase testBase;
	public LandingPage landingPage;
	public LandinPageStepDefination(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup = testcontextsetup;
		this.landingPage = testcontextsetup.pageObjmanager.getLandingPage();
	}
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() throws IOException 
		{
		//testcontextsetup.testBase.WebDriverManager();
		Assert.assertTrue(landingPage.getPageTitle().contains("GreenKart"));
		}
	
	@When("^user searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException 
		{
		
		landingPage.searchItem(shortName);
		Thread.sleep(2000);
		testcontextsetup.landingPageProductName = landingPage.getProductName().split("-")[0].trim();
		System.out.println("Product has been extracted on a landing page = " + testcontextsetup.landingPageProductName);
		}
	
}
