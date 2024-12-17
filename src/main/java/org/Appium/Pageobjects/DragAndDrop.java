package org.Appium.Pageobjects;

import org.AppiumUtils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DragAndDrop extends AndroidActions{
AndroidDriver driver;
public DragAndDrop(AndroidDriver driver) {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Drag and Drop\"]")
private WebElement dragAndDrop;
public void dragAndDrop() {
	dragAndDrop.click();
}
@AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
private WebElement sourceEle;
@AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_2")
private WebElement targetEle;
public void dragAndDropEle() {
	dragAndDropEle(sourceEle, targetEle, 1000);
}
@AndroidFindBy(id="io.appium.android.apis:id/drag_result_text")
private WebElement dropped;
public String dropped() {
	String droppedMsg=dropped.getText();
	return droppedMsg;
}
	
}
