package seleniumLauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/buttons";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		WebElement dClickMe = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
		action.doubleClick(dClickMe).perform();
		
		
//		Actions action2 = new Actions(driver);
//		WebElement rightclick = driver.findElement(By.xpath(""));
//		WebElement copyOption = driver.findElement(By.xpath(""));
//		action2.moveToElement(rightclick).contextClick().click(copyOption).perform();
//		
//		WebElement dragMe = "";
//		WebElement dropMe = "";
//		action.dragAndDrop(dragMe, dropMe).perform();

	}

}
