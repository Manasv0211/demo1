package com.healthcare.utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReporter {

	public static ExtentReports report;
	public ExtentReporter(String path) {
		
		report = new ExtentReports(path);
	}


	public void endTest(ExtentTest test) {
		// TODO Auto-generated method stub
		report.endTest(test);
	}

	public void close() {
		// TODO Auto-generated method stub
		report.flush();
	}


	public ExtentTest startTest(String classname) {
		// TODO Auto-generated method stub
		return report.startTest(classname);
	}
	
}
