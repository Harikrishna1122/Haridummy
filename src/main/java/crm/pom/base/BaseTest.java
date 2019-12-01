package crm.pom.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import crm.pom.util.Testutil;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	 
	
	public BaseTest() {
		try {
			prop= new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\hpaka\\OneDrive\\Desktop\\"
					+ "Working here\\POM\\src\\main\\java\\crm\\pom\\config\\config.properties");
			
					prop.load(ip);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
			}
		}
	public static void initialization() {
		 String browsername = prop.getProperty("browser");
		 if(browsername.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
				driver= new ChromeDriver();
		 }
	           driver.manage().window().maximize();
	           driver.manage().deleteAllCookies();
	           driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	           driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	           driver.get(prop.getProperty("url"));
	           
	         
	    	
	    	   
		 
	}
	
	}
