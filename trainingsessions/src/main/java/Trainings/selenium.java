package Trainings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
	private static final String EmailFeild = null;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
			
				
					
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\newpa\\eclipse-workspace\\trainingsessions\\Driver\\chromedriver.exe");
					driver=new ChromeDriver();
					//driver.navigate().to("https://www.protrainingtech.com");
					driver.get("https://www.facebook.com");
					driver.manage().window().maximize();
					WebElement EmailField=driver.findElement(By.id("email"));
					EmailField .sendKeys("newpage1985@gmail.com");
					WebElement psswrdField=driver.findElement(By.name("pass"));
					psswrdField.sendKeys("Shahbaz");
					Thread.sleep(6000);
					
	}

}
