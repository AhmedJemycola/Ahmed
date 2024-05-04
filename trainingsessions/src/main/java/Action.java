import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\newpa\\eclipse-workspace\\trainingsessions\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.navigate().to("https://www.protrainingtech.com");
		driver.get("https://www.Lexus.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement Shoplinks=driver.findElement(By.xpath("//*[text()='shop' and@aria-expanded='false']"));
		Action ob=new Action();
		ob.moveToElement
		
			
				
				
				

	}

}
