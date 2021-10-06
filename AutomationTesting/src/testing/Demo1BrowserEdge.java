package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1BrowserEdge {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00004939\\Documents\\driver\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("https://www.google.com");
		String vTitle=myD.getTitle();
		System.out.println(vTitle);
		myD.close();
		
		
		// WRITE A PROGRAM WHICH WILL READ USER INPUT
		// Enter The Browser Name to Test Google.com
		// If the user enters Chrome then the same above script should be executed in Chrome
		// If the user enters Edge then the same above script should be executed in Edge Browser
		// If the user enters any other input then it should print - Browser Not Supported. 

	}

}