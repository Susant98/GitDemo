package PraticeSeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/tool-tips";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		
		WebElement tool = driver.findElement(By.id("toolTipTextField"));
		Actions action = new Actions(driver);
		action.moveToElement(tool).perform();
		
       WebElement toolTip = driver.findElement(By.xpath("//input[@aria-describedby='textFieldToolTip']")); 
		
		// To get the tool tip text and assert 
		String toolTipText = toolTip.getText();
		System.out.println("toolTipText-->"+toolTipText);

	}

}
