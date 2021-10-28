package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class DriverLoad {

	WebDriver driver = null;
	Properties properties = null;
	
	public void LoadDriver() throws IOException, InterruptedException {
		properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream("data.properties");
		properties.load(fileInputStream);
		
		if ( properties.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver=new ChromeDriver();
		} else if ( properties.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
			driver=new EdgeDriver();
		} else {
			System.exit(0);
		}
		
		
		
		
	}
}
