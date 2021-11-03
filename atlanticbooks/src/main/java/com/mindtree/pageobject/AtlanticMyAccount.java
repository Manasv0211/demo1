package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AtlanticMyAccount{
	
	public WebDriver driver;
	
	
	public AtlanticMyAccount(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	By createaccount=By.xpath("//*[@id=\'maincontent\']/div/div/div/div/div[3]/div[3]/div[2]/div[2]/div/div/a");
	By firstname=By.name("firstname");
	By lastname=By.name("lastname");
	By emailid=By.id("email_address");
	By password=By.name("password");
	By confirmpass=By.name("password_confirmation");
	By createbutton=By.xpath("//*[@id=\'form-validate\']/div/div[1]/button");
	By email=By.id("email");
	By pass=By.id("pass");
	By signin=By.id("send2");
	
	
	
	public WebElement CreateAccount() {
		return driver.findElement(createaccount);
	}
	public WebElement FirstName() {
		return driver.findElement(firstname);
	}
	public WebElement Lastname() {
		return driver.findElement(lastname);
	}
	public WebElement EmailId() {
		return driver.findElement(emailid);
	}
	public WebElement Password() {
		return driver.findElement(password);
	}
	public WebElement ConfirmPass() {
		return driver.findElement(confirmpass);
	}
	public WebElement CreateButton() {
		return driver.findElement(createbutton);
	}
	public WebElement Email() {
		return driver.findElement(email);
	}
	public WebElement Pass() {
		return driver.findElement(pass);
	}
	public WebElement Signin() {
		return driver.findElement(signin);
	}
	
	

	
	

}
