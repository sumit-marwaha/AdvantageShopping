package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
public WebDriver driver;
	
	By userName=By.xpath("//div[(@id = 'orderPayment')]//label[contains(text(), 'Username')]");
	By userNameField=By.xpath("//input[(@name='usernameInOrderPayment')]");
	By password=By.xpath("//div[(@id = 'orderPayment')]//label[contains(text(), 'Password')]");
	By passwordField=By.xpath("//input[(@name='passwordInOrderPayment')]");
	By loginBtn=By.cssSelector("#login_btnundefined");
	
		
	
	public LoginPage(WebDriver driver) {		
		
		this.driver=driver;
		
	}
	
	public void enterUsername()
	{
		driver.findElement(userName).click();
		driver.findElement(userNameField).sendKeys("testuser1");		
	}
	
	public void enterPassword()
	{
		driver.findElement(password).click();
		driver.findElement(passwordField).sendKeys("Password1"); 		
	}
	public void clickLogin()
	{		
		driver.findElement(loginBtn).click();
	}

}
