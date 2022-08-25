package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	    WebDriver driver;
	    
	    By userName = By.name("uid");
	    By userIdWarningText= By.id("message23");
	    By password = By.name("password");
	    By titleText =By.className("barone");
	    By login = By.name("btnLogin");

		public LoginPage(WebDriver driver){ this.driver = driver; }
	    //Set user name in textbox
	    public void setUserName(String strUserName){
	        driver.findElement(userName).sendKeys(strUserName);
	    }
	    //Set password in password textbox
	    public void setPassword(String strPassword){
	         driver.findElement(password).sendKeys(strPassword);
	    }
	    //Click on login button
	    public void clickLogin(){
	            driver.findElement(login).click();
	    }

	    //Get the title of Login Page
	    public String getLoginTitle(){
	     return    driver.findElement(titleText).getText();
	    }
	    public void loginToGuru99(String strUserName,String strPasword){
	        //Fill user name
	        this.setUserName(strUserName);
	        //Fill password
	        this.setPassword(strPasword);
	        //Click Login button
	        this.clickLogin();        
	    }

	}

