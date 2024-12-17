package APIDemos;

import java.io.IOException;
import java.util.HashMap;

import org.Appium.Pageobjects.landingPage;
import org.Appium.Pageobjects.views;
import org.AppiumUtils.BaseClassOriginal;
import org.testng.annotations.Test;

public class AD_TC001 extends BaseClassOriginal {

	@Test(dataProvider = "getJSONData")
	public void scrollAndEnter(HashMap<String, String>input) throws IOException {
		landingPage l = new landingPage(driver);
		l.views();
		views v = new views(driver);
		v.AutoComplete();
		v.scroll();
		v.countryTextfield(input.get("country"));
	}
}
