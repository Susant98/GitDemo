package PraticeSeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {
	// TODO Auto-generated method stub
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			String url = "https://jqueryui.com/tooltip/";
			// Launch the application
			driver.get(url);
			// Maximize the application
			driver.manage().window().maximize();
			
//             JavascriptExecutor js = (JavascriptExecutor) driver;
//             js.executeScript("window.scrollBy(0,250)", "");


			WebElement ele = driver.findElement(By.xpath("//*[@id='age']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			
			WebElement toolTipEle = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']/div"));

	        String toolTipTxt = toolTipEle.getText();
	        System.out.println(toolTipTxt);
			
			
			
	}

}
