package Trainings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setups {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\newpa\\eclipse-workspace\\trainingsessions\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.navigate().to("https://www.protrainingtech.com");
		driver.get("https://www.protrainingtech.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		String Title=driver.getTitle();
		String CurrentURL=driver.getCurrentUrl();
		String Session=driver.getWindowHandle();
		System.out.println(Title);
		System.out.println(CurrentURL);
		System.out.println(Session);
		

	}

}
