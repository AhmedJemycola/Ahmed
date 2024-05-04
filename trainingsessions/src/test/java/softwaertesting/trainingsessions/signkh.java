package softwaertesting.trainingsessions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class signkh {
	 WebDriver driver;
	 
	
  @Test
  public void f() {{
			// TODO Auto-generated method stub
			
	WebElement password =driver.findElement(By.id("password"));
	password.sendKeys("SuperSecretPassword!");
	WebElement Login= driver.findElement(By.className("radius"));}
	WebElement username = driver.findElement(By.name("username"));
	username.sendKeys("tomsmith");
  }
  @BeforeMethod
  public void beforeMethod() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\newpa\\eclipse-workspace\\trainingsessions\\Driver\\chromedriver.exe");
		//driver=new ChromeDriver();
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\newpa\\eclipse-workspace\\trainingsessions\\Driver\\msedgedriver.exe");
	  driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
  
  } public void Ibrowsers(String browser) }
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\newpa\\Downloads\\edgedriver_win64"){
			  driver=new chromeDriver();
		  }else {
			  System.out.println("Name of browser didn't exist");
			  
		  }
	  }
  
  
		
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
	  Thread.sleep(6000);
	  driver.quit();
  }

}
