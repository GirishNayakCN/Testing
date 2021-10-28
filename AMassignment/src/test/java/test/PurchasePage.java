package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchasePage {
	public WebDriver driver;
	By vName = By.id("inputName");
	By vAddress = By.id("address");
	By vCity = By.id("city");
	By vState = By.id("state");
	By vZipCode = By.id("zipCode");
	By vCreditCardNumber = By.id("creditCardNumber");
	By vNameOnCard = By.id("nameOnCard");
	By VRememberMe = By.id("rememberMe");
	
	By vPurchaseFlight = By.xpath("//input[@value='Purchase Flight']");
	
	
	public PurchasePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getName() {
		return driver.findElement(vName);
	}
	public WebElement getAddress() {
		return driver.findElement(vAddress);
	}
	
	public WebElement getState() {
		return driver.findElement(vState);
	}
	
	public WebElement getCity() {
		return driver.findElement(vCity);
	}
	
	public WebElement getZipCode() {
		return driver.findElement(vZipCode);
	}
	
	public WebElement getCCNo() {
		return driver.findElement(vCreditCardNumber);
	}
	
	public WebElement getCCName() {
		return driver.findElement(vNameOnCard);
	}
	
	public WebElement getRememberMe() {
		return driver.findElement(VRememberMe);
	}
	
	public WebElement getPurchaseFlight() {
		return driver.findElement(vPurchaseFlight);
	}
	
	
}
