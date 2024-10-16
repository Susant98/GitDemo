package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		String value = "Java";
		
		WebElement searchBox = driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
		
		action.moveToElement(searchBox)
		              .keyDown(searchBox,Keys.SHIFT)
		              .sendKeys(searchBox,value)
		              .keyUp(searchBox, Keys.SHIFT)
		              .sendKeys(Keys.ENTER).build().perform();

	}

}
