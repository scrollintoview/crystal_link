package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest {
	
	WebDriver driver;
	
	@Before
    public void setup(){
    	 System.setProperty("webdriver.chrome.driver",
    	  		  "/Users/bipinrajbhandari/Documents/selenium/chromedriver"); 
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
    }
	
	@Test
	public void TC001() {
		LoginPage login = new LoginPage(driver);
		//test step 1
		login.loginToGuru99("mgr123", "mgr!23");
		//test step 2
		HomePage home= new HomePage(driver);
		String whoIsLoggedIn = home.getHomePageDashboardUserName();
		System.out.println(whoIsLoggedIn);
		boolean match = whoIsLoggedIn.contains("mgr123");
		Assert.assertTrue("Test Fail",match);
		}
	
	@After
	public void close() {
		driver.close();
	}
}


