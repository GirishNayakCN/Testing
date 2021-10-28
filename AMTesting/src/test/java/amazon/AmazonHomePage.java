package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {

	public WebDriver driver;
	
	public AmazonHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By vSearchButton = By.id("nav-search-submit-button");
	By vSearchBox = By.id("twotabsearchtextbox");
	
	public WebElement getSearchButton() {
		return driver.findElement(vSearchButton);
	}
	
	public WebElement getSearchBox() {
		return driver.findElement(vSearchBox);
	}
}
