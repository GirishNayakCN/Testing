import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2Elements4 
{
	
	public static void main(String a[]) throws InterruptedException
	{
		//String LoginPage="Login";
		//String ForgotPwdPage="Reset";
		//String JoinNow="Sign Up";
		//String vTitle;
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00004939\\Documents\\driver\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("https://www.google.com/");
		System.out.println("It has navigated to : "+myD.getTitle());
		
		myD.findElement(By.name("q")).sendKeys("SELENIUM");
		Thread.sleep(4000);
		
		//myD.findElement(By.name("btnK")).click();
		myD.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
		
		
		
		//int vSize=myD.findElements(By.xpath("//input[@type='submit']")).size();
		//System.out.println(vSize);
		Thread.sleep(4000);
		
		myD.close();
		
		
				
	}

}


//WRITE A TEST TO:

//STEP01: Navigate to Google.com
//STEP02: Enter Search Text as SELENIUM in Google Search (No Hard Coded Data, The data has to come from Variable)
//STEP03: Click Google Search
//STEP04: Capture the Search Text from the result page and check if that is same as the entered text in the home page
//STEP05: IF both are same then PASS else FAIL
//STEP06: Close the Browser
