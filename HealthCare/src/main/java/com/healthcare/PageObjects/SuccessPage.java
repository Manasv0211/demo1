package com.healthcare.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.healthcare.UIStore.SuccessPageUI;

public class SuccessPage {

	WebDriver driver;
	
	public SuccessPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement finish() {
		return driver.findElement(SuccessPageUI.finish);
	}
}
