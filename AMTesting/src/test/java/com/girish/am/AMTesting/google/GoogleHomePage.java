package com.girish.am.AMTesting.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
	public WebDriver driver;
	
	public GoogleHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By SearchTextBox = By.name("q");
	By SearchButton = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	
	public WebElement SearchTextBox() {
		return driver.findElement(SearchTextBox);
	}
	
	public WebElement SearchButton() {
		return driver.findElement(SearchButton);
	}
}
