package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath=".//*[@id='WC_AccountDisplay_links_3']") WebElement createAccountLink;

	public void ClickOnCrateAccountLink()
	{
		createAccountLink.click();
	}
	public String getLoginPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
}
