package com.mindtree.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mindtree.reusablecomponents.WebdriverHelper;

public class ScreenShot extends WebdriverHelper {
	
	public void getSS(String result) throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot) driver);
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		//String ss=System.getProperty("D:\\Selenium\\Selenium-Programs\\Framework\\Screenshot")+result+" ScreenShot"+".png";
		//File destFile=new File(ss);
		//FileUtils.copyFile(srcFile,destFile);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		FileUtils.copyFile(srcFile,new File("P:/Selenium/GitRepo/atlanticbooks/ScreenShot/SS"+ result+ getCurrentDate() +System.currentTimeMillis()+".png"));
		
			//return ss;
	}
	public static String getCurrentDate() {

		DateFormat df = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date date = new Date();
		return df.format(date);

	}

}
