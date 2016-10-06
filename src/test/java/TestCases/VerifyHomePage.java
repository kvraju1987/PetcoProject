package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyHomePage 
{

	WebDriver driver;
	
	@BeforeMethod
	public void setUP()
	{
	    driver = BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getUrl());
	}
	@Test
	public void testHomePage()
	{
			
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		String title = home.getApplicationTitle();
		
		Assert.assertTrue(title.contains("Pet"));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		BrowserFactory.closeBrowser();
	}
}

