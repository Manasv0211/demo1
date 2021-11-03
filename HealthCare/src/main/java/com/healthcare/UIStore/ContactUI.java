package com.healthcare.UIStore;

import org.openqa.selenium.By;

public class ContactUI {

	
	public static By name = By.id("et_pb_contact_name_0");
	
	public static By email = By.id("et_pb_contact_email_0");
	
	public static By message = By.id("et_pb_contact_message_0");
	
	public static By submit = By.xpath("//*[@name='et_builder_submit_button']");
	
	public static By getInTouch = By.id("et_pb_contact_form_0");
}
