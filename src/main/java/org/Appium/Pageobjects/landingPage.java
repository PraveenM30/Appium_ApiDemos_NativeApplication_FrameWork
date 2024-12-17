package org.Appium.Pageobjects;

import org.AppiumUtils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class landingPage extends AndroidActions{

	AndroidDriver driver;
	public landingPage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
	private WebElement views;
	
	public void views() {
		views.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Preference\"]")
	private WebElement preferences;
	public void preferences() {
		preferences.click();
	}
}
