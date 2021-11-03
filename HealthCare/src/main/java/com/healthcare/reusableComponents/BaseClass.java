package com.healthcare.reusableComponents;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.healthcare.PageObjects.BookServices;
import com.healthcare.PageObjects.Contact;
import com.healthcare.PageObjects.HomePage;
import com.healthcare.PageObjects.SuccessPage;
import com.healthcare.utilities.ConfigsProvider;
import com.healthcare.utilities.ExtentReporter;

import com.relevantcodes.extentreports.ExtentTest;



public class BaseClass {
	
	public static WebDriver driver;
	public static Logger log;
	public static ConfigsProvider config;
	public static ExtentReporter reporter;
	public static ExtentTest test;
	
	public static HomePage homepage;
	public static Contact contact;
	public static BookServices bookServices;
	public static SuccessPage successPage;
	
	@BeforeSuite
	public void startup() {
		
		log = Logger.getLogger(getClass());
		config = new ConfigsProvider();
		reporter = new ExtentReporter(config.getExtentPath());
		test = reporter.startTest("BaseClass");
	}
	@BeforeClass
	public void beforeClass() {
		driver = WebDriverHelper.driverInitializer(driver, config.getBrowser(), config.implicitWait());
		log.info("Driver Initialised");
		
		homepage = new HomePage(driver);
		contact = new Contact(driver);
		bookServices = new BookServices(driver);
		successPage = new SuccessPage(driver);
		
	}
	
	
	@AfterClass
	public void classTeardown() {
		WebDriverHelper.quitDriver(driver);
		log.info("Driver Closed");
	}
	@AfterSuite
	public void suiteTeardown() {
		reporter.endTest(test);
		reporter.close();
	}
}
