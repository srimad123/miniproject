package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchUser {
	public WebDriver driver;
	
	private By forgotpassword = By.linkText("Forgotten password?");
	private  By emailField=	By.id("identify_email");
	private  By submitButton=	By.xpath("//*[@id='did_submit']");
	
	public searchUser(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getforgotpassword(){
		return driver.findElement(forgotpassword);
		
	}
	public WebElement getemailfeild(){
		return driver.findElement(emailField);
		
	}
	public WebElement clicksubmitbutton(){
		return driver.findElement(submitButton);
		
	}
	
	
}
