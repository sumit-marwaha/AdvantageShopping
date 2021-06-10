package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class PDPPage {
	
	By addToCartBtn=By.cssSelector(".fixedBtn");
	By checkoutBtn=By.cssSelector("#checkOutPopUp");
	By laptops=By.cssSelector("#laptopsImg");
	private WebDriver driver;
	
public PDPPage(WebDriver driver) {		
		
		this.driver=driver;
		
	}
	

	public void addToCart()
	{
		 driver.findElement(addToCartBtn).click();	 
	}
	
	public void clickOnCheckout()
	{
		 driver.findElement(checkoutBtn).click();	 
	}
	
	

}
