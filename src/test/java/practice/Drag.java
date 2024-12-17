package practice;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Appium_RahulShetty1.Appium_RahulShetty1.BaseClass;
import io.appium.java_client.AppiumBy;

public class Drag extends BaseClass {
	@Test
	public void drag() throws MalformedURLException, InterruptedException {
		StartAppiumAndInvokeApp();
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		dragByCoOrdinate(source,617,617);
		Assert.assertEquals(driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText(), "Dropped!");
		tearDown();
	}
}
