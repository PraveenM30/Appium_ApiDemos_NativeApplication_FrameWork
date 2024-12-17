package practice;

import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Practice.BaseClass;
import io.appium.java_client.AppiumBy;

public class Scroll extends BaseClass {

	@Test
	public void scrollYillElement() throws MalformedURLException {
		StartAppiumAndInvokeApp();
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		// Scroll till element
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		

		// Scroll till end
		boolean canScrollMore;
		do {
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
					.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "down", "percent", 1.0));

		} while (canScrollMore);

		tearDown();
	}
}
