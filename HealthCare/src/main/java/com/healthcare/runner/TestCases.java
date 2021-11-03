package com.healthcare.runner;


import org.testng.annotations.Test;

import com.healthcare.reusableComponents.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

public class TestCases extends BaseClass{

	
	// TestCase 1: To open homepage and click on "Book Available Services" and then 
	//				to verify the current page title of driver
	@Test(priority=1)
	public void titleValidation() {
		driver.get(config.getURL());	// To open URL
		log.info("Driver open URL and entered into Landing Page");
		homepage.bookServices().click();
		log.info("System clicked on Book Available Services");
//		Assert.assertEquals(driver.getTitle(), "Services | Healthcare");
		
		if(driver.getTitle().equalsIgnoreCase("Services | Healthcare")) {
			log.debug("Successfully navigated to Services Page");
			test.log(LogStatus.PASS, "Successfully navigated to Services Page");
		}
		else {
			log.debug("Failed to navigate to services page");
			test.log(LogStatus.FAIL, "Failed to navigate to services page");
		}
		
	}
	
	// TestCase 2: To open homepage and click on "Book an Appointment" and then
	// 				it will navigate to Book-Service page and then selects HomeCare
	//				then enters the given data to book appointment
	
	@Test(priority =2)
	public void HomeCarebooking() {
		
		driver.get(config.getURL());
		log.info("Driver open URL and entered into Landing Page");
		
		homepage.bookAppointment().click();
		log.info("System clicked on Book Appointment");
		
		bookServices.homeCareSelect().click();
		log.info("System selected HomeCare Select button");
		
		bookServices.presentDate().click();
		log.info("System selected current date");
		
		bookServices.fullName().sendKeys("Sample name");
		bookServices.email().sendKeys("sample@email.com");
		bookServices.number().sendKeys("12345678");
		bookServices.confirmBooking().click();
		log.debug("System entered given details and clicked on confirm booking");
		
		
		if(successPage.finish().isDisplayed()) {
			log.debug("Successfully submitted the details");
			test.log(LogStatus.PASS, "Successfully submitted the details");
		}
		else {
			log.debug("Failed to Submit the Details");
			test.log(LogStatus.FAIL, "Failed to Submit the Details");
		}
	}
	
	// TestCase 3: To open homepage and click on "Contact" and then
	//				enters the details and then submit --> To verify the submission
	
	@Test(priority=3)
	public void contactTest() {
		
		driver.get(config.getURL());
		log.info("Driver open URL and entered into Landing Page");
		
		homepage.contact().click();
		log.info("System clicked on Contact option");
		
		contact.name().sendKeys("My name");
		contact.email().sendKeys("email@email.com");
		contact.message().sendKeys("Some sample message");
		contact.submit().click();
		log.info("System entered the given details and clicked on Submit");
		
//		System.out.println(contact.getInTouch().isDisplayed());
//		Assert.assertTrue(contact.getInTouch().isDisplayed());	//To verify submission
		
		if(contact.getInTouch().isDisplayed()) {
			log.debug("Successfully submitted the details");
			test.log(LogStatus.PASS, "Successfully submitted the details");
		}
		else {
			log.debug("Failed to Submit the Details");
			test.log(LogStatus.FAIL, "Failed to Submit the Details");
		}
	}
	
	
}
