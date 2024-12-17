package org.Appium.Pageobjects;

import org.AppiumUtils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Preferences extends AndroidActions{

	AndroidDriver driver;
	public Preferences(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")
	private WebElement preferenceDependencies;
	public void preferenceDependencies() {
		preferenceDependencies.click();
	}
	@AndroidFindBy(id = "android:id/checkbox")
	private WebElement checkbox;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"WiFi settings\"]")
	private WebElement WifiSettings;
	@AndroidFindBy(id="android:id/edit")
	private WebElement textfield;
	@AndroidFindBy(id="android:id/button1")
	private WebElement OKButton;
	
	public void wifi(String WifiPassword) {
		checkbox.click();
		WifiSettings.click();
		textfield.sendKeys(WifiPassword);
		OKButton.click();
		checkbox.isSelected();
	}
}
