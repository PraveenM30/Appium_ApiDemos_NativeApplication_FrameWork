package practice;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Practice.BaseClass;
import io.appium.java_client.AppiumBy;

public class Swipe extends BaseClass {
	
	@Test
public void Swipe() throws MalformedURLException {
	StartAppiumAndInvokeApp();
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();
	WebElement firstImg=driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
	Assert.assertEquals(firstImg.getAttribute("focusable"), "true");
	swipe(firstImg, "left");
	Assert.assertEquals(firstImg.getAttribute("focusable"), "false");
	tearDown();
}
}
