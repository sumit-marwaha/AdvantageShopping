package OnlineShoppingApp.E2EProject;	

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.HomePage;
import Resources.base;


	public class LaptopsTest extends base
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
	    	hp.GoToLaptopPlp();	    	
			String url = driver.getCurrentUrl();			
			Assert.assertTrue(url.contains("Laptops"));								
		}
	    
	    @AfterTest
		public void teardown()
		{
			
			driver.close();
		
			
		}
		
	}