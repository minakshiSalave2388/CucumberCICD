package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.pageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String offerPageProductName;
	public String landingPageProductName;
	public pageObjectManager pageObjmanager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	public TestContextSetup() throws IOException
	{
		testBase=new TestBase();
		pageObjmanager = new pageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
	}
}
