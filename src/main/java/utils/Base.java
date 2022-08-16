package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;

    public WebDriver webDriverInitilize() throws IOException
	{
	
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Srihari\\Automation\\SeliniumJava\\src\\test\\java\\loginDetails.Properties");
	prop.load(fis);
	
	String url = prop.getProperty("url");
	
	String browser = prop.getProperty("browser");
	
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
	}
	
	else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	else if(browser.equals("safari")) {
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	return driver;
	}
	
}
