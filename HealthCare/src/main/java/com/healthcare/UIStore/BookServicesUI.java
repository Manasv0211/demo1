package com.healthcare.UIStore;

import org.openqa.selenium.By;

public class BookServicesUI {

	public static By homeCareSelect = By.xpath("//*[@id='post-219082']//button");
	
	public static By presentDate = By.xpath("//*[@id='et-main-area']/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[5]/td[6]");
	
	public static By fullName = By.id("emsb_user_fullName");
	
	public static By email = By.id("emsb_user_email");
	
	public static By number = By.id("emsb_user_telephone");
	
	public static By confirm = By.xpath("//button[@name='emsb_submit_booking']");
	
}
