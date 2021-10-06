package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Elements 
{
	
	public static void main(String a[])
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00004939\\Documents\\driver\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("https://www.mortgagecalculator.org/");
		myD.findElement(By.id("homeval")).sendKeys("5000");
		myD.findElement(By.name("param[downpayment]")).sendKeys("300");
		myD.findElement(By.name("param[downpayment_type]")).click();
		myD.findElement(By.id("intrstsrate")).sendKeys("5.5");
		myD.findElement(By.name("cal")).click();
		String vMPay=myD.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
		System.out.println(vMPay);
		myD.close();
		
	}

}


//TEST CASE
// STEP 01 : OPEN MortgageCalculator.org
// STEP 02 : ENTER HomeValue as 5000
// STEP 03 : ENTER Down Payment as 300
// STEP 04 : CLICK % Radio Button
// STEP 05 : ENTER Intrest Rate as 5.5
// STEP 06 : CLICK CALCULATE BUTTON
// STEP 07 : PRINT MONTLY PAYMENT