package test;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	
	
	@Test
	public void test1() {

		  System.setProperty("webdriver.chrome.driver",
		  "/Users/bipinrajbhandari/Documents/selenium/chromedriver"); WebDriver driver
		  = new ChromeDriver(); String baseUrl =
		  "http://demo.guru99.com/test/newtours/"; String expectedTitle =
		  "Welcome: Mercury Tours"; String actualTitle = ""; driver.get(baseUrl);
		  //Thread.sleep(15000); actualTitle = driver.getTitle();
		  System.out.println(actualTitle);
		  
		  System.out.println(expectedTitle);
		  
		  WebElement userName =
		  driver.findElement(By.cssSelector("input[name='userName']")); WebElement
		  password = driver.findElement(By.cssSelector("input[name='password']"));
		  userName.sendKeys("userName"); password.sendKeys("password");
		  
		  List <WebElement> textBoxes = driver.findElements(By.cssSelector(
		  "input[name='password'],input[name='userName']")); for(WebElement textBox :
		  textBoxes) { textBox.clear(); textBox.sendKeys("any text"); } List
		  <WebElement> projects = driver.findElements(By.cssSelector(
		  "a[href='http://demo.guru99.com/Agile_Project/Agi_V1/'],a[href='http://demo.guru99.com/V1/index.php']"
		  )); 
		  for(WebElement project : projects) {
		  if(project.getText().equalsIgnoreCase("agile")==true) {
		  System.out.println("agile PROJECT link found in UI"); }
		  if(project.getText().equals("agile PRoject")==false) {
		  System.out.println("agile PRoject not found in UI"); }
		  if(project.getText().compareTo("Agile Project")>-1) {
		  System.out.println("Clicking on "+project.getText()); project.click(); } }
		 
    
    for(int i = 1; i<= 5; i++){
	  //System.out.println(i);
    }
    int apple = 1;
    int z=0;
    while(apple <= 5) {
    	//System.out.println("Bipin eat :" + apple + " apple(s)");
    	apple++;
    	}
    
    int oranges =10;
		do {
			oranges = oranges -1;
			System.out.println("Oranges left in bag :"+ oranges);  
		} while (oranges < 6);
	}
	

    
	
	
	
	
}
