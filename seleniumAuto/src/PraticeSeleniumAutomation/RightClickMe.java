package PraticeSeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/buttons";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		WebElement rightClick = driver.findElement(By.xpath("//*[text()='Right Click Me']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", rightClick);
		Actions action = new Actions(driver);
		action.contextClick(rightClick).perform();
		 System.out.println("Right click Context Menu displayed");

	}

}
