package com.irctc.Base;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends BrowserDriverLib implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
		failScreenshot(result.getMethod().getMethodName());
	}
	
}
