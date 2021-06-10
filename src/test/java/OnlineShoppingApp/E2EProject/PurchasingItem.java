package OnlineShoppingApp.E2EProject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.OrderPage;
import PageObject.PDPPage;
import PageObject.PLPPage;
import PageObject.PaymentPage;
import Resources.base;


public class PurchasingItem extends base  {

	public WebDriver driver;
	
	@BeforeTest
	public void initialize() 
	{
	
		 driver =initializeDriver();

	}
	
		
    @Test
  public void SpeakerEndToEndTest() 
	{
    	HomePage hp=new HomePage(driver);
    	PLPPage plp =new PLPPage(driver);
    	PDPPage pdp =new PDPPage(driver);
    	LoginPage lp = new LoginPage(driver);
    	PaymentPage pp = new PaymentPage(driver);
    	OrderPage op = new OrderPage(driver);
    	driver.get("http://advantageonlineshopping.com/#/");	
    	hp.GoToSpeakerPlp();
    	plp.selectFirstItem();
    	pdp.addToCart();
    	pdp.clickOnCheckout();
    	lp.enterUsername();
    	lp.enterPassword();
    	lp.clickLogin();
    	pp.clickNext();
    	pp.makePayment();
    	op.checkOrderStatusHeader();
    	System.out.println("TestCompleted");
    	
	}
    
    @AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}
}
