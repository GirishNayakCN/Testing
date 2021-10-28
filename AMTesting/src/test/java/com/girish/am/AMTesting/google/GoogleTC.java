package com.girish.am.AMTesting.google;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class GoogleTC {
	
	@Test
	public void google() throws IOException {
		WebDriver driver = null;
		Properties properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\00004939\\git\\Testing\\AMTesting\\data.properties");
		properties.load(fileInputStream);
		
		String browser = properties.getProperty("browser");
		if ( browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004939\\Documents\\driver\\chromedriver.exe");
			  driver=new ChromeDriver();
		}else if ( browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\00004939\\Documents\\driver\\msedgedriver.exe");
			  driver=new EdgeDriver();
		}else {
			System.out.println("Invalid Browser");
			System.exit(0);
		}

		 		driver.manage().window().maximize();
				driver.get(properties.getProperty("url"));
				
				GoogleHomePage googleHomePage = new GoogleHomePage(driver);
				
				googleHomePage.SearchTextBox().sendKeys("Aris Global");
				googleHomePage.SearchButton().click();
				
				GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
				
				
				String vTitle = googleSearchPage.searchResult().getText();
				System.out.println(vTitle);
				driver.close();
	}

}
