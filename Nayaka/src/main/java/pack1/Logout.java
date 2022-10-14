package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	WebDriver driver;
	@FindBy (xpath="//span[@class='sc-hzNEM gUCPEa']")
	private WebElement hiGuest;
	
    @FindBy (xpath="//button[@class='sc-iwsKbI sc-kQsIoO jYHPHt']]")
	private WebElement Signoput;
	
		public  Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	public void HiGuest(){
		hiGuest.click();
		
	}
	public void SignOput(){
		Signoput.click();

}
}