package miniProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.FacebookHomePage;
import pageObjects.searchUser;
import utils.Base;

public class FacebookLogin {
	
	public WebDriver driver;
	
	
	
	@Test (priority=1)
	public void enterUserDetails() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Srihari\\Automation\\SeliniumJava\\src\\test\\java\\loginDetails.Properties");
		prop.load(fis);
		
		
		String username1 = prop.getProperty("username");
		String password1 = prop.getProperty("password");
		
		Base bb = new Base();
		driver=bb.webDriverInitilize();
		
		
		FacebookHomePage fbp = new FacebookHomePage(driver);
		
		fbp.getemailid().sendKeys(username1);
		
		
		fbp.getpassword().sendKeys(password1);
		fbp.clickloginbutton().click();
	    
		
	}
	
	@Test (priority=2)
	
	public void forgotPassowrd() throws InterruptedException 
	{
	
	searchUser sc = new searchUser(driver);
	Thread.sleep(5000);
	sc.getforgotpassword().click();
	
	sc.getemailfeild().sendKeys("xyz@gmail.com");
	sc.clicksubmitbutton().click();
	
	}

}
