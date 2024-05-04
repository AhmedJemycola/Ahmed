package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class forgot {
	Webdriver driver;
	@Findby(xpath= "//*[@aria-label='Email or mobile number']")WebElement Forgotfieldsenter;
	@Findby(name="did_submit")WebElement searchbutton;
	
	public forgot(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void forgotpasswordfield() {
Forgotfieldsenter.sendKeys("hr@gmail.com");

	}
	public void Search

}
