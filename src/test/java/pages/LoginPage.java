package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By usernameElement = By.name("uid");
	By passwordElement = By.name("password");
	By loginElement = By.name("btnLogin");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	 //user name in textbox
	private void setUserName(String username) {
		driver.findElement(usernameElement).sendKeys(username);
	}
	
	//Set password in password textbox
	private void setPassword(String password) {
		driver.findElement(passwordElement).sendKeys(password);
	}
	
	private void clickLogin() {
		driver.findElement(loginElement).click();
	}
	
	//Get the title of Login Page
	
    public String getLoginTitle(){
    	return driver.getTitle();
    }
    
	
    public void loginToGuru99(String username,String password){
        //Fill user name
        this.setUserName(username);
        //Fill password
        this.setPassword(password);
        //Click Login button
        this.clickLogin();        
    }
	
	
	

}
