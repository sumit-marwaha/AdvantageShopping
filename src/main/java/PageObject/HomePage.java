package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;


public class HomePage {
	
public WebDriver driver;
String title;
	
	By speaker=By.cssSelector("#speakersImg");
	By tablets=By.cssSelector("#tabletsImg");
	By headphones=By.cssSelector("#headphonesTxt");
	By mice=By.cssSelector("#miceImg");
	By laptops=By.cssSelector("#laptopsImg");
	
		
	
	public HomePage(WebDriver driver) {		
		
		this.driver=driver;
		
	}
	
	public void GoToSpeakerPlp()
	{
		 driver.findElement(speaker).click();	 
	}
	
	public void GoToTabletsPlp()
	{
		 driver.findElement(tablets).click();		 
	}
	
	public void GoToHeadphonesPlp()
	{
		 driver.findElement(headphones).click();	 
	}
	public void GoToMicePlp()
	{
		 driver.findElement(mice).click();		 
		 
	}
	
	public void GoToLaptopPlp()
	{
		 driver.findElement(laptops).click();
		 
	}		
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	
	
}
