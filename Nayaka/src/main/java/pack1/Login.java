package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	@FindBy (xpath="//div[text()='Sign in']")
	private WebElement sign;
	
    @FindBy (xpath="//div[@class='sc-kfGgVZ ffEUhO']")
	private WebElement google;
    
    @FindBy (xpath="//a[@href='/explore/plays-pune']")
	private WebElement play;

	
		public  Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void loginBook(){
		sign.click();
		
	}
	public void GoogleSelect(){
		google.click();
		}
	public void Play(){
		play.click();
	}

}

