package PraticeSeleniumAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/browser-windows";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		WebElement newBrowser = driver.findElement(By.xpath("//*[text()='New Tab']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", newBrowser);
		
		
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterator = windowId.iterator();
////		
		String homePage = iterator.next();
		String newPage = iterator.next();
////		
		driver.switchTo().window(newPage);
		driver.manage().window().maximize();
		Thread.sleep(4000);
//		
		driver.close();
		driver.switchTo().window(homePage);
		WebElement newBrowser2 = driver.findElement(By.id("windowButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", newBrowser2);
		
		Thread.sleep(4000);
		driver.close();

		

	}

}
