import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Elements3 
{
	
	public static void main(String a[]) throws InterruptedException
	{
		//String LoginPage="Login";
		//String ForgotPwdPage="Reset";
		//String JoinNow="Sign Up";
		//String vTitle;
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00004939\\Documents\\driver\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("https://www.linkedin.com/login");
	
		System.out.println("It has navigated to : "+myD.getTitle());
		myD.findElement(By.xpath("//input[@id='username']")).sendKeys("sam");
		myD.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		myD.findElement(By.xpath("//*[@id='password-visibility-toggle' and @class='button__password-visibility']")).click();
		
		Thread.sleep(5000);
		
		
		myD.findElement(By.partialLinkText("Forgot")).click();
		System.out.println("It has navigated to : "+myD.getTitle());
		myD.findElement(By.name("userName")).sendKeys("sam@abc.com");
		myD.findElement(By.linkText("Join now")).click();
		System.out.println("It has navigated to : "+myD.getTitle());
		
		myD.navigate().to("https://www.amazon.in/");
		myD.findElement(By.xpath("//div[@id='nav-main']/div[2]/div/div/a[1]")).click();
		Thread.sleep(5000);
		myD.close();
		
		
		
		
		
	}

}


/*
 * XPATH -- XML PATH to identify the element
 * 
 * Absolute XPATH :
 * /html/body/div[2]/div[1]/div/h4[1]/b/html[1]/body[1]/div[2]/div[1]/div[1]/h4[
 * 1]/b[1] Relative XPATH : //tagname[@attribute='value']
 * //input[@placeholder='Email or mobile'] //*[@placeholder='Email or mobile']
 * //input[@placeholder='Email or mobile' and id='email']
 * //input[@placeholder='Email or mobile' or id='email']
 * 
 * Absolute XPATH : //div[@id='nav-main']/div[2]/div/div/a[1]
 */



