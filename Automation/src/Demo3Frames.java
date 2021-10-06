import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3Frames {

	
	public static String vText;
	
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004939\\Documents\\driver\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.get("https://jqueryui.com/droppable/");
		
		myD.manage().window().maximize();
		vText=myD.findElement(By.className("entry-title")).getText();
		System.out.println(vText);
		
		int frmsize=myD.findElements(By.tagName("iframe")).size();
		System.out.println(frmsize);

		// myD.switchTo().frame(0); - Identifying Frame with Index
				
		myD.switchTo().frame(myD.findElement(By.xpath("//iframe[@class='demo-frame']"))); //- Identify Frame with Specific attribute 
		
		//myD.switchTo().frame("name / ID");
		vText=myD.findElement(By.id("draggable")).getText();
		System.out.println(vText);
		WebElement source=myD.findElement(By.id("draggable"));
		WebElement dest=myD.findElement(By.id("droppable"));
		
		Actions act=new Actions(myD);
		act.dragAndDrop(source, dest).build().perform();
		
		myD.switchTo().defaultContent();
		vText=myD.findElement(By.className("entry-title")).getText();
		System.out.println(vText);
		Thread.sleep(3000);
		myD.close();

	}

}
