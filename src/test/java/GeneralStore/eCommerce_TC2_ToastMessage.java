package GeneralStore;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Appium_RahulShetty1.Appium_RahulShetty1.BaseClass;
import io.appium.java_client.AppiumBy;

public class eCommerce_TC2_ToastMessage extends BaseClass {
	@Test
	public void toastMessage() throws MalformedURLException, InterruptedException {
		StartAppiumAndInvokeApp();

		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"));"));

		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Australia\"]")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField"));
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String toastMsg = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(toastMsg, "Please enter your name");

		tearDown();
	}
}