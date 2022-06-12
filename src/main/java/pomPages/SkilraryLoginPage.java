package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkilraryLoginPage {
	@FindBy(name="q")
	private WebElement searchtab;
	
	@FindBy(xpath="//input[@value=\"go\"]")
	private WebElement gobtn;
	
	
	@FindBy(xpath=" //a[text()=' GEARS ']")
	private WebElement gearsbtn;
		
	@FindBy(xpath="( //a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	public SkilraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearsbutton() {
		gearsbtn.click();
	}
	public void skillrarydemoapplication() {
		skillrarydemoapp.click();
	}
	
	public void searchtextbox(String name) {
		searchtab.sendKeys(name);
	}
	
	public void searchbutton() {
		gobtn.click();
		
	}
}
