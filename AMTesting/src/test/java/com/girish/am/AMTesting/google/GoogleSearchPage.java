package com.girish.am.AMTesting.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
public WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	By vSearchResult = By.xpath("//*[@id=\'result-stats\']");
	
	public WebElement searchResult() {
		return driver.findElement(vSearchResult);
	}

}
