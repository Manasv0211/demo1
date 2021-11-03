package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AtlanticLoginPage {
	public WebDriver driver;
	
	By email=By.xpath("//*[@id=\'email\']");
	By password=By.xpath("//*[@id=\'pass\']");
	By SIGNIN=By.xpath("//*[@id=\'send2\']");
	
	public AtlanticLoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement Emial()
	{
		return driver.findElement(email);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement Submit()
	{
		return driver.findElement(SIGNIN);
	}

}
