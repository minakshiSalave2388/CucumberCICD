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
import pageObjects.checkoutPage;
import utils.TestBase;
import utils.TestContextSetup;

public class CheckoutPageStepDefination {

	public WebDriver driver;
	public String offerPageProductName;
	public String landingPageProductName;
	TestContextSetup testcontextsetup;
	public checkoutPage checkoutpage;
	public TestBase testBase;
	public CheckoutPageStepDefination(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup = testcontextsetup;
		this.checkoutpage = testcontextsetup.pageObjmanager.getCheckoutPage();
	}
	
	@Then("^User proceed to Checkout and validate (.+) items in checkout page$")
	public void User_proceed_to_Checkout_and_validate_items_in_checkoutpage(String vegName) throws InterruptedException
	{
		checkoutpage.CheckoutItems();
		String name = checkoutpage.getProdName();
		Assert.assertEquals(name, vegName, "Matching");
		
	}
	
	@Then("verify user has ability to enter promocode and place the order")
	public void verify_user_has_ability_to_enter_promocode_and_place_the_order()
	{
		
		//Assert.assertTrue(checkoutpage.verifyPromoBtn());
		//Assert.assertTrue(checkoutpage.verifyPlaceOrderBtn());
		
	}
	
	@When("^Added (.+) items of the selected product to cart$")
	public void added_items_of_the_selected_product_to_cart(int count) {
		checkoutpage.increaseQuantity(count);
		checkoutpage.addToCart();
	}

}
