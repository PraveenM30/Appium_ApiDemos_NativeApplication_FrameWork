package Appium_RahulShetty1.Appium_RahulShetty1;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class WifiSetting extends BaseClass {
	private AppiumDriverLocalService service;

	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException, URISyntaxException {
		StartAppiumAndInvokeApp();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"WiFi\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"WiFi settings\"]")).click();
		String text = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(text, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Entered data");
		driver.findElement(By.id("android:id/button1")).click();
		driver.quit();
		tearDown();
	}
}
