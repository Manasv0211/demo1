package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AtlanticBookSearchPage {
	
	public WebDriver driver;
	
	By searchbox=By.xpath("//*[@id=\'searchbox\']");
	By searchsymbol=By.xpath("//*[@id=\'searchbox_mini_form\']/div[2]/button");
	
	public AtlanticBookSearchPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement SearchBox() {
		return driver.findElement(searchbox);
	}
	public WebElement SearchSymbol() {
		return driver.findElement(searchsymbol);
	}
	//GMAT Official Guide Verbal Review 2022: Book + Online Question Bank (Paperback – 2021)
	//addto cart===//*[@id="maincontent"]/div/div/div/div[1]/div[3]/div[2]/div[2]/ol/li[1]/div/div/div[2]/div[3]/form/button

}
