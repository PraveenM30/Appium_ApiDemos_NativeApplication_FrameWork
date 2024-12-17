package APIDemos;

import java.util.HashMap;

import org.Appium.Pageobjects.Preferences;
import org.Appium.Pageobjects.landingPage;
import org.AppiumUtils.BaseClassOriginal;
import org.testng.annotations.Test;

public class AD_TC005 extends BaseClassOriginal{

	@Test(dataProvider = "getJSONData")
	public void TC5(HashMap<String, String> input) {
		landingPage l=new landingPage(driver);
		l.preferences();
		Preferences p=new Preferences(driver);
		p.preferenceDependencies();
		p.wifi(input.get("wifiPassword"));
	}
}
