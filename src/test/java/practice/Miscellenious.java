package practice;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import Practice.BaseClass;

public class Miscellenious extends BaseClass {
	@Test
	public void Miscelleniouss() throws MalformedURLException, InterruptedException, URISyntaxException {
		StartAppiumAndInvokeApp();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"WiFi\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"WiFi settings\"]")).click();
		String text = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(text, "WiFi settings");
		// enter from clipBoard
		driver.setClipboardText("Praveen Wifi");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());

		driver.findElement(By.id("android:id/button1")).click();
		// rotate device to landscape
		DeviceRotation landscape = new DeviceRotation(0, 0, 90);
		driver.rotate(landscape);

		// press Enter Key
//		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		driver.pressKey(new KeyEvent(AndroidKey.HOME));

		tearDown();
	}
}
