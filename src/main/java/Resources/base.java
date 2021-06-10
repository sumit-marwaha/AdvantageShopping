package Resources;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

public  WebDriver driver;	
public WebDriver initializeDriver() 
{
	 System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
	driver= new ChromeDriver();		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;

}


}