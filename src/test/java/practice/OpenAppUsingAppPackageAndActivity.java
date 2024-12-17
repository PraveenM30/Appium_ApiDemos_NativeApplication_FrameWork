package practice;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Practice.BaseClass;

public class OpenAppUsingAppPackageAndActivity extends BaseClass {

	@Test
	public void OpenAppWifiSetting() throws MalformedURLException {
		StartAppiumAndInvokeApp();
		((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of("intent",
				"io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));

		driver.findElement(By.xpath("//android.widget.TextView[@text=\"WiFi\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"WiFi settings\"]")).click();
		String text = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(text, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Entered data");
		driver.findElement(By.id("android:id/button1")).click();
		tearDown();
	}
}