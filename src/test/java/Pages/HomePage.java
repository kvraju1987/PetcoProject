package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage
{
	WebDriver driver;
	public HomePage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath=".//*[@id='signInUrl']") WebElement signInUrl;
	@FindBy(xpath=".//*[@id='header']/div/div/nav/div/div[2]/div/a[2]/strong") WebElement headerLink;
	@FindBy(xpath=".//*[@id='gQuickReorder']") WebElement quickOrderLink;
	
	public void ClickOnSignInLink()
	{
		signInUrl.click();
	}
	
	public void ClickOnHeaderInLink()
	{
		headerLink.click();
	}
	
	public void ClickOnQuickOrderInLink()
	{
		quickOrderLink.click();
	}
	
	public String getApplicationTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	
}
