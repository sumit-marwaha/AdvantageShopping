package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OrderPage {
	
	By successMsg=By.xpath("//div[@id ='orderPaymentSuccess']/h2/span");	
	
	private WebDriver driver;
	
public OrderPage(WebDriver driver) {		
		
		this.driver=driver;
		
	}
	

	public void checkOrderStatusHeader()
	{
		 driver.findElement(successMsg).isDisplayed();	 
	}
	
	
	
	
	

}
