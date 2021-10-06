import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3WindowHandle {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004939\\Documents\\driver\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.get("https://www.gmail.com");
		//System.out.println(myD.getCurrentUrl());
		System.out.println(myD.getTitle());
		myD.findElement(By.linkText("Help")).click();
		Set<String> GID=myD.getWindowHandles();
	//	System.out.println(GID);
		Iterator<String> GIT=GID.iterator();
		String GParent=GIT.next();
		String GChild=GIT.next();
		myD.switchTo().window(GChild);
		
		System.out.println(myD.getTitle());
		//myD.close();
		myD.quit();

	}

}
