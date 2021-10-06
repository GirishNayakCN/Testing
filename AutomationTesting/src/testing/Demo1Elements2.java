package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Elements2 
{
	
	public static void main(String a[])
	{
		//String LoginPage="Login";
		//String ForgotPwdPage="Reset";
		//String JoinNow="Sign Up";
		//String vTitle;
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00004939\\Documents\\driver\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("https://www.linkedin.com/login");
	
		System.out.println("It has navigated to : "+myD.getTitle());
				
		myD.findElement(By.id("username")).sendKeys("sam");
		myD.findElement(By.id("password")).sendKeys("1234");
		myD.findElement(By.partialLinkText("Forgot")).click();
		System.out.println("It has navigated to : "+myD.getTitle());
		myD.findElement(By.name("userName")).sendKeys("sam@abc.com");
		myD.findElement(By.linkText("Join now")).click();
		System.out.println("It has navigated to : "+myD.getTitle());
		myD.close();
		
	}

}


//TEST CASE
// STEP 01 : OPEN Linkedin.com
// STEP 02 : ENTER Username as sam
// STEP 03 : ENTER Password as 1234
// STEP 04 : CLICK Forgot Password
// STEP 05 : ENTER EMAIL sam@abc.com	
// STEP 06 : CLICK Join Now