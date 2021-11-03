package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AtlanticAddToCart {
	
	
	public WebDriver driver;
	
	
	
	public AtlanticAddToCart(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
			
	}
	
	By addtocart=By.xpath("//*[@id=\'maincontent\']/div/div/div/div[1]/div[3]/div[2]/div[2]/ol/li[1]/div/div/div[2]/div[3]/form/button");
	



	public WebElement AddToCart() {
		return driver.findElement(addtocart);
	}
	

}
