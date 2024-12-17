package org.Appium.Pageobjects;

import org.AppiumUtils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExpandableList extends AndroidActions {
	AndroidDriver driver;

	public ExpandableList(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Expandable Lists\"]")
	private WebElement expandableList;
	public void expandableList() {
		expandableList.click();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")
	private WebElement customAdapter;
	public void customAdapter() {
		customAdapter.click();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"People Names\"]")
	private WebElement peopleNames;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Sample action\"]")
	private WebElement sampleMenu;
	@AndroidFindBy(xpath= "(//android.widget.Toast)[1]")
	private WebElement toastMessage;
	public String peopleNames() {
		longPress(peopleNames);
		sampleMenu.isDisplayed();
		sampleMenu.click();
		waitTillPresenceOfWebElement("(//android.widget.Toast)[1]");
		return toastMessage.getText();
	}

}
