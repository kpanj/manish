package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCartBtn;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkilraryLoginPage;


public class Testcase1 extends BaseClass{
	@Test
	public void tc1() {
		SkilraryLoginPage s =new SkilraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		driverutilities.switchTab(driver);
		driverutilities.mouseHover(driver, sd.getcoursebtn());
		sd.seleniumtrainingbutton();
		
		AddToCartBtn a = new AddToCartBtn(driver);
		driverutilities.doubleClick(driver, a.getPlusbtn());
		a.addtocartbutton();
		driverutilities.alertPop(driver);
	}
}
 