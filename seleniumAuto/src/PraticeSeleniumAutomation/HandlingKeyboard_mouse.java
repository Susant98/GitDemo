package PraticeSeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyboard_mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/droppable";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		WebElement dragMe = driver.findElement(By.id("draggable"));
				
	    WebElement dropMe = driver.findElement(By.id("droppable"));
	    
	    Actions action = new Actions(driver);
	    action.dragAndDrop(dragMe, dropMe).perform();

	}

}
