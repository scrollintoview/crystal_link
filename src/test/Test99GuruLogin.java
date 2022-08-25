

package test;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pages.HomePage;
import pages.LoginPage;

public class Test99GuruLogin {
    
    WebDriver driver;
    LoginPage objLogin;
    HomePage objHomePage;
    @Before
    public void setup(){
    	 System.setProperty("webdriver.chrome.driver",
    	  		  "/Users/bipinrajbhandari/Documents/selenium/chromedriver"); 
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
    }
    @Test
    public void test_Home_Page_Appear_Correct(){
    objLogin = new LoginPage(driver);
    String loginPageTitle = objLogin.getLoginTitle();
    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
    objLogin.loginToGuru99("mgr123", "mgr!23");
    objHomePage = new HomePage(driver);
    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
    }
}

