import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo3ImplicitWait 
{
	
	public static void main(String a[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004939\\Documents\\driver\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(myD, 20);
		myD.get("https://www.mortgagecalculator.org/");
		myD.findElement(By.id("homeval")).sendKeys("5000");
		myD.findElement(By.name("param[downpayment]")).sendKeys("300");
		myD.findElement(By.name("param[downpayment_type]")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("intrstsrate")));
		myD.findElement(By.id("intrstsrate")).sendKeys("5.5");
		
		myD.findElement(By.name("calculateWRONG")).click();
		
		
		myD.close();
		
	}

}


