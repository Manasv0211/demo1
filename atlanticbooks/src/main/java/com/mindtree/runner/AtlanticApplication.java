package com.mindtree.runner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.pageobject.AtlanticAddToCart;
import com.mindtree.pageobject.AtlanticBookSearchPage;
import com.mindtree.pageobject.AtlanticHomePage;
import com.mindtree.pageobject.AtlanticLoginPage;
import com.mindtree.pageobject.AtlanticMyAccount;
import com.mindtree.reusablecomponents.WebdriverHelper;
import com.mindtree.utility.Excel;


public class AtlanticApplication extends WebdriverHelper {
	

public static Logger Log=LogManager.getLogger(AtlanticApplication.class.getName());
	//public WebDriver driver;
	
	int flag=0;
	@BeforeTest
	public void intializer() throws IOException {
		driver=intializeDriver();
		Log.info("Driver initialized");
	}
	@Test(priority=1)
	public void HomePage() throws InterruptedException {
		//driver.get(prop.getProperty("URL"));
		AtlanticHomePage AH=new AtlanticHomePage(driver);
		Thread.sleep(2000);
		Assert.assertTrue(AH.Navbar().isDisplayed());
		Log.info("Navbar is displayed");
		AH.Signin();
		
	}
//	@Test(priority=2,dependsOnMethods="HomePage")
//	public void AccountPage()
//	{
//		
//		driver.get("url");
//		AtlanticMyAccount AM=new AtlanticMyAccount(driver);
//		
//		//AM.EmailId().sendKeys("manasvi");
//		
//	}
	@Test(priority=2,dataProvider="getData")
	public void LoginPage(String email,String pass) throws InterruptedException, IOException
	{
		if(flag==1) {
			driver=intializeDriver();
			//driver.get(prop.getProperty("url"));
			
			}
		AtlanticHomePage AH=new AtlanticHomePage(driver);
		Thread.sleep(2000);		
		AH.MyAccount().click();
		AtlanticMyAccount AM=new AtlanticMyAccount(driver);
		AM.Email().sendKeys(email);
		AM.Pass().sendKeys(pass);
		AM.Signin().click();
		flag=1;
	}
	
	@Test(priority=3)
	public void SearchBook() throws InterruptedException, IOException
	{
		AtlanticHomePage AH=new AtlanticHomePage(driver);
		Thread.sleep(2000);	
		AtlanticBookSearchPage AS=new AtlanticBookSearchPage(driver);
		AtlanticAddToCart ATC=new AtlanticAddToCart(driver);
		Excel ex=new Excel();
		ArrayList<String> book=ex.getData("Books");
		for(int i = 1; i < book.size(); i++) {
			AS.SearchBox().sendKeys(book.get(i));
		
			AS.SearchBox().sendKeys(Keys.ENTER);
			Log.info("Searching for the book " + i);
		Thread.sleep(2000);
			ATC.AddToCart().click();
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[2][2];
		data[0][0]="manasv";
		data[0][1]="12345";
		data[1][0]="minnu";
		data[1][1]="2345";
		
		
		
		return data;
		
	}
	
//	@Test(priority=3)
//	public void LoginPage() {
//		AtlanticLoginPage AL=new AtlanticLoginPage(driver);
//
//		
//	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
