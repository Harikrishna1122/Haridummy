package crm.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm.pom.base.BaseTest;

public class Homepage extends BaseTest {

	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement userdisplayname;
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contacts;
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement Deals;
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomepagetitle() {
		return driver.getTitle();
	}
	
	public boolean  Usernameisvalidated() {
		return userdisplayname.isDisplayed();
		
		
	}
	public Contactspage Clinkoncontacts() {
		contacts.click();
		return new Contactspage();
		
	}
	
	public Dealspage ClinkonDeals() {
		Deals.click();
		return  new Dealspage();
		}
	
	
	
}

