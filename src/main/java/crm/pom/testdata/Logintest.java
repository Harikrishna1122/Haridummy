package crm.pom.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crm.pom.base.BaseTest;
import crm.pom.pages.Homepage;
import crm.pom.pages.Loginpage;

public class Logintest extends BaseTest {
	Loginpage Loginpage;
	Homepage homepage;
	
	
	public Logintest() {
		super();
		
	}
	 @BeforeMethod
	 public void setup() {
		 initialization();
		Loginpage= new Loginpage();
	}
	 
	 @Test(priority=1)
	 public void loginPageTitleTest() {
		String title= Loginpage.validateloginpagetitle();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
		 
	 }
	 @Test(priority=2)
	 public void crmlogoimagetest() {
		 boolean flag=Loginpage.validateCRMLogo();
		 Assert.assertTrue(flag);
	 }
	 @Test(priority=3)
	 public void login() {
		homepage= Loginpage.loginToFreeCRMApp(prop.getProperty("username"), prop.getProperty("password"));
	 }
	 
	 @AfterMethod
	 public void teardown(){
		 driver.quit();
		 
		 
	 }
	 

}
