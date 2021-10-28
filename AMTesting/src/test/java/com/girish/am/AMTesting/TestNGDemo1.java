package com.girish.am.AMTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo1 {
	
	public WebDriver myD;
	
	@Test
	public void Google()
	{
		myD.get("https://www.google.com");
		String vTitle=myD.getTitle();
		System.out.println(vTitle);	
	}
	@BeforeTest
	public void SetUP()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004939\\Documents\\driver\\chromedriver.exe");
		myD=new ChromeDriver();
	}
	
	@AfterTest
	public void tearDown()
	{
		myD.close();
	}
	
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
