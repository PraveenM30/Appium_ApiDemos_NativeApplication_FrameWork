package APIDemos;

import java.util.HashMap;

import org.Appium.Pageobjects.DragAndDrop;
import org.Appium.Pageobjects.landingPage;
import org.AppiumUtils.BaseClassOriginal;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AD_TC003 extends BaseClassOriginal{

	@Test(dataProvider = "getJSONData")
	public void TC3(HashMap<String, String>input) {
		landingPage l=new landingPage(driver);
		l.views();
		DragAndDrop dd=new DragAndDrop(driver);
		dd.dragAndDrop();
		dd.dragAndDropEle();
		String Msg=dd.dropped();
		Assert.assertEquals(Msg, input.get("dragMessage"));
	}
}
