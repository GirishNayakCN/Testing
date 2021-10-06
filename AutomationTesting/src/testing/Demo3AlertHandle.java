package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3AlertHandle 
{
	
	public static void main(String a[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004939\\Documents\\driver\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(4000);
		myD.findElement(By.xpath("//button[text()='Click me!']")).click();
		System.out.println(myD.switchTo().alert().getText());
		myD.switchTo().alert().accept();
		Thread.sleep(4000);
		
		myD.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
		System.out.println(myD.switchTo().alert().getText());
		Thread.sleep(4000);
		myD.switchTo().alert().dismiss();
		
		Thread.sleep(4000);
		myD.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		System.out.println(myD.switchTo().alert().getText());
		myD.switchTo().alert().sendKeys("Samsaravananr");
		myD.switchTo().alert().accept();
		Thread.sleep(6000);
		
		myD.close();
	}

}
