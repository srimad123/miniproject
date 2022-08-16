package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookHomePage {
	public WebDriver driver;
	

	public FacebookHomePage(WebDriver driver) 
	{
		    this.driver =driver;
	}
	
	
	private By emailid = By.id("email");
	private By password  = By.id("pass");
	private By loginbutton = By.name("login");
	
	
	public WebElement getemailid() {
		return driver.findElement(emailid);	

	}
	
	public WebElement getpassword() {
		return driver.findElement(password);

	}
	
	public WebElement clickloginbutton() {
		return driver.findElement(loginbutton);

	}
	
}


