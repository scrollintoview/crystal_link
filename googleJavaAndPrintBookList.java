package googleSearch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleJavaAndPrintBookList {

	public static void main(String[] args) throws InterruptedException {
		// declaration and instantiation of objects/variables
		// System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//	WebDriver driver = new FirefoxDriver();
		// Chrome Driver declaration below : 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.google.com/";
		String expectedTitle = "Google";
		String actualTitle = "";

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();

		/*
		 * compare the actual title of the page with the expected one and print the
		 * result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Google Title Test Passed!");
		} else {
			System.out.println("Google Title Test Failed");
		}

		System.out.println("Searching for 'Java' in Google searchbox..");

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java");
		searchBox.sendKeys(Keys.ENTER);

		WebElement searchResult = driver.findElement(By.id("result-stats"));
		System.out.println(searchResult.getText() + " items found for the search.");

		System.out.println("Cliking the Books link");
		WebElement booksLink = driver.findElement(By.linkText("Books"));
		booksLink.click();

		System.out.println("Books Page Loaded");
		Thread.sleep(3000);
		WebElement book1 = driver.findElement(By.partialLinkText("Think Java"));

		// System.out.println(book1.getClass());
		System.out.println("Accessible Name is : " + book1.getAccessibleName());

		// List<WebElement> bookList = driver.findElements(By.cssSelector("LC20lb MBeuO
		// DKV0Md"));
		List<WebElement> bookList = driver.findElements(By.xpath("//h3[@class = 'LC20lb MBeuO DKV0Md']"));

		System.out.println("Total books listed in page 1 : " + bookList.size());
		// for(int i =0; i < bookList.size(); i++) {
		int i = 0; 

		for (WebElement book : bookList) { // using for-each loop here..reads as - for each book in bookList
			System.out.println("Book " + (i + 1) + ": " + bookList.get(i).getText());
			i++;
		}
		driver.close();
		// driver.quit();
	}

}
