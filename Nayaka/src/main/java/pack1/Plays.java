package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Plays {
	WebDriver driver;
	@FindBy (xpath="	//a[text()='Plays']")
	private WebElement play;
	
	public  Plays(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
}
	public void ClickOnPlays()
	{
		play.click();
	}
}