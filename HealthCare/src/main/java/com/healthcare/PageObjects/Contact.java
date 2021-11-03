package com.healthcare.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.healthcare.UIStore.ContactUI;

public class Contact {

	WebDriver driver;
	public Contact(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement name() {
		return driver.findElement(ContactUI.name);
	}
	public WebElement email() {
		return driver.findElement(ContactUI.email);
	}
	public WebElement message() {
		return driver.findElement(ContactUI.message);
	}
	public WebElement submit() {
		return driver.findElement(ContactUI.submit);
	}
	public WebElement getInTouch() {
		return driver.findElement(ContactUI.getInTouch);
	}
}
