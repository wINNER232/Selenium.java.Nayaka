package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeekEnd {
	WebDriver driver;
	@FindBy (xpath="(//div[text()='This Weekend'])[2]")
	private WebElement weekend;
	
	@FindBy (xpath="//div[@class='sc-dv5ht7-0 eQcIov']")
	private WebElement selectfirstplay;
	
	public  WeekEnd (WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	public void ClickOnPlays()
	{
		weekend.click();
	}
	
	public void selectfirstplay()
	{
		selectfirstplay.click();
	}
}
