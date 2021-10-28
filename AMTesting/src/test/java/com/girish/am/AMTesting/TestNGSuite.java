package com.girish.am.AMTesting;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNGSuite 
{
	
	
	@BeforeSuite
	public void suitestart() throws InterruptedException
	{
		System.out.println("Starting Browser........");
		Thread.sleep(5000);
	}
	
	@AfterSuite
	public void suiteend() throws InterruptedException
	{
		System.out.println("Closing Browser........");
		Thread.sleep(5000);
	}
	
	

}
