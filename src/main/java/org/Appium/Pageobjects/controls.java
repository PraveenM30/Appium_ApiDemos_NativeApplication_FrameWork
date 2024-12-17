package org.Appium.Pageobjects;

import org.AppiumUtils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class controls extends AndroidActions{
	AndroidDriver driver;

	public controls(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Controls\"]")
	private WebElement controls;
	public void controls() {
		controls.click();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"6. Holo or Old Theme\"]")
	private WebElement HoloOrOldTheme;
	public void HoloOrOldTheme() {
		HoloOrOldTheme.click();
	}
	@AndroidFindBy(id = "io.appium.android.apis:id/edit")
	private WebElement HintText;
	public void hintText(String hintText) {
		HintText.sendKeys(hintText);
	}
	@AndroidFindBy(id = "io.appium.android.apis:id/check1")
	private WebElement checkbox1;
	@AndroidFindBy(id = "io.appium.android.apis:id/check2")
	private WebElement checkbox2;
	@AndroidFindBy(id = "io.appium.android.apis:id/radio1")
	private WebElement radiobutton1;
	@AndroidFindBy(id = "io.appium.android.apis:id/toggle2")
	private WebElement StarOffButton;
	public void checkboxRadioStar() {
		checkbox1.click();
		checkbox2.click();
		radiobutton1.click();
		StarOffButton.click();
	}
	
	@AndroidFindBy(id = "android:id/text1")
	private WebElement Mercury;
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text=\"Earth\"]")
	private WebElement Earth;
	public void mercuryDropdown() {
		Mercury.click();
		Earth.click();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"(And all inside of a ScrollView!)\"]")
	private WebElement lastMessage;
	public String lastMsg(String scrollTillText) {
		scrollTillText(scrollTillText);
		String msg=lastMessage.getText();
		return msg;
	}

}
