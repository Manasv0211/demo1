package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.reusablecomponents.WebdriverHelper;

public class AtlanticHomePage {
	
	public WebDriver driver;
	
	By myaccount=By.xpath("/html/body/div[2]/div[1]/div/div[1]/div/div/div[2]/div/ul/li[1]/a");
	By signin=By.xpath("/html/body/div[2]/div[1]/div/div[1]/div/div/div[2]/div/ul/li[4]/a");
	By navbar=By.xpath("/html/body/div[2]/div[1]/div/div[1]/div/div/div[2]");
	
	public AtlanticHomePage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement MyAccount() {
		return driver.findElement(myaccount);
	}	
	public WebElement Signin() {
		return driver.findElement(signin);
	}
	public WebElement Navbar() {
		return driver.findElement(navbar);
	}
	
	
	

}
