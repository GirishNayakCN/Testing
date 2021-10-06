package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2Elements5 
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
		
		int vSize=myD.findElements(By.tagName("a")).size();
		System.out.println(vSize);
		
		for (int i=0;i<vSize;i++)
		{
			//String vLink=myD.findElements(By.tagName("a")).get(i).getAttribute("href");
			String vLink=myD.findElements(By.tagName("a")).get(i).getText();
			System.out.println(vLink);
		}
		
		myD.close();
		
		// if the link contains signin then it should click on sign in and break the loop
				
	}

}


