package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PaymentPage {
	
	By nextBtn=By.cssSelector("#next_btn");	
	By payNowBtn=By.cssSelector("#pay_now_btn_SAFEPAY");
	
	private WebDriver driver;
	
public PaymentPage(WebDriver driver) {		
		
		this.driver=driver;
		
	}
	

	public void clickNext()
	{
		 driver.findElement(nextBtn).click();	 
	}
	
	public void makePayment()
	{

		driver.findElement(payNowBtn).click();
	}
	
	
	

}
