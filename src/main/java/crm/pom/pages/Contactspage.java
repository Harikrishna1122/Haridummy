package crm.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm.pom.base.BaseTest;

public class Contactspage extends BaseTest{
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement contactslogo;
	@FindBy(xpath="//td[contains(text(),'Harikrishna Pakalapati')]")
	WebElement contacthari ;
	
	public Contactspage() {
		PageFactory.initElements(driver, this);
	}

	public boolean checkcontactspage() {
		 return contactslogo.isDisplayed();
		
	}
	public boolean SelectThecontact() {
		return contacthari.isSelected();
		
	}
}
