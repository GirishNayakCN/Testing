package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightReserve {
	
	public WebDriver driver;
	By vSelectFlight = By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input");
	
	public FlightReserve(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getFlightReserv() {
		return driver.findElement(vSelectFlight);
	}

}
