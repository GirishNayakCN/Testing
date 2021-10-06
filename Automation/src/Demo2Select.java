import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo2Select 
{
	
	public static void main(String a[]) throws InterruptedException
	{
		//String LoginPage="Login";
		//String ForgotPwdPage="Reset";
		//String JoinNow="Sign Up";
		//String vTitle;
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00004939\\Documents\\driver\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("https://www.mortgagecalculator.org/");
		System.out.println("It has navigated to : "+myD.getTitle());
		Thread.sleep(4000);
		
		Select select=new Select(myD.findElement(By.name("param[start_month]")));
		select.selectByIndex(4);
		Thread.sleep(4000);
		select.selectByValue("8");
		Thread.sleep(4000);
		select.selectByVisibleText("Dec");
		Thread.sleep(4000);
		myD.close();

		
		
		
				
	}

}


