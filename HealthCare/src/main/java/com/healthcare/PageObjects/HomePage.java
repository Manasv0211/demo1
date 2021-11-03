package com.healthcare.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.healthcare.UIStore.HomePageUI;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement bookServices() {
		return driver.findElement(HomePageUI.bookServices);
	}
	
	public WebElement bookAppointment() {
		return driver.findElement(HomePageUI.bookAppointment);
	}
	
	public WebElement contact() {
		return driver.findElement(HomePageUI.contact);
	}
}
