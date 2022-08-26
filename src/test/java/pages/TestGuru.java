package pages;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestGuru {
	
	WebDriver driver;
	
	//Title Expectation
	String expectedTitle = "Guru";
	
	// Enter Username and Password
	String userName = "mgr123";
	String password ="mgr!23";
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
	}
	
	@Test
	public void loginTest() {
		
		LoginPage objGuruLoginPage = new LoginPage(driver);
		
		// CONFIRM TITLE of Guru
		String ActualTitle = objGuruLoginPage.getLoginTitle();
		Assert.assertTrue(expectedTitle + ": Title Not Found", ActualTitle.contains(expectedTitle));
		
		// LOGIN TEST
		objGuruLoginPage.loginToGuru99(userName, password);

		// Dashboard Test
		DashboardPage objGuruDashboard = new DashboardPage(driver);
		String whoIsLoggedIn = objGuruDashboard.getHomePageDashboardUserName();
		System.out.println(whoIsLoggedIn);
		boolean match = whoIsLoggedIn.contains(userName);
		Assert.assertTrue("Test Fail",match);
		

	}
	
	@After
  	public void close(){
      driver.close();
  	}
	

	
}
