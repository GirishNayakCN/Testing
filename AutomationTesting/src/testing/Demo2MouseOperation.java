package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2MouseOperation 
{
	
	public static void main(String a[]) throws InterruptedException
	{
		//String LoginPage="Login";
		//String ForgotPwdPage="Reset";
		//String JoinNow="Sign Up";
		//String vTitle;
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00004939\\Documents\\driver\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("http://www.youcandealwithit.com/");
		System.out.println("It has navigated to : "+myD.getTitle());
		
		Thread.sleep(4000);
		
		Actions act=new Actions(myD);
		act.moveToElement(myD.findElement(By.linkText("BORROWERS"))).build().perform();
		Thread.sleep(4000);
		
		myD.findElement(By.linkText("Calculators & Resources")).click();
		
//		STEP01: Navigate to Amazon.in
//		STEP02: Hover on Hello Signin 
//		STEP03: Click on Sign in
//		STEP04: ER --> It should navigate to Signin Page
//		STEP05: Close App



		
		
		
				
	}

}


