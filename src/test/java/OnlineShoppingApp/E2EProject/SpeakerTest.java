package OnlineShoppingApp.E2EProject;	

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.HomePage;
import Resources.base;


	public class SpeakerTest extends base
	{
		public WebDriver driver;
		
		@BeforeTest
		public void initialize() 
		{
		
			 driver =initializeDriver();

		}
	    @Test
	  public void verifySpeakerPageURL() 
		{
	    	HomePage hp=new HomePage(driver);
	    	driver.get("http://advantageonlineshopping.com/#/");	
	    	hp.GoToSpeakerPlp();	    	
			String url = driver.getCurrentUrl();			
			Assert.assertTrue(url.contains("Speakers"));								
		}
	    
	    @AfterTest
		public void teardown()
		{
			
			driver.close();
		
			
		}
		
	}



