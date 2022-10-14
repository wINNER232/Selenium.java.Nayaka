package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPlay {
	WebDriver driver;
	@FindBy (xpath="//button[text()='Book']")
	private WebElement Book;
	
	public  BookPlay (WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	public void ClickOnBook()
	{
		Book.click();
	}
}
