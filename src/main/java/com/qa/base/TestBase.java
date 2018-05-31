package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		//String src = "F:/Automation/CuccumberProjectthroughPOM/src/main/java/com/qa/config/config.properties";
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("F:\\Automation\\CuccumberProjectthroughPOM\\src\\main\\java\\com\\qa\\config\\config.properties");
			
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browser =prop.getProperty("browser");
		if(browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "I:\\Automation\\chromedriver\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}


}
