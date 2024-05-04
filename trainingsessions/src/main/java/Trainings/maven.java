package Trainings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class maven {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\newpa\\eclipse-workspace\\trainingsessions\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		WebElement username = driver.findElement(By.name("username"));
username.sendKeys("tomsmith");
WebElement password =driver.findElement(By.id("password"));
password.sendKeys("SuperSecretPassword!");
WebElement Login= driver.findElement(By.className("radius"));
Login.click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
