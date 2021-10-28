package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchaseConfirmation {
	
	public WebDriver driver;
	
	By vAmount = By.xpath("//div/table/tbody/tr[3]/td[2]");
	By vCardNo = By.xpath("//div/table/tbody/tr[4]/td[2]");
	By vExpiration = By.xpath("//div/table/tbody/tr[5]/td[2]");
	
	public PurchaseConfirmation(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public String getAmount() {
		return driver.findElement(vAmount).getText();
	}
	
	public String getCardNo() {
		return driver.findElement(vCardNo).getText();
	}
	
	public String getExpiration() {
		return driver.findElement(vExpiration).getText();
	}
	
}
