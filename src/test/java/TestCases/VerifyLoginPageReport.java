package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.HomePage;
import Pages.LoginPage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyLoginPageReport
{
    WebDriver driver;
    ExtentReports report;
    ExtentTest logger;

	
	@BeforeMethod
	public void setUP()
	{
		report= new ExtentReports("./Reports/LoginPageReport.html",true);
		logger = report.startTest("VerifyTestLogin");
	    driver = BrowserFactory.getBrowser("firefox");		
		driver.get(DataProviderFactory.getConfig().getUrl());
		logger.log(LogStatus.INFO, "Application up and running");
	}
	@Test
	public void testHomePage()
	{
			
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		String title = home.getApplicationTitle();
		
		Assert.assertTrue(title.contains("Pet"));
		
		logger.log(LogStatus.PASS,"Home page verified");
		
		home.ClickOnSignInLink();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		login.ClickOnCrateAccountLink();
		
		String loginTitle = login.getLoginPageTitle();
		
		Assert.assertTrue(loginTitle.contains("Register"));
		
		logger.log(LogStatus.PASS,"Login page verified");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		BrowserFactory.closeBrowser();
		report.endTest(logger);
		report.flush();
	}

}
