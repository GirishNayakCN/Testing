package amazon;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AmazonPageTitle extends Base{
	
	@Test
	public void TS002() throws IOException, InterruptedException {
		baseFunction();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));
		Assert.assertEquals(driver.getTitle(), properties.get("amazontitle"));
		System.out.println(driver.getTitle());
		
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
	}

}

