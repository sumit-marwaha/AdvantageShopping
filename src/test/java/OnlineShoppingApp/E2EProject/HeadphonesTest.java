package OnlineShoppingApp.E2EProject;	

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.HomePage;
import Resources.base;


	public class HeadphonesTest extends base
	{
		public WebDriver driver;
		
		@BeforeTest
		public void initialize() 
		{
		
			 driver =initializeDriver();

		}
	    @Test
	  public void verifyMicePageURL() 
		{
	    	HomePage hp=new HomePage(driver);
	    	driver.get("http://advantageonlineshopping.com/#/");	
	    	hp.GoToHeadphonesPlp();	    	
			String url = driver.getCurrentUrl();			
			Assert.assertTrue(url.contains("Headphones"));								
		}
	    
	    @AfterTest
		public void teardown()
		{
			
			driver.close();
		
			
		}
		
	}