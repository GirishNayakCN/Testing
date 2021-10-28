package com.girish.am.AMTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGDemo3 {
	
	public WebDriver myD;
	
	@Test
	@Parameters({"URL"})
	public void OpenApp(String URL)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004939\\Documents\\driver\\chromedriver.exe");
		myD=new ChromeDriver();
		myD.get(URL);
		String vTitle=myD.getTitle();
		System.out.println(vTitle);
		myD.close();
		
	}

}
