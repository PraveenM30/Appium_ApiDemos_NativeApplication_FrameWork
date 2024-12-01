package GeneralStore;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Appium_RahulShetty1.Appium_RahulShetty1.MobileBrowserBaseClass;

public class InVokeChromeBrowser extends MobileBrowserBaseClass {
	@Test
	public void ChromeBrowser() throws MalformedURLException, InterruptedException {
		StartAppiumAndInvokeApp();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("q")).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		tearDown();
	}
}
