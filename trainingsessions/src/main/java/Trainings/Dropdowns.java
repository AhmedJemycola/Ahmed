package Trainings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\newpa\\eclipse-workspace\\trainingsessions\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.navigate().to("https://www.protrainingtech.com");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement Createbuttonclick=driver.findElement(By.linkText("Create new account"));
		Createbuttonclick.click();
		Thread.sleep(6000);
		WebElement Monthofbirth=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(Monthofbirth);
		ob.selectByValue("5");
		

	}

}
