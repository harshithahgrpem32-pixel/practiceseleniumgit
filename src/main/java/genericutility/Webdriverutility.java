package genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Webdriverutility {

	public void maximize(WebDriver driver)
	{
      driver.manage().window().maximize();		
	}
	
	public void wait(WebDriver driver,int sec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
}
