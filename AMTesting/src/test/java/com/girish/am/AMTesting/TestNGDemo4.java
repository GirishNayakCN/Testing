package com.girish.am.AMTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDemo4 {

	
	@Test
	@Parameters({"URL"})
	public void OpenApp(String URL)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004939\\Documents\\driver\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.get(URL);
		String vTitle=myD.getTitle();
		System.out.println(vTitle);
		myD.close();
		
	}

}
