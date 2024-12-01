package Appium_RahulShetty1.Appium_RahulShetty1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class scroll1 extends BaseClass {
	public void scrollToElement() throws InterruptedException {
	    boolean isElementFound = false;

	    while (!isElementFound) {
	        try {
	            // Check if the target element is visible
	            WebElement targetElement = driver.findElement(AppiumBy.accessibilityId("WebView"));
	            if (targetElement.isDisplayed()) {
	                isElementFound = true;
	                System.out.println("Element is now visible.");
	                break;
	            }
	        } catch (Exception e) {
	            // Element not visible, perform scroll gesture
	            WebElement scrollableContainer = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"WebView\"]"));
	            ((JavascriptExecutor) driver).executeScript(
	                "mobile: scrollGesture",
	                ImmutableMap.of(
	                    "elementId", ((RemoteWebElement) scrollableContainer).getId(),
	                    "direction", "down", // Scroll down
	                    "duration", 2000 // Optional duration of the scroll
	                )
	            );
	        }
	    }

	    if (!isElementFound) {
	        System.out.println("Element could not be found after scrolling.");
	    }
	    Thread.sleep(3000);
	    tearDown();
	}
}
