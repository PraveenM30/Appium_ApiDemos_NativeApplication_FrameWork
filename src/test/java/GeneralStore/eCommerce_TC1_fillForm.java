package GeneralStore;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Appium_RahulShetty1.Appium_RahulShetty1.BaseClass;
import io.appium.java_client.AppiumBy;

public class eCommerce_TC1_fillForm extends BaseClass{

	@Test
	public void fillForm1() throws MalformedURLException, InterruptedException {
		StartAppiumAndInvokeApp();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"));"));
		
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Australia\"]")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Panda");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(2000);
		tearDown();
	}
}
