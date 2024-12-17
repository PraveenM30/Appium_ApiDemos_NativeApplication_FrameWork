package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class InvokeApp {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		  DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel8");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", "C:\\Users\\user\\eclipse-workspace\\Appium_RahulShetty1\\resources\\ApiDemos-debug.apk");
       // capabilities.setCapability("appPackage", "io.appium.android.apis");
        //capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
        //capabilities.setCapability("udid","963441747600040");
        
        
    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
   
    driver.quit();
	}
}
