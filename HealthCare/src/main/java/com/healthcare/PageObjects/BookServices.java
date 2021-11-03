package com.healthcare.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.healthcare.UIStore.BookServicesUI;

public class BookServices {
	
	WebDriver driver;
	
	public BookServices(WebDriver driver) {
		this.driver = driver;
	}
	

	public WebElement homeCareSelect() {
		return driver.findElement(BookServicesUI.homeCareSelect);
	}
	public WebElement presentDate() {
		return driver.findElement(BookServicesUI.presentDate);
	}
	
	public WebElement fullName() {
		return driver.findElement(BookServicesUI.fullName);
	}
	public WebElement email() {
		return driver.findElement(BookServicesUI.email);
	}
	public WebElement number() {
		return driver.findElement(BookServicesUI.number);
	}
	
	public WebElement confirmBooking() {
		return driver.findElement(BookServicesUI.confirm);
	}
}
