package crm.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import crm.pom.base.BaseTest;

public class Loginpage extends BaseTest{
	
	
@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
WebElement loginbutton1;

@FindBy(xpath="//div[@class='rd-navbar-brand']//a[@title='free crm home']")
WebElement crmlogo;

@FindBy(xpath="//input[@name='email']")
WebElement logintextbox;
@FindBy(xpath="//input[@name='password']")
WebElement passwordtextbox;



@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
WebElement Userlogin2;
public Loginpage() {
	PageFactory.initElements(driver, this);
}
public String validateloginpagetitle() {
	return driver.getTitle();
	
}
public boolean validateCRMLogo() {
	 return crmlogo.isDisplayed();
	 }
public Homepage loginToFreeCRMApp(String userName,String password) {
	loginbutton1.click();
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(logintextbox));
	logintextbox.sendKeys(userName);
	passwordtextbox.sendKeys(password);
	Userlogin2.click();	
  return new Homepage();
  
	  
}

}
