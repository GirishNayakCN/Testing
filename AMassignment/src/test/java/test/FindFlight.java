package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindFlight {
	
	public WebDriver driver = null;
	By vDeparture  = By.name("fromPort");
	By vDestination = By.name("toPort");
	By vFindFlight = By.xpath("/html/body/div[3]/form/div/input");
	
	
	public FindFlight(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getDeparture () {
		return driver.findElement(vDeparture);
	}
	
	public WebElement getDestination() {
		return driver.findElement(vDestination);
	}

	public WebElement getFindFlight() {
		return driver.findElement(vFindFlight);
	}
}
