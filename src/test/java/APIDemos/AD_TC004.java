package APIDemos;

import java.util.HashMap;

import org.Appium.Pageobjects.ExpandableList;
import org.Appium.Pageobjects.landingPage;
import org.AppiumUtils.BaseClassOriginal;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AD_TC004 extends BaseClassOriginal{

	@Test(dataProvider = "getJSONData")
	public void TC4(HashMap<String, String> input) {
		landingPage l=new landingPage(driver);
		l.views();
		ExpandableList e=new ExpandableList(driver);
		e.expandableList();
		e.customAdapter();
		String toastMessage =e.peopleNames();
		Assert.assertEquals(toastMessage, input.get("toastMessage"));
	}
}
