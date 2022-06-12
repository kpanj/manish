package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SkilraryLoginPage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass {
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkilraryLoginPage s = new SkilraryLoginPage(driver);
		s.searchtextbox(pdata.getpropertydata("searchtb"));
		s.searchbutton();
		
		CorejavaPage c = new CorejavaPage(driver);
		c.corejavatab();
		
		WishlistPage w = new WishlistPage(driver);
		driverutilities.switchToFrame(driver);
		w.playbutton();
		Thread.sleep(5000);
		w.pausebutton();
		driverutilities.switchBackToFrame(driver);
		w.wishlistbutton();
		
		
	}
}
