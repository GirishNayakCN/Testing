package amazon;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class AmazonTest extends Base{
	
	@Test
	public void TS001() throws InterruptedException, IOException{
		
		baseFunction();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));
		
		//POM - Amazon Home page
		AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
		amazonHomePage.getSearchBox().sendKeys("iphone 13");
		amazonHomePage.getSearchButton().click();
		//POM - Amazon Search page
		AmazonSearchPage amazonSearchPage = new AmazonSearchPage(driver);
		amazonSearchPage.getGetItToday().click();
		String result = amazonSearchPage.getSearchResult().getText();
		System.out.println(result);
		
		Thread.sleep(2000);
		
	}
	@AfterTest
	public void closeDriver() {
		driver.close();
	}

}
