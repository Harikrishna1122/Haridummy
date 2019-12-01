package crm.pom.testdata;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import crm.pom.base.BaseTest;
import crm.pom.pages.Contactspage;
import crm.pom.pages.Homepage;
import crm.pom.pages.Loginpage;
import crm.pom.util.Testutil;

public class HomepageTest extends BaseTest {
	Loginpage Loginpage;
	Homepage homepage;
	Contactspage contactspage;
	Testutil testutil;
	
	public  HomepageTest() {
      super();
      }
	
	@BeforeTest
	 public void setup() {
		 initialization();
		Loginpage= new Loginpage();
		contactspage=new Contactspage();
		testutil = new Testutil();
	homepage=Loginpage.loginToFreeCRMApp(prop.getProperty("username"), prop.getProperty("password"));
	
		
	}
	
	@Test
	public void verifyhomepagetitile() {
	homepage.validateHomepagetitle();
	homepage.Usernameisvalidated();
	contactspage= homepage.Clinkoncontacts();
		 
	 }
	
	
	 @AfterTest
	 public void close() {
	driver.close();
	 }

}
