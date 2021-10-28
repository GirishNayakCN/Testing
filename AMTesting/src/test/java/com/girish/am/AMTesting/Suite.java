package com.girish.am.AMTesting;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Suite {
	@BeforeSuite
	public void startTest() {
		System.out.println("Start test....");
	}
	
	@AfterSuite
	public void endTest() {
		System.out.println("End test.....");
	}
}
