package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class PLPPage {
	By firstItem =By.xpath("//div[@class ='cell categoryRight']//li[1]");
	
	private WebDriver driver;
	
public PLPPage(WebDriver driver) {		
		
		this.driver=driver;
		
	}
	

	public void selectFirstItem()
	{
		 driver.findElement(firstItem).click();	 
	}
	
	

}
