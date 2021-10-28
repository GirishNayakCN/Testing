package amazon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Base {
	
	WebDriver driver = null;
	Properties properties = null;
	
	public void baseFunction() throws IOException, InterruptedException {
		properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream("data.properties");
		properties.load(fileInputStream);
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}
	
	

}
