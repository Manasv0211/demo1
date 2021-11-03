package com.mindtree.reusablecomponents;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverHelper {


	
	//This is base for all classes
	//This will choose browser
	public static WebDriver driver;
	public Properties prop;
	public WebDriver intializeDriver() throws IOException
	{
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("P:/Selenium/GitRepo/atlanticbooks/TestData/config.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		//chrome
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","P:/Selenium/GitRepo/atlanticbooks/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		//firefox
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"M:\\Selenium\\selenium-programs\\atlanticbooks\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//edge
		else if(browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"M:\\Selenium\\selenium-programs\\atlanticbooks\\Driver\\msedgedriver.exe");
			
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		
		
		return driver;
		
	}

	



}
