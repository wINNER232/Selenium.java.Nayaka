package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectThearter {
  WebDriver driver;	@FindBy (xpath="//div[@class='df-at df-av df-ch df-dg df-f df-g df-gd df-ge df-gf df-gg df-l']")
	private WebElement Thearter;
	
	public  SelectThearter (WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	public void ThearterSelect()
	{
		Thearter.click();
	}
	

}
