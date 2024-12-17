package Practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.WebSocket;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	private AppiumDriverLocalService service;
	public AndroidDriver driver;

	public void StartAppiumAndInvokeApp() throws MalformedURLException {

//	AppiumDriverLocalService service = new AppiumServiceBuilder()
//			.withAppiumJS(
//					new File("C:\\Users\\user\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//			.withIPAddress("127.0.0.1").usingPort(4723).build();
//	service.start();

		try {
			AppiumServiceBuilder builder = new AppiumServiceBuilder();
			builder.withIPAddress("127.0.0.1");
			builder.usingPort(4723);
			builder.withArgument(() -> "--base-path", "/wd/hub");
			service = AppiumDriverLocalService.buildService(builder);
			service.start();
			Thread.sleep(5000);

			if (service.isRunning()) {
				System.out.println("Appium Server started on: " + service.getUrl());
			} else {
				throw new RuntimeException("Appium Server failed to start!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

//	DesiredCapabilities capabilities = new DesiredCapabilities();
//	capabilities.setCapability("deviceName", "Pixel8");
//	capabilities.setCapability("platformName", "Android");
//	capabilities.setCapability("automationName", "uiautomator2"); // Set the automation engine to uiautomator2
//	capabilities.setCapability("", "Android");
//	capabilities.setCapability("app",
//			"C:\\Users\\user\\eclipse-workspace\\Appium_RahulShetty1\\resources\\ApiDemos-debug.apk");

		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		//options.setDeviceName("Pixel8");
		options.setUdid("RZ8W1077NCV");
		//options.setApp("C:\\Users\\user\\eclipse-workspace\\Appium_RahulShetty1\\resources\\ApiDemos-debug.apk");
		options.setApp("C:\\Users\\user\\eclipse-workspace\\Appium_RahulShetty1\\resources\\General-Store.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void tearDown() {
		driver.quit();
		service.stop();
	}
	public void longPress(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),"duration",2000));
	}
	public void ScrollTillEnd() {
		boolean canScrollMore;
		do {
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
					.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "down", "percent", 1.0));
			
		} while (canScrollMore);
	}
	public void swipe(WebElement ele,String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),"direction",direction,"percent",0.25));
	}
	public void dragByCoOrdinate(WebElement ele, int x,int y) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "endX", x, "endY", y));
	}
}
