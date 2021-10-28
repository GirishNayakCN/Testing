package com.girish.am.AMTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004939\\Documents\\driver\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.get("https://www.google.com");
		String vTitle=myD.getTitle();
		System.out.println(vTitle);
		myD.close();

	}

}
