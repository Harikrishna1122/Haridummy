package crm.pom.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crm.pom.base.BaseTest;
import crm.pom.pages.Contactspage;
import crm.pom.pages.Homepage;
import crm.pom.pages.Loginpage;
import crm.pom.util.Testutil;

public class ContactsTest extends BaseTest {
	Loginpage Loginpage;
	Homepage homepage;
	Contactspage contactspage;
	Testutil testutil;
	
	
	public  ContactsTest() {
      super();
      }
	
	@BeforeMethod
	 public void setup() {
		 initialization();
		 testutil = new Testutil();
		 Loginpage= new Loginpage();
			contactspage=new Contactspage();
			homepage=Loginpage.loginToFreeCRMApp(prop.getProperty("username"), prop.getProperty("password"));
		contactspage=	homepage.Clinkoncontacts();
	}
	@Test(priority=1)
	public void checkcontactslabel() {
		Assert.assertTrue(contactspage.checkcontactspage(),"contacts label is missing"); 
	}
	
	
	/*
	 * @Test(priority=2) public void checkthecontact() {
	 * Assert.assertTrue(contactspage.SelectThecontact(),"contact is npot displayed"
	 * ); }
	 */
	 
	

	 @AfterMethod
	 public void teardown(){
		 driver.quit();
		 
		 
	 }
	
}