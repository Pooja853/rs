package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import UIstore.FacebookUi;

public class Facebook {

	WebDriver driver;
	public Facebook(WebDriver driver) {
		
		this.driver=driver;
	}
	@SuppressWarnings("deprecation")
	public void facebook()
	{
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(FacebookUi.select).click();
		driver.navigate().back();
}
}

