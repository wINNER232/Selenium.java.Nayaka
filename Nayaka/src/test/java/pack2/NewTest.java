package pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.BasePojo;
import pack1.Login;
import pack1.Logout;
import pack1.Plays;
import pack1.SelectThearter;
import pack1.WeekEnd;

public class NewTest {
	private     WebDriver driver;
	private 	Login login;
	private     Logout logout;
	private     Plays plays;
	private       SelectThearter selectThearter;
	@Parameters ("browser")
    @BeforeTest
    public void launchbrowser(String browserName)  
  {
        if(browserName.equals("Chrome"))   
     	   {
        	driver=BasePojo.OpenChromeDriver();
     	   }
        if(browserName.equals("FireFox"))   
        {	
        	 driver=BasePojo.FirefoxDriver();
         }
             driver.manage().window().maximize();
         	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   }
	@BeforeClass
	public void BeforeClass()
	{
        login=new Login(driver);
        logout =new Logout(driver);
        plays=new Plays(driver);
        selectThearter =new SelectThearter(driver);
		driver.get("https://in.bookmyshow.com/explore/home/pune");
	}
	
	
	
	@BeforeMethod
	public void LoginBookMy()
	{
		 login=new Login(driver);
		// login.loginBook();	
		// login.GoogleSelect();
		 login.Play();
	}

  @Test
  public void PlaysVerify() {
	  plays.ClickOnPlays();
	  String s=driver.getTitle();
	  System.out.println(s);
	  SoftAssert  soft=new  SoftAssert();
	  soft.assertEquals(s,"Top Upcoming Plays in Pune | Best Live Plays in Pune - BookMyShow");
	  soft.assertAll();
  }
  @Test
  public void Thearter() throws InterruptedException {
	    System.out.println("After test2");
	   plays.ClickOnPlays();
	   WeekEnd weekend=new WeekEnd(driver);
	   Thread.sleep(3000);
	   weekend.ClickOnPlays();
	   Thread.sleep(3000);

	   weekend.selectfirstplay();
       selectThearter=new SelectThearter(driver);
       selectThearter.ThearterSelect();
	  String s= driver.getTitle();
	  System.out.println(s);
	  //Assert.assertEquals(s, "fhg");
  }
	    
  @AfterMethod
 	public void clenPOMObject()
 	{  
	  login=null;
	  logout=null;
	  plays=null;
    	}
   @AfterClass
   public void afterClass()
  {
    System.out.println("After method");
 	//driver.quit();
 	System.gc();
  }

}
