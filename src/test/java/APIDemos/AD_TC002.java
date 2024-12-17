package APIDemos;

import java.util.HashMap;

import org.Appium.Pageobjects.controls;
import org.Appium.Pageobjects.landingPage;
import org.Appium.Pageobjects.views;
import org.AppiumUtils.BaseClassOriginal;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AD_TC002 extends BaseClassOriginal {

	@Test(dataProvider = "getJSONData")
	public void TC2(HashMap<String, String>input) {
		landingPage l=new landingPage(driver);
		l.views();
		
		controls c=new controls(driver);
		c.controls();
		c.HoloOrOldTheme();
		c.hintText(input.get("hintText"));
		c.checkboxRadioStar();
		c.mercuryDropdown();
		String msg=c.lastMsg(input.get("scrollMessage"));
		Assert.assertEquals(msg, input.get("scrollMessage"));
	}
}
