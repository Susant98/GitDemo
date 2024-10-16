package PraticeSeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiSelectKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/selectable";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		
		WebElement one = driver.findElement(By.xpath("//li[text()='Cras justo odio']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", one);
		WebElement two = driver.findElement(By.xpath("//li[text()='Dapibus ac facilisis in']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", two);
		//WebElement three = driver.findElement(By.xpath("//li[text()='Porta ac consectetur ac']"));
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL)
		            .click(one).click(two)
		            .keyUp(Keys.CONTROL).click();

	}

}
