package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlazeDemoPage extends DriverLoad{
	
	public String URL;

	
	@Test
	public void blazeDemo() throws IOException, InterruptedException {
		
		LoadDriver();
		
		URL = properties.getProperty("url");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(URL);
		
		String vHomePageTitle;
		vHomePageTitle = driver.getTitle();
		
		Assert.assertEquals(vHomePageTitle, properties.getProperty("hometitle"));
		
		FindFlight findFlight = new FindFlight(driver);
		
		Select vDeparture = new Select(findFlight.getDeparture());
		vDeparture.selectByValue("Boston");
		
		Select vDestination = new Select(findFlight.getDestination());
		vDestination.selectByValue("New York");
		findFlight.getFindFlight().click();
		
		String vReserv = driver.getTitle();
		
		Assert.assertEquals(vReserv, properties.getProperty("reservetitle"));
		
		FlightReserve flightReserve = new FlightReserve(driver);
		flightReserve.getFlightReserv().click();
		
		String vPurchaseTitle = driver.getTitle();
		Assert.assertEquals(properties.getProperty("purchasetitle"), vPurchaseTitle);
		
		PurchasePage purchasePage = new PurchasePage(driver);
		purchasePage.getName().sendKeys(properties.getProperty("name"));
		purchasePage.getAddress().sendKeys(properties.getProperty("address"));
		purchasePage.getCity().sendKeys(properties.getProperty("city"));
		purchasePage.getState().sendKeys(properties.getProperty("state"));
		purchasePage.getZipCode().sendKeys(properties.getProperty("zipcode"));
		purchasePage.getCCName().sendKeys(properties.getProperty("nameoncard"));
		purchasePage.getCCNo().sendKeys(properties.getProperty("ccno"));
		purchasePage.getRememberMe().click();
		purchasePage.getPurchaseFlight().click();
		
		
		PurchaseConfirmation purchaseConfirmation = new PurchaseConfirmation(driver);
		String vAmount = purchaseConfirmation.getAmount();
		String vCCno = purchaseConfirmation.getCardNo();
		String vExpiration = purchaseConfirmation.getExpiration();
		
		
		System.out.println("Amount :" + vAmount);
		System.out.println("Card Number :" + vCCno);
		System.out.println("Expiration :" + vExpiration);
		
		//Thread.sleep(5000);
		driver.close();
	}
	

	

}
