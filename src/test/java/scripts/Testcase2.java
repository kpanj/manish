package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkilraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass {
	@Test
	public void tc2() throws IOException {
		SkilraryLoginPage s = new SkilraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		driverutilities.switchTab(driver);
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		driverutilities.dropDown(sd.getCoursedd(), pdata.getpropertydata("course"));
		
		TestingPage t = new TestingPage(driver);
		driverutilities.draganddrop(driver, t.getSeleniumtraining(), t.getCart());
		Point loc = t.getFacebookicon().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilities.scrollBar(driver, x, y);
		t.facebook();
	}
}
