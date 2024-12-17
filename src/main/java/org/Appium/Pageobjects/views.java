package org.Appium.Pageobjects;

import org.AppiumUtils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class views extends AndroidActions {

	AndroidDriver driver;

	public views(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

//--------------------------TC001----------------------------------------------------------------------------------
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Auto Complete\"]")
	private WebElement AutoComplete;

	public void AutoComplete() {
		AutoComplete.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"3. Scroll\"]")
	private WebElement scroll;

	public void scroll() {
		scroll.click();
	}

	@AndroidFindBy(id = "io.appium.android.apis:id/edit2")
	private WebElement countryTextfield;

	public void countryTextfield(String country) {
		ScrollTillEnd();
		countryTextfield.sendKeys(country);
	}
	

}
