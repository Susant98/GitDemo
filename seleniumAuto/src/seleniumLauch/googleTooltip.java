package seleniumLauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class googleTooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement googleSearchBox = driver.findElement(By.name("q"));
		action.moveToElement(googleSearchBox).perform();
		
		String actualText = googleSearchBox.getAttribute("title");
		String expText = "Search";
		
		if(actualText.equals(expText)){
			System.out.println("same");
		}
		
		
		

	}

}
