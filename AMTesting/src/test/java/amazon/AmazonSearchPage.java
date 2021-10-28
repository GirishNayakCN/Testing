package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchPage {
	
	public WebDriver driver;
	
	public AmazonSearchPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By vGetItToday = By.xpath("//span[text()='Get It by Tomorrow']");
	
	public WebElement getGetItToday() {
		return driver.findElement(vGetItToday);
	}
	
	By vSearchResult = By.xpath("//*[@id=\'search\']/span/div/span/h1/div/div[1]/div/div/span[1]");
	
	public WebElement getSearchResult() {
		return driver.findElement(vSearchResult);
	}

}
