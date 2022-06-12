package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;
	
	@FindBy(id="mycart")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getFacebookicon() {
		return facebookicon;
	}
	
	public void facebook() {
		facebookicon.click();
	}
}
